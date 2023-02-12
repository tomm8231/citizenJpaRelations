package dat3.citizenjparelations.config;

import dat3.citizenjparelations.entity.Address;
import dat3.citizenjparelations.entity.Citizen;
import dat3.citizenjparelations.entity.Town;
import dat3.citizenjparelations.repository.AddressRepository;
import dat3.citizenjparelations.repository.CitizenRepository;
import dat3.citizenjparelations.repository.TownRepository;
import dat3.citizenjparelations.service.AddressService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeveloperData implements ApplicationRunner {

  AddressRepository addressRepository;
  CitizenRepository citizenRepository;
  TownRepository townRepository;
  AddressService addressService;

  public DeveloperData(AddressRepository ar, CitizenRepository cr, TownRepository tr, AddressService as) {
    this.addressRepository = ar;
    this.citizenRepository = cr;
    this.townRepository = tr;
    this.addressService = as;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {

    Address a1 = new Address("Lyngbyvej 1", "Lyngby", "2800");
    Citizen citizen1 = new Citizen("Kurt", "Wonnegut", "a@b.dk","123");
    Citizen citizen2 = new Citizen("Hanne", "Wonnegut", "h@b.dk", "234");

    a1.addCitizen(citizen1);
    a1.addCitizen(citizen2);

    addressRepository.save(a1);//Save the address

/*
    System.out.println("------- Select statements starts here ------------");
    Address address_1 = addressRepository.findById(a1.getId()).get();
    System.out.println(address_1.getStreet());
    System.out.println("Press Enter to continue");

    System.in.read();  //This will block so you have time to read the DEBUG statements
    System.out.println("Citizens: "+address_1.getCitizens().size());



    addressService.printFullAddressInfo(address_1.getId(), true);

 */




  }
}
