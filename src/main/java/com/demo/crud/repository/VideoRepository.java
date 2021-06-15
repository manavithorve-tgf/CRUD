package com.demo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.crud.model.VideoEntity;

public interface VideoRepository extends JpaRepository<VideoEntity,Long> {

	@Query(value = "SELECT size, videoURL FROM video WHERE videoId = ?1", nativeQuery = true)
	String downloadVideoById(long id);
}
