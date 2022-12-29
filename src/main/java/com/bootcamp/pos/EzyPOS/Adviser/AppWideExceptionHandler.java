package com.bootcamp.pos.EzyPOS.Adviser;

import com.bootcamp.pos.EzyPOS.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(ClassNotFoundException.class)
    public ResponseEntity<StandardResponse> handleNotFoundException(ClassNotFoundException e){
        return new ResponseEntity<>(
                new StandardResponse(
                        404,e.getMessage()+" was occurred!",e.getException()
                ), HttpStatus.NOT_FOUND
        );
    }
}
