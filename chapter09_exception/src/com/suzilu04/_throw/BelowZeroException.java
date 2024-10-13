package com.suzilu04._throw;

public class BelowZeroException extends Exception{

    static final long serialVersionUID = -3387516;

    public BelowZeroException() {

    }

    public BelowZeroException(String message) {
        super(message);
    }


    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
