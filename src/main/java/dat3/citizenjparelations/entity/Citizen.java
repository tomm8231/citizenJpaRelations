package dat3.citizenjparelations.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Citizen {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  String firstName;
  String lastName;
  String email;
  String phone;
  @ManyToOne
  Address address;

  public Citizen(String firstName, String lastName, String email, String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
  }
}
