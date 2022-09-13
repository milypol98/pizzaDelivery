package pl.milypol.pizzadelivery.controler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.milypol.pizzadelivery.entity.Ingredient;
import pl.milypol.pizzadelivery.entity.Pizza;
import pl.milypol.pizzadelivery.enums.Type;
import pl.milypol.pizzadelivery.repository.IngredientRepository;
import pl.milypol.pizzadelivery.repository.PizzaRepository;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@Slf4j
@RequestMapping("/design")
public class DesignPizzaController {
    private final IngredientRepository ingredientRepository;
    private final PizzaRepository pizzaRepository;

    public DesignPizzaController(IngredientRepository ingredientRepository, PizzaRepository pizzaRepository) {
        this.ingredientRepository = ingredientRepository;
        this.pizzaRepository = pizzaRepository;
    }


    @GetMapping
    public String showDesignForm(Model model) {
        List<Ingredient> ingredients = ingredientRepository.findAll();
        Type[] types = Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));

        }
        model.addAttribute("design",new Pizza());
        return "design";
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
