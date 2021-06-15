package com.demo.crud.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name="video")
@Table(name="video")
public class VideoEntity implements Serializable{
	
	//Generated serialVersionUID
	private static final long serialVersionUID = -2748223917970300252L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long videoID;
	
	@Column(name = "title")
	@NotNull(message = "Field can not be Null")
	private String title;
	
	@Column(name = "videoURL")
	@NotNull(message = "Field can not be Null")
	private String videoURL;
	
	@Column(name = "duration")
	@NotNull(message = "Field can not be Null")
	private Double duration;
	
	@Column(name = "thumbnailURL")
	@NotNull(message = "Field can not be Null")
	private String thumbnailURL;
	
	@Column(name = "uploadDate")
	private java.util.Date uploadDate;
	
	@Column(name = "size")
	@NotNull(message = "Field can not be Null")
	private Double size;
	
	@Column(name = "olViewCount")
	private Long olViewCount;
	
	@Column(name = "ofViewCount")
	private Long ofViewCount;
	
	@Column(name = "downloadCount")
	private Long downloadCount;
	
	@Column(name = "dirID")
	@NotNull(message = "Field can not be Null")
	private Long dirID;
	
	@Column(name = "lyricsURL")
	@NotNull(message = "Field can not be Null")
	private String lyricsUrl;
	
	@Column(name = "isFree")
	@NotNull(message = "Field can not be Null")
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

	@Override
	public String toString() {
		return "VideoEntity [videoID=" + videoID + ", title=" + title + ", videoURL=" + videoURL + ", duration="
				+ duration + ", thumbnailURL=" + thumbnailURL + ", uploadDate=" + uploadDate + ", size=" + size
				+ ", olViewCount=" + olViewCount + ", ofViewCount=" + ofViewCount + ", downloadCount=" + downloadCount
				+ ", dirID=" + dirID + ", lyricsUrl=" + lyricsUrl + ", isFree=" + isFree + "]";
	}
}
