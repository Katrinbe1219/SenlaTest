package passwordGenerator;

public class OutPasswordLengthRange extends RuntimeException {
    private String message;

    public OutPasswordLengthRange(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return "OutPasswordLengthRange " + this.message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
