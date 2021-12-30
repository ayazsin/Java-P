package exceptions;

import java.util.Date;

public class BanqueException extends Exception{


    String message;
    BanqueEnum gravite;

    public BanqueException(String message, BanqueEnum gravite) {
        this.message = message;
        this.gravite = gravite;
    }

    @Override
    public String getMessage() {
        return message + " " + gravite + " " + new Date();
    }
}
