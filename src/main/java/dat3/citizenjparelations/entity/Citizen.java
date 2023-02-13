package dat3.citizenjparelations.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
public class Citizen {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String firstName;
  String lastName;
  String email;
  String phone;

  @ManyToOne
  Address address;

  @ManyToOne(cascade = CascadeType.PERSIST)
  Town town;

  public Citizen(String firstName, String lastName, String email, String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
  }
}
