package com.mario.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("movie")
public class MovieResource {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("moviePU");
	EntityManager em = emf.createEntityManager();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Movie getMovie() {

		setMovieinDB();
		
		Movie movie = em.find(Movie.class,2);
		return movie;
	}
	
	public void setMovieinDB()
	{
		Movie movie = new Movie();
		movie.setName("Avengers");
		movie.setRating(6);
		movie.setId(2);
		
		em.getTransaction().begin();
		em.persist(movie);
		em.getTransaction().commit();
		
	}

}
