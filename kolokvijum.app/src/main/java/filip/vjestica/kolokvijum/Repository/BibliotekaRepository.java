package filip.vjestica.kolokvijum.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import filip.vjestica.kolokvijum.Model.Biblioteka;


@Repository
public interface BibliotekaRepository extends PagingAndSortingRepository<Biblioteka, Long>{
	
	

}
