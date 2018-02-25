package aircraft.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"aircraft.app"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
