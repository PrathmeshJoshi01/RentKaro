package com.rentkaro.user_service.exceptions;

public class DuplicateUserException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateUserException(String message) {
        super(message);
    }
}