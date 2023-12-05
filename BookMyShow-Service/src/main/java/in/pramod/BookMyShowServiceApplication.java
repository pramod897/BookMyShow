package in.pramod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookMyShowServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowServiceApplication.class, args);
	}

}
