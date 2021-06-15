package com.demo.crud.customexception;

public class VideoNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -8098529555182819705L;
	public VideoNotFoundException(String err) {
	    super(err);
	}
}
