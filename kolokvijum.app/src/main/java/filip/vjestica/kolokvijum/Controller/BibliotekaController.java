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

import filip.vjestica.kolokvijum.DTO.BibliotekaDTO;
import filip.vjestica.kolokvijum.Model.Biblioteka;
import filip.vjestica.kolokvijum.Service.BibliotekaService;

@Controller
@RequestMapping(path = "/api/biblioteke")
@CrossOrigin
public class BibliotekaController {
	
	@Autowired
	private BibliotekaService bibliotekaService;
	
	@RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteBiblioteka(@PathVariable("id") Long id){
		if(bibliotekaService.findOne(id)==null) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
		bibliotekaService.remove(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping(path = "",method = RequestMethod.GET)
	public ResponseEntity<Iterable<BibliotekaDTO>> getAllBiblioteke(){
		List<BibliotekaDTO> biblioteke = new ArrayList<BibliotekaDTO>();
		for(Biblioteka n : bibliotekaService.findAll()) {
			biblioteke.add(new BibliotekaDTO(n));
		}
		return new ResponseEntity<Iterable<BibliotekaDTO>>(biblioteke,HttpStatus.OK);
	}
	
	@RequestMapping(path = "/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Biblioteka> updateBiblioteka(@PathVariable("id") Long id,@RequestBody Biblioteka podaciBiblioteke){
		Biblioteka bibli = bibliotekaService.findOne(id);
		if(bibli == null) {
			return new ResponseEntity<Biblioteka>(HttpStatus.NOT_FOUND);
		}
		bibli.setNaziv(podaciBiblioteke.getNaziv());
		return new ResponseEntity<Biblioteka>(bibli,HttpStatus.OK);
	}

}
