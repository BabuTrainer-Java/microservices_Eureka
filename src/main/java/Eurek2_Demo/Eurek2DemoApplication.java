package Eurek2_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurek2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Eurek2DemoApplication.class, args);
	}

}
