package dat3.citizenjparelations.repository;

import dat3.citizenjparelations.entity.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownRepository extends JpaRepository<Town,Integer> {
}
