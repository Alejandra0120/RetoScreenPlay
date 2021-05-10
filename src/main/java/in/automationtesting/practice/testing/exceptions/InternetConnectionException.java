package in.automationtesting.practice.testing.exceptions;

public class InternetConnectionException extends RuntimeException {
    public static final String INTERNET_FAILED = "There was a problem with connection internet, please check";

    public InternetConnectionException(String message) {
        super(message);
    }
}

