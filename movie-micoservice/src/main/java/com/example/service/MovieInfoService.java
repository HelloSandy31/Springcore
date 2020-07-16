package com.example.service;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.MovieInfo;

@RestController

@RequestMapping("/Info")
public class MovieInfoService {

	@RequestMapping("/{movieId}")
	List<MovieInfo> getCatalogContent(@PathVariable("movieId")String userId) {
		
		return Collections.singletonList(new MovieInfo("Transformer", 111));
	}
}
