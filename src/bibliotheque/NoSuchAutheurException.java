package bibliotheque;

public class NoSuchAutheurException extends Exception{
    String message;

    public NoSuchAutheurException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
