package com.example.bms.services;

import com.example.bms.exceptions.MovieNotFoundException;
import com.example.bms.exceptions.UserNotFoundException;
import com.example.bms.models.Movie;
import com.example.bms.models.Rating;
import com.example.bms.models.User;
import com.example.bms.repositories.MovieRepository;
import com.example.bms.repositories.RatingRepository;
import com.example.bms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RatingsServiceImpl implements RatingService {

    private UserRepository userRepository;
    private MovieRepository movieRepository;
    private RatingRepository ratingRepository;

    @Autowired
    public RatingsServiceImpl(UserRepository userRepository, MovieRepository movieRepository, RatingRepository ratingRepository) {
        this.userRepository = userRepository;
        this.movieRepository = movieRepository;
        this.ratingRepository = ratingRepository;
    }

    @Override
    public Rating rateTheMovie(int userId, int movieId, int rating) throws UserNotFoundException, MovieNotFoundException {
        User user = this.userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found..."));
        Movie movie = this.movieRepository.findById(movieId).orElseThrow(() -> new MovieNotFoundException("Movie not found..."));

        // if rating is there, update the rating otherwise insert the new data
        Optional<Rating>  ratingDbData = this.ratingRepository.findByUserAndMovie(user, movie);
        if(ratingDbData.isPresent()){
            Rating data = ratingDbData.get();
            data.setRating(rating);
            return this.ratingRepository.save(data);
        }
       // save the new data into db
        Rating saveRating = new Rating();
        saveRating.setMovie(movie);
        saveRating.setUser(user);
        saveRating.setRating(rating);
        return this.ratingRepository.save(saveRating);
    }

    @Override
    public double getAverageRatingForMovie(int movieId) throws MovieNotFoundException {
        this.movieRepository.findById(movieId).orElseThrow(() -> new MovieNotFoundException("Movie not found..."));
        return this.ratingRepository.getAvgRatingForMovie(movieId);
    }
}
