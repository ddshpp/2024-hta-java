package day5.Exception;

public enum ShpExceptionCode {
    SHP_EXCEPTION_CODE_1 ("첫번째 예외", 1001);

    private final String message;
    private final int code;

    ShpExceptionCode(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
