package filip.vjestica.kolokvijum.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import filip.vjestica.kolokvijum.Model.Biblioteka;
import filip.vjestica.kolokvijum.Repository.BibliotekaRepository;

@Service
public class BibliotekaService {
	
	@Autowired
	BibliotekaRepository bibliotekaRepository;
	
	public Iterable<Biblioteka> findAll(){
		return bibliotekaRepository.findAll();
	}
	
	public Biblioteka findOne(Long id) {
		return bibliotekaRepository.findById(id).orElse(null);
	}
	
	public void remove(Long id) {
		bibliotekaRepository.deleteById(id);
	}
	
	public Biblioteka save(Biblioteka biblioteka) {
		return bibliotekaRepository.save(biblioteka);
	}

}
