package dat3.citizenjparelations.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;

  String street;
  String zip;
  String city;

  @OneToMany(mappedBy = "address", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  //@JoinColumn(name = "address_id")
  List<Citizen> citizens;

  public Address(String street, String zip, String city) {
    this.street = street;
    this.zip = zip;
    this.city = city;
  }

  public void addCitizen(Citizen c) {
    if(citizens == null) {
      citizens = new ArrayList<>();
    }
    citizens.add(c);
    c.setAddress(this);
  }
}
