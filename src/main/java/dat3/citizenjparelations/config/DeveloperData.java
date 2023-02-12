package dat3.citizenjparelations.config;

import dat3.citizenjparelations.entity.Address;
import dat3.citizenjparelations.entity.Citizen;
import dat3.citizenjparelations.entity.Town;
import dat3.citizenjparelations.repository.AddressRepository;
import dat3.citizenjparelations.repository.CitizenRepository;
import dat3.citizenjparelations.repository.TownRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeveloperData implements ApplicationRunner {

  AddressRepository addressRepository;
  CitizenRepository citizenRepository;
  TownRepository townRepository;

  public DeveloperData(AddressRepository ar, CitizenRepository cr, TownRepository tr) {
    this.addressRepository = ar;
    this.citizenRepository = cr;
    this.townRepository = tr;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {

    Address a1 = new Address("Lyngbyvej 1", "Lyngby", "2800");

    Citizen citizen1 = new Citizen("Kurt", "Wonnegut", "a@b.dk", "123");
    Citizen citizen2 = new Citizen("Hanne", "Wonnegut", "h@b.dk", "234");

    a1.addCitizen(citizen1);
    a1.addCitizen(citizen2);

    addressRepository.save(a1);


  }
}
