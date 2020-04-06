package filip.vjestica.kolokvijum.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filip.vjestica.kolokvijum.Model.Knjiga;
import filip.vjestica.kolokvijum.Repository.KnjigaRepository;

@Service
public class KnjigaService {
	
	@Autowired
	KnjigaRepository knjigaRepository;
	
	public Iterable<Knjiga> findAll(){
		return knjigaRepository.findAll();
	}
	
	public Knjiga findOne(Long id) {
		return knjigaRepository.findById(id).orElse(null);
	}
	
	public void remove(Long id) {
		knjigaRepository.deleteById(id);
	}
	
	public Knjiga save(Knjiga knjiga) {
		return knjigaRepository.save(knjiga);
	}

}
