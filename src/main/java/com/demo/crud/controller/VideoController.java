package com.demo.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.crud.requests.GetVideoById;
import com.demo.crud.requests.VideoEntityRequest;
import com.demo.crud.services.VideoService;
import com.demo.crud.response.DownloadVideoResponse;
import com.demo.crud.response.VideoCategoryPortal;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/videos")
public class VideoController {	
	@Autowired VideoService service;
	
	@GetMapping(
		      "/portal/all") // URL for fetching size and audio URL of an video for downloading audio
		                     // purpose
		  public List<VideoCategoryPortal> getPortalAllVideos() {

		    return service.getPortalAllVideos();
		  }
	@GetMapping(
		      "/video/download") // URL for fetching size and audio URL of an video for downloading audio
		                         // purpose
		  public List<DownloadVideoResponse> downloadVideo(@RequestBody GetVideoById id) {

		    return service.downloadVideo(id.getId());
		  }
	
	@PostMapping(
		      value = "/",
		      consumes = MediaType.APPLICATION_JSON_VALUE,
		      produces = MediaType.APPLICATION_JSON_VALUE)
		  public boolean addVideo(@RequestBody VideoEntityRequest request) {
		    return service.saveVideo(request);
		  }
	
	@PutMapping(value = "/videoList/video")
	  public boolean modifyVideo(@RequestBody VideoEntityRequest request) {

	    return service.saveVideo(request);
	  }
	
	@DeleteMapping(value = "/videoList/video")
	  public boolean deleteVideo(@RequestBody GetVideoById id) {
	    return service.deleteVideo(id.getId());
	  }
}
