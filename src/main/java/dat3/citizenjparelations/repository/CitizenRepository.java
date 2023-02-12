package dat3.citizenjparelations.repository;

import dat3.citizenjparelations.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen,Integer> {
}
