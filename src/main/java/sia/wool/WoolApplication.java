package sia.wool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //include: @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan(@Component, @Controller и @Service)
public class WoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(WoolApplication.class, args);
	}// args = cmd args

}
