package filip.vjestica.kolokvijum.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filip.vjestica.kolokvijum.DTO.IznajmljivanjeDTO;
import filip.vjestica.kolokvijum.Model.Iznajmljivanje;
import filip.vjestica.kolokvijum.Service.IznajmljivanjeService;

@Controller
@RequestMapping(path = "/api/iznajmljivanja")
@CrossOrigin
public class IznajmljivanjeController {
	
	@Autowired
	private IznajmljivanjeService iznajmljivanjeService;
	
	@RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteIznajmljivanje(@PathVariable("id") Long id){
		if(iznajmljivanjeService.findOne(id)==null) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
		iznajmljivanjeService.remove(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping(path = "",method = RequestMethod.GET)
	public ResponseEntity<Iterable<IznajmljivanjeDTO>> getAllIznajmljivanja(){
		List<IznajmljivanjeDTO> iznajmljivanja = new ArrayList<IznajmljivanjeDTO>();
		for(Iznajmljivanje n : iznajmljivanjeService.findAll()) {
			iznajmljivanja.add(new IznajmljivanjeDTO(n));
		}
		return new ResponseEntity<Iterable<IznajmljivanjeDTO>>(iznajmljivanja,HttpStatus.OK);
	}
	
	

}
