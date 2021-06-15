package com.demo.crud.requests;

import java.io.Serializable;

public class GetVideoById implements Serializable{

	private static final long serialVersionUID = 3823305916761217385L;
	private long id;

	  public long getId() {
	    return id;
	  }

	  public void setId(long id) {
	    this.id = id;
	  }


}
