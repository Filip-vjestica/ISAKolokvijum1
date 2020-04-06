package filip.vjestica.kolokvijum.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filip.vjestica.kolokvijum.DTO.KnjigaDTO;
import filip.vjestica.kolokvijum.Model.Knjiga;
import filip.vjestica.kolokvijum.Service.KnjigaService;


@Controller
@RequestMapping(path = "/api/knjige")
@CrossOrigin
public class KnjigaController {
	
	@Autowired
	private KnjigaService knjigaService;
	
	@RequestMapping(path = "",method = RequestMethod.GET)
	public ResponseEntity<Iterable<KnjigaDTO>> getAllKnjige(){
		List<KnjigaDTO> knjige = new ArrayList<KnjigaDTO>();
		for(Knjiga n : knjigaService.findAll()) {
			knjige.add(new KnjigaDTO(n));
		}
		return new ResponseEntity<Iterable<KnjigaDTO>>(knjige,HttpStatus.OK);
	}
	
	@RequestMapping(path = "", method = RequestMethod.POST)
	public ResponseEntity<Knjiga> createKnjiga(@RequestBody Knjiga noviknjiga){
		if(knjigaService.findOne(noviknjiga.getId()) != null) {
			return new ResponseEntity<Knjiga>(HttpStatus.CONFLICT);
		}
		knjigaService.save(noviknjiga);
		return new ResponseEntity<Knjiga>(noviknjiga,HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Knjiga> updateKnjiga(@PathVariable("id") Long id,@RequestBody Knjiga podaciKnjige){
		Knjiga knjiga = knjigaService.findOne(id);
		if(knjiga == null) {
			return new ResponseEntity<Knjiga>(HttpStatus.NOT_FOUND);
		}
		knjiga.setNaslov(podaciKnjige.getNaslov());
		return new ResponseEntity<Knjiga>(knjiga,HttpStatus.OK);
	}
	
	@RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteKnjiga(@PathVariable("id") Long id){
		if(knjigaService.findOne(id)==null) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
		knjigaService.remove(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	

}
