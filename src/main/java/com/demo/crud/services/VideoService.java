package com.demo.crud.services;

import java.util.List;

import com.demo.crud.requests.VideoEntityRequest;
import com.demo.crud.response.DownloadVideoResponse;
import com.demo.crud.response.VideoCategoryPortal;

public interface VideoService {
	public boolean saveVideo(VideoEntityRequest request);
	public boolean deleteVideo(long id);
	public List<VideoCategoryPortal> getPortalAllVideos();
	public List<DownloadVideoResponse> downloadVideo(Long id);
	
}
