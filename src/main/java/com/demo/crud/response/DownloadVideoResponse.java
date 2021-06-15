package com.demo.crud.response;
import java.io.Serializable;

public class DownloadVideoResponse implements Serializable{
	private static final long serialVersionUID = 504638952066865496L;
	
	private String videoURL;
	  private float size;

	  public String getVideoURL() {
	    return videoURL;
	  }

	  public void setVideoURL(String videoURL) {
	    this.videoURL = videoURL;
	  }

	  public float getSize() {
	    return size;
	  }

	  public void setSize(float size) {
	    this.size = size;
	  }

	  public DownloadVideoResponse(float size, String videoURL) {
	    super();
	    this.videoURL = videoURL;
	    this.size = size;
	  }
}
