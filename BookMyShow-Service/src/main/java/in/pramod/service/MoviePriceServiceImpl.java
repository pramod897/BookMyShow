package in.pramod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pramod.entity.MoviePrice;
import in.pramod.exception.MovieNotFoundException;
import in.pramod.repository.MovieRepository;

@Service
public class MoviePriceServiceImpl implements IMoviePriceService {

	@Autowired
	private MovieRepository repo;
	
	@Override
	public Double findByMovieName(String movieName) {
		
		MoviePrice moviePrice=repo.findByMovieName(movieName);
		if(moviePrice==null) {
			throw new MovieNotFoundException("movie not available");
		}
		
		return moviePrice.getMoviePrice();
	}

}
