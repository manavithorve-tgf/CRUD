package com.demo.crud.customexception;

public class CustomIlleagalStateException extends RuntimeException{

	private static final long serialVersionUID = -8956337626473402413L;
	public CustomIlleagalStateException(String err) {
	    super(err);
	  }
}
