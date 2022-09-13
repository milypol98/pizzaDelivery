package pl.milypol.pizzadelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milypol.pizzadelivery.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
