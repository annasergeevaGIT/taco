package tacos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tacos.data.IngredientRepository;

@SpringBootApplication //include: @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan(@Component, @Controller и @Service)
public class TacoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(IngredientRepository repo) {
		return args -> {
			repo.save(new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP, 1.00));
			repo.save(new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP, 0.90));
			repo.save(new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN, 2.50));
			repo.save(new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN, 2.75));
			repo.save(new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES, 0.50));
			repo.save(new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES, 0.50));
			repo.save(new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE, 0.75));
			repo.save(new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE, 0.80));
			repo.save(new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE, 0.60));
			repo.save(new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE, 0.60));
		};
	}

}
