package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //include: @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan(@Component, @Controller и @Service)
public class TacoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoApplication.class, args);
	}// args = cmd args

}
