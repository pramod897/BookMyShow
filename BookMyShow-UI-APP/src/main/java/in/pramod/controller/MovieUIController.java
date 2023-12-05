package in.pramod.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pramod.service.MovieService;

@Controller
public class MovieUIController {

	@Autowired
	private MovieService service;
	
	
	
	@GetMapping("/")
	public String ListOfMovies() {
		return "ListOfMovies2";
	}
	
	@GetMapping("/bookMovieTicket")
	public String loadPage() {
		return "index2";
	}
	
	@GetMapping("/getTotalCost")
	public String getTotalCost(HttpServletRequest request,Model model) {
		
		String movieName =request.getParameter("movieName");
		String noOfTickets=request.getParameter("noOfTickets");
		
		String response=service.getTotalStockPrice(movieName, Integer.parseInt(noOfTickets));
		model.addAttribute("msg",response);
		model.addAttribute("moviename",movieName);
		model.addAttribute("nooftickets",noOfTickets);
		return "/getTicket2";
	}
	
	
	
}
