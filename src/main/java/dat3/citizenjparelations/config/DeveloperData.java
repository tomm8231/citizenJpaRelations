package dat3.citizenjparelations.config;

import dat3.citizenjparelations.entity.Address;
import dat3.citizenjparelations.entity.Citizen;
import dat3.citizenjparelations.entity.Town;
import dat3.citizenjparelations.repository.AddressRepository;
import dat3.citizenjparelations.repository.CitizenRepository;
import dat3.citizenjparelations.repository.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

  }
}
