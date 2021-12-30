package com.phdareys.shop.model;

import java.util.Date;
import java.util.zip.DataFormatException;

public class OrderException extends Exception{

    String message;

    public OrderException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message + " " + new Date();
    }
}
