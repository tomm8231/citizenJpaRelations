package dat3.citizenjparelations.repository;

import dat3.citizenjparelations.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen,Integer> {
  List<Citizen> getAllByTownId(int townId);
}
