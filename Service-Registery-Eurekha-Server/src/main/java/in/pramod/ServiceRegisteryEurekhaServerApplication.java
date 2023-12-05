package in.pramod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegisteryEurekhaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegisteryEurekhaServerApplication.class, args);
	}

}
