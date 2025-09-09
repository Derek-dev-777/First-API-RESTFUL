package aPI.REST.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "aPI.REST.models")
public class ApiRestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestProjectApplication.class, args);
	}

}
