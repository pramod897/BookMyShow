package in.pramod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="MOVIE_PRICE")
public class MoviePrice {

	@Id
	@Column(name="MOVIE_ID")
	private Integer movieId;
	
	@Column(name="MOVIE_NAME")
	private String movieName;
	
	@Column(name="MOVIE_PRICE")
	private Double moviePrice;
}
