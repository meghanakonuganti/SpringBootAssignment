package com.stackroute.Muzixapp.exceptions;

public class TrackNotFoundException extends Exception {
    private String message;
    public TrackNotFoundException(){}
    public TrackNotFoundException(String message){
        super(message);
        this.message=message;
    }
}

