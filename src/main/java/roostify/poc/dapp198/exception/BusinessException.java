package roostify.poc.dapp198.exception;

public abstract class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }

//    @Override
//    public synchronized Throwable fillInStackTrace() {
//        return this;
//    }

}
