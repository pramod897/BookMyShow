package in.pramod.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pramod.service.IMoviePriceService;

@RestController
@RequestMapping("/price")
public class MoviePriceController {

	@Autowired
	private IMoviePriceService service;
	
	
	@GetMapping("/moviePrice/{movieName}")
	public ResponseEntity<Double> getMoviePrice(@PathVariable String movieName){
		
		Double price=service.findByMovieName(movieName);
		System.out.println(movieName+" "+price);
		
		return new ResponseEntity<Double>(price,HttpStatus.OK);
	}
}
