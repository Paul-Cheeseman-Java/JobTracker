package com.demo.JobTracker;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;


@Controller
public class JobController {

	   @GetMapping("/")
	   public String homepage() {
			return "home";
	   }
	
	   @GetMapping("/Reed")
	   public String postHomepage(RestTemplate restTemplate,  Model model, Principal principal) {

			// create auth credentials
		   String authStr = "132cd39e-a1e6-4ef0-9254-f40e2e461234:";
		   String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());

		   HttpHeaders headers = new HttpHeaders();
		   headers.setContentType(MediaType.APPLICATION_JSON);
		   headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		   headers.add("Authorization", "Basic " + base64Creds);
		   HttpEntity request = new HttpEntity(headers);

		   String url = "";
			
		   url = "https://www.reed.co.uk/api/1.0/search?keywords=junior-developer-blah-jobs-in-fareham-common&location=fareham&distancefromlocation=5&permanent=true&contract=false&fullTime=true";

		   // make an HTTP GET request with headers
		   ResponseEntity<Results> response = restTemplate.exchange(
				   url,
			       HttpMethod.GET,
			       request,
			       Results.class
			);
			
			List<JobReed> jobList = response.getBody().getResults();
			
			if (jobList.isEmpty()) {
				System.out.println("Nowt in it...");
			} else {
				for(JobReed job : jobList) {
					System.out.println("Job Name: " +job.getJobTitle());
				}
			}	
			
			return "home";
	   }
	
}
