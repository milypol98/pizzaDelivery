package pl.milypol.pizzadelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.pizzadelivery.entity.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza , Integer> {
}
