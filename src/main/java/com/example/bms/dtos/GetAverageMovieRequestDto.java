package com.example.bms.dtos;

import lombok.Data;

@Data
public class GetAverageMovieRequestDto {
    private int movieId;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}

