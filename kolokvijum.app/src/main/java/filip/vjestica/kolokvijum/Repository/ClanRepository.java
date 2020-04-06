package filip.vjestica.kolokvijum.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import filip.vjestica.kolokvijum.Model.Clan;

@Repository
public interface ClanRepository extends PagingAndSortingRepository<Clan, Long> {

}
