package roostify.poc.dapp198.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * HTTP_ERROR CODE 400 BAD REQUEST
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidParameterValueException extends BusinessException {

    public InvalidParameterValueException(String message) {
        super(message);
    }
}
