package com.example.bms.services;

import com.example.bms.exceptions.MovieNotFoundException;
import com.example.bms.exceptions.UserNotFoundException;
import com.example.bms.models.Rating;

public interface RatingService {
    public Rating rateTheMovie(int userId, int movieId, int rating) throws UserNotFoundException, MovieNotFoundException;

    public double getAverageRatingForMovie(int movieId) throws MovieNotFoundException;
}
