package com.demo.crud.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.crud.customexception.CustomIlleagalStateException;
import com.demo.crud.customexception.VideoNotFoundException;
import com.demo.crud.model.VideoEntity;
import com.demo.crud.repository.VideoRepository;
import com.demo.crud.requests.VideoEntityRequest;
import com.demo.crud.response.DownloadVideoResponse;
import com.demo.crud.response.VideoCategoryPortal;
import com.demo.crud.services.VideoService;

@Service
public class VideoServiceImpl implements VideoService{

	@Autowired VideoRepository repository;
	
	@Override
	public boolean saveVideo(VideoEntityRequest request) {
		try {

		      VideoEntity entity = new VideoEntity();

		      entity.setVideoID(request.getVideoID());
		      entity.setTitle(request.getTitle());
		      entity.setVideoURL(request.getVideoURL());
		      entity.setThumbnailURL(request.getThumbnailURL());
		      entity.setDuration(request.getDuration());
		      entity.setDirID(request.getDirID());
		      entity.setDownloadCount(request.getDownloadCount());
		      entity.setOlViewCount(request.getOlViewCount());
		      entity.setOfViewCount(request.getOfViewCount());
		      entity.setFree(request.isFree());
		      entity.setSize(request.getSize());
		      entity.setLyricsUrl(request.getLyricsUrl());
		      entity.setUploadDate(new java.util.Date());
		      repository.save(entity);
		      return true;
		    }catch (Exception e) {
		      throw new CustomIlleagalStateException(e.getMessage()); // re throw
		    }
	}

	@Override
	public boolean deleteVideo(long id) {
		if (!(repository.existsById(id))) // checking whether id is in the database
	    {
	      throw new VideoNotFoundException("id not found" + id); // not found In db Exception
	    }
	    try {
	      repository.deleteById(id); // deleting by id
	      return true;
	    } catch (Exception e) {
	      throw new CustomIlleagalStateException(
	          "field can not be null"); // field Can not be null Exception
	    }
	}

	@Override
	public List<VideoCategoryPortal> getPortalAllVideos() {
		List<VideoEntity> list = repository.findAll();
	    List<VideoCategoryPortal> videoCategoryList = new ArrayList<>();
	    for (VideoEntity entity : list) {
	      VideoCategoryPortal temp = new VideoCategoryPortal();
	      temp.setName(entity.getTitle());
	      temp.setHeardCount(entity.getOfViewCount() + entity.getOlViewCount());
	      temp.setUploadDate(entity.getUploadDate());
	      temp.setSize(entity.getSize());
	      temp.setFree(entity.isFree());
	      temp.setDuration(entity.getDuration());
	      temp.setDownloadCount(entity.getDownloadCount());
	      videoCategoryList.add(temp);
	    }
	    return videoCategoryList;
	}

	
	@Override
	  public List<DownloadVideoResponse> downloadVideo(Long id) {

	    if (!(repository.existsById(id))) { // checking whether id is present in the database
	      throw new VideoNotFoundException(
	          "Id not found: " + id); // id not found in the database exception
	    }

	    try {
	    	
	      String response =
	          repository.downloadVideoById(
	              id); // method to get book size and book URL from the database
	      List<DownloadVideoResponse> list = new ArrayList<>(); // declaring a list of response type

	      String[] arrSplit =
	          response.split(","); // splitting the every book details into each element of string array

	      DownloadVideoResponse dVideo =
	          new DownloadVideoResponse(
	              Float.parseFloat(arrSplit[0]),
	              arrSplit[
	                  1]); // storing the book size and book URL as a object of response class using
	                       // parameterized constructor
	      list.add(dVideo); // storing the book size and book URL in a list

	      return list; // returning the list
	    } catch (Exception e) {
	      throw new CustomIlleagalStateException(
	          "Fiels cannot be NULL"); // field cannot be null exception
	    }
	  }
}
