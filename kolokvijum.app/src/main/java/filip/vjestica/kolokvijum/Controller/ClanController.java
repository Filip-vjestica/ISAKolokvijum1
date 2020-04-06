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

import filip.vjestica.kolokvijum.DTO.ClanDTO;
import filip.vjestica.kolokvijum.Model.Clan;
import filip.vjestica.kolokvijum.Service.ClanService;

@Controller
@RequestMapping(path = "/api/clanovi")
@CrossOrigin
public class ClanController {
	
	@Autowired
	private ClanService clanService;
	
	@RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteClan(@PathVariable("id") Long id){
		if(clanService.findOne(id)==null) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
		clanService.remove(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping(path = "",method = RequestMethod.GET)
	public ResponseEntity<Iterable<ClanDTO>> getAllClanovi(){
		List<ClanDTO> clanovi = new ArrayList<ClanDTO>();
		for(Clan n : clanService.findAll()) {
			clanovi.add(new ClanDTO(n));
		}
		return new ResponseEntity<Iterable<ClanDTO>>(clanovi,HttpStatus.OK);
	}
	
	@RequestMapping(path = "/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Clan> updateClan(@PathVariable("id") Long id,@RequestBody Clan podaciClanova){
		Clan clan = clanService.findOne(id);
		if(clan == null) {
			return new ResponseEntity<Clan>(HttpStatus.NOT_FOUND);
		}
		clan.setIme(podaciClanova.getIme());
		return new ResponseEntity<Clan>(clan,HttpStatus.OK);
	}

}
