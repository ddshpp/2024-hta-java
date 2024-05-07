package day5.Exception;

public class ShpException extends RuntimeException {

    private final String message;
    private final int code;

    public ShpException(ShpExceptionCode shpExceptionCode) {
        super();
        this.message = shpExceptionCode.getMessage();
        this.code = shpExceptionCode.getCode();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
