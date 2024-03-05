package com.example.bms.dtos;
import  com.example.bms.models.Rating;
public class RateMovieResponseDto {
    private ResponseStatus responseStatus;
    private Rating rating;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
