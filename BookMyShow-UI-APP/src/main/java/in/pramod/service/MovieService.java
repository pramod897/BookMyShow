package in.pramod.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MovieService {

	public
	String getTotalStockPrice(String movieName,Integer noOfTickets) {
		
		String REST_END_POINT="http://localhost:4441/api/calc/calc/calculate/{movieName}/{noOfTickets}";
		String response=null;
		
		WebClient webClient=WebClient.create();
		
		try {
			response=webClient.
					 get().uri(REST_END_POINT,movieName,noOfTickets).retrieve().bodyToMono(String.class).block();
		}
		catch(Exception e) {
			response="movie not found";
		}
		return response;
	}
}
