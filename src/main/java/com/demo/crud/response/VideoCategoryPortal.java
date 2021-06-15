package com.demo.crud.response;

import java.util.Date;

public class VideoCategoryPortal {
		private String name;
		private Long count;
		private Long heardCount;
		private Long downloadCount;
		private Double size;
		private Double duration;
		private Date uploadDate;
		private Boolean isFree;

		public VideoCategoryPortal() {
			name = " ";
			count = (long) 0;
			heardCount = (long) 0;
			downloadCount = (long) 0;
			size = 0.0;
			duration = 0.0;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public Long getCount() {
	    return count;
	  }

	  public void setCount(Long count) {
	    this.count = count;
	  }

	  public Long getHeardCount() {
	    return heardCount;
	  }

	  public void setHeardCount(Long heardCount) {
	    this.heardCount = heardCount;
	  }

	  public Long getDownloadCount() {
	    return downloadCount;
	  }

	  public void setDownloadCount(Long downloadCount) {
	    this.downloadCount = downloadCount;
	  }

	  public Double getSize() {
	    return size;
	  }

	  public void setSize(Double size) {
	    this.size = size;
	  }

	  public Double getDuration() {
	    return duration;
	  }

	  public void setDuration(Double duration) {
	    this.duration = duration;
	  }

	  public Date getUploadDate() {
	    return uploadDate;
	  }

	  public void setUploadDate(Date uploadDate) {
	    this.uploadDate = uploadDate;
	  }

	  public Boolean isFree() {
	    return isFree;
	  }

	  public void setFree(Boolean isFree) {
	    this.isFree = isFree;
	  }
}
