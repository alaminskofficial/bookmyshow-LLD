package com.example.bms.services;

import com.example.bms.exceptions.MovieNotFoundException;
import com.example.bms.exceptions.UserNotFoundException;
import com.example.bms.models.Rating;
import com.example.bms.repositories.MovieRepository;
import com.example.bms.repositories.RatingRepository;
import com.example.bms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
    }

    @Override
    public double getAverageRatingForMovie(int movieId) throws MovieNotFoundException {
        return 0;
    }
}
