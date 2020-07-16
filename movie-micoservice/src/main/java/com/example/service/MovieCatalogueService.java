package com.example.service;



import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CatalogueContent;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogueService {
	
	@RequestMapping("/{userId}")
	List<CatalogueContent> getCatalogContent(@PathVariable("userId")String userId) {
		
		return Collections.singletonList(new CatalogueContent("Transfrmer", "Robotics", 5));
	}


}


