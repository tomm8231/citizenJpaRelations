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
  int id;
  @Column(nullable = false)
  String street;
  @Column(nullable = false)
  String zip;
  @Column(nullable = false)
  String city;
  @OneToMany
  List<Citizen> citizens = new ArrayList(); //Skal denne være i constructor?


  public Address(String street, String city, String zip) {
    this.street = street;
    this.zip = zip;
    this.city = city;
  }

  public void addCitizen(Citizen c) {
    citizens.add(c);
  }
}
