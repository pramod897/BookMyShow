package in.pramod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pramod.entity.MoviePrice;

public interface MovieRepository extends JpaRepository<MoviePrice,Integer>{

	public MoviePrice findByMovieName(String movieName);
}
