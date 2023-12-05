package in.pramod.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pramod.client.MovieClient;

@RestController
@RequestMapping("/calc")
public class MovieCalculationRestController {

	@Autowired
	private MovieClient client;
	
	@GetMapping("/calculate/{movieName}/{noOfTickets}")
	public ResponseEntity<?> calculate(@PathVariable String movieName, @PathVariable Integer noOfTickets){
		
		ResponseEntity<?> responseEntity=null;
		Double totalPrice=null;
		
		try {
		responseEntity=client.getStockPrice(movieName);
		
		int statusCode=responseEntity.getStatusCode().value();	
	
		if(statusCode==200) {
			Double movieTicketPrice=(Double) responseEntity.getBody();
			totalPrice= noOfTickets*movieTicketPrice;
			String response=totalPrice+"Rs";
			responseEntity=new ResponseEntity<String>(response,HttpStatus.OK);
		}
	} catch (Exception e) {
		responseEntity = new ResponseEntity<String>("movie not found", HttpStatus.BAD_REQUEST);
	}
		
		return responseEntity;
				
	
	
	}
}
