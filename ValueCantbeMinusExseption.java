package Circle;

public class ValueCantbeMinusExseption extends Exception{
    public ValueCantbeMinusExseption() {
    }

    public ValueCantbeMinusExseption(String message) {
        super(message);
    }

    public ValueCantbeMinusExseption(String message, Throwable cause) {
        super(message, cause);
    }

    public ValueCantbeMinusExseption(Throwable cause) {
        super(cause);
    }

    public ValueCantbeMinusExseption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
