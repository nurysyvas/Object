package Circle;

public class RadiusExseption extends Exception{
    public RadiusExseption() {
    }

    public RadiusExseption(String message) {
        super(message);
    }

    public RadiusExseption(String message, Throwable cause) {
        super(message, cause);
    }

    public RadiusExseption(Throwable cause) {
        super(cause);
    }

    public RadiusExseption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
