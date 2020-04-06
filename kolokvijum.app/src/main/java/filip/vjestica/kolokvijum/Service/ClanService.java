package filip.vjestica.kolokvijum.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import filip.vjestica.kolokvijum.Model.Clan;
import filip.vjestica.kolokvijum.Repository.ClanRepository;

@Service
public class ClanService {
	
	@Autowired
	ClanRepository clanRepository;
	
	public Iterable<Clan> findAll(){
		return clanRepository.findAll();
	}
	
	public Clan findOne(Long id) {
		return clanRepository.findById(id).orElse(null);
	}
	
	public void remove(Long id) {
		clanRepository.deleteById(id);
	}
	
	public Clan save(Clan clan) {
		return clanRepository.save(clan);
	}

}
