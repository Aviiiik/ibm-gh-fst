package fst;

public class Activity8 {

    public static void main(String[] args) {
        try {
            exceptionTest("Trying out");
            exceptionTest(null);
        } catch (CustomException m) {
            System.out.println(m.getMessage());
        }
    }

    public static void exceptionTest(String m) throws CustomException {
        if (m == null) {
            throw new CustomException("Null value");
        } else {
            System.out.println(m);
        }
    }
}

class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}