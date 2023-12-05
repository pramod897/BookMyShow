package in.pramod.gobalHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.pramod.exception.MovieNotFoundException;

@RestControllerAdvice
public class MovieRestApiError {

	@ExceptionHandler(value=MovieNotFoundException.class)
	public ResponseEntity<String> handleMovieNotFoundException(MovieNotFoundException se){
		return new ResponseEntity<String>(se.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
