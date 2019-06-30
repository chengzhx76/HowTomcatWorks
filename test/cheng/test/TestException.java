package cheng.test;

/**
 * Desc:
 * Author: 光灿
 * Date: 2019/6/30
 */
public class TestException extends RuntimeException {
    protected TestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public TestException(String message, Throwable cause) {
        this(message, cause, true, true);
    }

    public TestException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        throw new TestException("ddd");
    }

}
