package pl.milypol.pizzadelivery.entity;

import lombok.Data;
import pl.milypol.pizzadelivery.enums.Pay;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String street;
    private String city;
    private String BuldingNumber;
    private String ApartmentNumber;
    private String ZipCode;
    private Pay pay;

}
