package com.appsdeveloper.app.ws.myExecption;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyExectption extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleAnyExecption(Exception ex, WebRequest request) {

		String errorMessageDiscreption = ex.getLocalizedMessage();
		if (errorMessageDiscreption == null)
			errorMessageDiscreption = ex.toString();

		ErrorMessage errorMessage = new ErrorMessage(new Date().toString(), errorMessageDiscreption);

		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = { UserServiceException.class })
	public ResponseEntity<Object> handleUserServiceExecption(UserServiceException ex, WebRequest request) {

		String errorMessageDiscreption = ex.getLocalizedMessage();
		if (errorMessageDiscreption == null)
			errorMessageDiscreption = ex.toString();

		ErrorMessage errorMessage = new ErrorMessage(new Date().toString(), errorMessageDiscreption);

		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
