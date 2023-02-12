package dat3.citizenjparelations.service;

import dat3.citizenjparelations.entity.Address;
import dat3.citizenjparelations.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {
  @Autowired
  AddressRepository addressRepository;

  @Transactional
  public void printFullAddressInfo(int id, boolean includeCitizens) {
    Address address_1 = addressRepository.findById(id).get();
    System.out.println(address_1.getStreet());
    if (includeCitizens) {
      System.out.println("Citizens: " + address_1.getCitizens().size());
    }
  }
}
