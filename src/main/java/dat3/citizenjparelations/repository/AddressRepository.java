package dat3.citizenjparelations.repository;

import dat3.citizenjparelations.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
