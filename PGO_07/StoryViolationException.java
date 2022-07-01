package PGO_07;

public class StoryViolationException extends RuntimeException {
    private String errorMessage;

    public StoryViolationException(String string) {
        errorMessage = string;
    }

    public void printMessage() {
        System.out.println(errorMessage);
    }
}