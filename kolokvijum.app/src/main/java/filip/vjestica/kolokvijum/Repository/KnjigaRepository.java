package filip.vjestica.kolokvijum.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import filip.vjestica.kolokvijum.Model.Knjiga;

@Repository
public interface KnjigaRepository extends PagingAndSortingRepository<Knjiga, Long> {

}
