package com.example.bms.repositories;

import com.example.bms.models.Movie;
import com.example.bms.models.Rating;
import com.example.bms.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {

    @Query("SELECT AVG(r.rating) FROM Rating r WHERE r.movie.id = ?1")
    Double getAverageRatingForMovie(Integer movieId);


    Optional<Rating> findByUserAndMovie(User user, Movie movie);
}
