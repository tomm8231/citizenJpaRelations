package dat3.citizenjparelations.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Town {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String name;
  String zipCode;
  String mayor;
  int schools;

  public Town(String name, String zipCode, String mayor, int schools) {
    this.name = name;
    this.zipCode = zipCode;
    this.mayor = mayor;
    this.schools = schools;
  }
}

