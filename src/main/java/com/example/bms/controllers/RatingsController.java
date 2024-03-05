package com.example.bms.controllers;

import com.example.bms.dtos.GetAverageMovieRequestDto;
import com.example.bms.dtos.GetAverageMovieResponseDto;
import com.example.bms.dtos.RateMovieRequestDto;
import com.example.bms.dtos.RateMovieResponseDto;
import com.example.bms.dtos.ResponseStatus;
import com.example.bms.models.Rating;
import com.example.bms.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RatingsController {

    private RatingService ratingsService;

    @Autowired
    public RatingsController(RatingService ratingsService) {
        this.ratingsService = ratingsService;
    }

    public RateMovieResponseDto rateMovie(RateMovieRequestDto requestDto){
        RateMovieResponseDto responseDto = new RateMovieResponseDto();
        try{
            Rating rating = ratingsService.rateTheMovie(requestDto.getUserId(), requestDto.getMovieId(), requestDto.getRating());
            responseDto.setRating(rating);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }

    public GetAverageMovieResponseDto getAverageMovieRating(GetAverageMovieRequestDto requestDto){
        GetAverageMovieResponseDto responseDto = new GetAverageMovieResponseDto();
        try{
            double averageRating = ratingsService.getAverageRatingForMovie(requestDto.getMovieId());
            responseDto.setAverageRating(averageRating);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
