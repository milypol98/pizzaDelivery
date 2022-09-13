package pl.milypol.pizzadelivery.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 5, message = "Name have to minimal 5 signs")
    private String name;
    private Date createdAt;
    @OneToMany //Może bys lepsze many to many zmenic najwyzej potem
    @Size(min = 5, message = "you have to change minimal one component ")
    private List<Ingredient> ingredients;
    @PrePersist
    void createdAt(){
        this.createdAt =new Date();
    }
}
