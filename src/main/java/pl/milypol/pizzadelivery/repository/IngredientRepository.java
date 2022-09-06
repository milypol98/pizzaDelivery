package pl.milypol.pizzadelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.pizzadelivery.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient,Integer >{

}
