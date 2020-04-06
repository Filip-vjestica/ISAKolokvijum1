package filip.vjestica.kolokvijum.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filip.vjestica.kolokvijum.Model.Iznajmljivanje;
import filip.vjestica.kolokvijum.Repository.IznajmljivanjeRepository;

@Service
public class IznajmljivanjeService {
	
	@Autowired
	IznajmljivanjeRepository iznajmljivanjeRepository;
	
	public Iterable<Iznajmljivanje> findAll(){
		return iznajmljivanjeRepository.findAll();
	}
	
	public Iznajmljivanje findOne(Long id) {
		return iznajmljivanjeRepository.findById(id).orElse(null);
	}
	
	public void remove(Long id) {
		iznajmljivanjeRepository.deleteById(id);
	}
	
	public Iznajmljivanje save(Iznajmljivanje iznaj) {
		return iznajmljivanjeRepository.save(iznaj);
	}

}
