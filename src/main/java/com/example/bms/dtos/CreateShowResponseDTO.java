package com.example.bms.dtos;

import com.example.bms.models.Show;

public class CreateShowResponseDTO {
    private ResponseStatus responseStatus;
    private Show show;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}
