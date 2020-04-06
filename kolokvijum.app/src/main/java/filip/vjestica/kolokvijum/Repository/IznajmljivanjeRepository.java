package filip.vjestica.kolokvijum.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import filip.vjestica.kolokvijum.Model.Iznajmljivanje;

@Repository
public interface IznajmljivanjeRepository extends PagingAndSortingRepository<Iznajmljivanje, Long>{

}
