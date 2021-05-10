package in.automationtesting.practice.testing.exceptions;

public class ElementNotFoundException extends RuntimeException{

    public static final String ELEMENT_NOT_FOUND_ALERT = "Element is not visible, please check";

    public ElementNotFoundException(String message) {
        super(message);
    }
}
