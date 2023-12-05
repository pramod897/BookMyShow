package in.pramod.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="BOOK-MY-SHOW-SERVICE")
public interface MovieClient {

	@GetMapping("/price/moviePrice/{movieName}")
	public ResponseEntity<Double> getStockPrice(@PathVariable String movieName);
}
