package com.demo.crud.requests;

import java.io.Serializable;

public final class VideoEntityRequest implements Serializable{

	private static final long serialVersionUID = 449972477566676537L;

	private Long videoID;

	  private String title;

	  private String videoURL;

	  private Double duration;

	  private String thumbnailURL;

	  private java.util.Date uploadDate;

	  private Double size;

	  private Long olViewCount;

	  private Long ofViewCount;

	  private Long downloadCount;

	  private Long dirID;

	  private String lyricsUrl;

	  private boolean isFree;

	  public Long getVideoID() {
	    return videoID;
	  }

	  public void setVideoID(Long videoID) {
	    this.videoID = videoID;
	  }

	  public String getTitle() {
	    return title;
	  }

	  public void setTitle(String title) {
	    this.title = title;
	  }

	  public String getVideoURL() {
	    return videoURL;
	  }

	  public void setVideoURL(String videoURL) {
	    this.videoURL = videoURL;
	  }

	  public Double getDuration() {
	    return duration;
	  }

	  public void setDuration(Double duration) {
	    this.duration = duration;
	  }

	  public String getThumbnailURL() {
	    return thumbnailURL;
	  }

	  public void setThumbnailURL(String thumbnailURL) {
	    this.thumbnailURL = thumbnailURL;
	  }

	  public java.util.Date getUploadDate() {
	    return uploadDate;
	  }

	  public void setUploadDate(java.util.Date uploadDate) {
	    this.uploadDate = uploadDate;
	  }

	  public Double getSize() {
	    return size;
	  }

	  public void setSize(Double size) {
	    this.size = size;
	  }

	  public Long getOlViewCount() {
	    return olViewCount;
	  }

	  public void setOlViewCount(Long olViewCount) {
	    this.olViewCount = olViewCount;
	  }

	  public Long getOfViewCount() {
	    return ofViewCount;
	  }

	  public void setOfViewCount(Long ofViewCount) {
	    this.ofViewCount = ofViewCount;
	  }

	  public Long getDownloadCount() {
	    return downloadCount;
	  }

	  public void setDownloadCount(Long downloadCount) {
	    this.downloadCount = downloadCount;
	  }

	  public Long getDirID() {
	    return dirID;
	  }

	  public void setDirID(Long dirID) {
	    this.dirID = dirID;
	  }

	  public String getLyricsUrl() {
	    return lyricsUrl;
	  }

	  public void setLyricsUrl(String lyricsUrl) {
	    this.lyricsUrl = lyricsUrl;
	  }

	  public boolean isFree() {
	    return isFree;
	  }

	  public void setFree(boolean isFree) {
	    this.isFree = isFree;
	  }
}
