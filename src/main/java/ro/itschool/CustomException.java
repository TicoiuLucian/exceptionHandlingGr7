package ro.itschool;

public class CustomException extends Exception {
    private String message;

    CustomException(String message) {
        super(message);
    }
}
