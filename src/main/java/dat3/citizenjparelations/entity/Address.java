package dat3.citizenjparelations.entity;

import jakarta.persistence.*;
import lombok.*;

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

  public Address(String street, String zip, String city) {
    this.street = street;
    this.zip = zip;
    this.city = city;
  }
}
