package com.USAJobs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.USAJobs.entity.JsonSearchResult;

@Controller
public class JobsController {

	private String host = "data.usajobs.gov";
	
	@Value("${authorization-key}")
	private String key;
	
	@Value("{user-agent}")
	private String email;
	
	

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "test", "Hello, World!");
	}

	@RequestMapping("/results")
	public ModelAndView results() {
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Host", host);
		headers.set("User-Agent", email);
		headers.set("Authorization-Key", key);
		
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<JsonSearchResult> response = restTemplate.exchange("https://data.usajobs.gov/api/search?JobCategoryCode=2210", HttpMethod.GET, entity, JsonSearchResult.class);		
		
		JsonSearchResult jsonSearchResult = response.getBody();
		
		return new ModelAndView ("results", "results", jsonSearchResult.getLanguageCode());
	}
}
