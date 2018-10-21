package roostify.poc.dapp198.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * HTTP_ERROR CODE 400 BAD REQUEST
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends BusinessException {

    public EntityNotFoundException(String message) {
        super(message);
    }
}
