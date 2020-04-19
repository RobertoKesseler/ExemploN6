package Kesseler.Roberto.Exemplo6;

import Kesseler.Roberto.Exemplo6.model.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Exemplo6Application {

	public static void main(String[] args) {
		SpringApplication.run(Exemplo6Application.class, args);

		ApplicationContext applicationContext = SpringApplication.run(Exemplo6Application.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();


	}


}
