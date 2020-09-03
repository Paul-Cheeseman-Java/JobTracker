package com.demo.JobTracker;

import java.net.URLEncoder;
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

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


@Controller
public class TestController {

	   @GetMapping("/Indeed")
	   public String getIndeedJobs(RestTemplate restTemplate,  Model model, Principal principal) {
			
		   WebClient client = new WebClient();
		   client.getOptions().setCssEnabled(false);
		   client.getOptions().setJavaScriptEnabled(false);
		   try {
			   
			 //String searchUrl = "https://www.indeed.co.uk/jobs?q=Junior+Developer&l=Fareham&radius=5&fromage=7";
			   String searchUrl = "https://www.indeed.co.uk/jobs?q=Junior+Developer&l=Fareham&radius=5";
			 
		     HtmlPage page = client.getPage(searchUrl);
		     List<DomNode> items = page.querySelectorAll(".jobsearch-SerpJobCard");

		     
		     if(items.isEmpty()){
		       System.out.println("No items found !");
		     }else{
		    	 
		    	 for(DomNode htmlItem : items){
		    		 String title = htmlItem.querySelector(".title") == null ? "Not provided" : htmlItem.querySelector(".title").asText();
		    		 String company = htmlItem.querySelector(".company") == null ? "Not provided" : htmlItem.querySelector(".company").asText();
		    		 String location = htmlItem.querySelector(".location") == null ? "Not provided" : htmlItem.querySelector(".location").asText();
		    		 String salary = htmlItem.querySelector(".salarySnippet") == null ? "Not provided" : htmlItem.querySelector(".salarySnippet").asText();
		    		 String summary = htmlItem.querySelector(".summary") == null ? "Not provided" : htmlItem.querySelector(".summary").asText();
		    		 String date = htmlItem.querySelector(".date") == null ? "Not provided" : htmlItem.querySelector(".date").asText();

		    	 
		    		 //ADD INTO OBJECT USING SETTERS RATHER THAN PRINT OUT
		    	 
		    		 System.out.println("title: " +title);
		    		 System.out.println("company: " +company);
		    		 System.out.println("location: " +location);
		    		 System.out.println("salary: " +salary);
		    		 System.out.println("summary: " +summary);
		    		 System.out.println("date: " +date);
		    		 System.out.println("-----------------------------");
		     		}
		     	}  
			   
		   }catch(Exception e){
		     e.printStackTrace();
		   }
		
			return "home";
	   }

	   
	   @GetMapping("/Spectrum")
	   public String getSpectrumJobs(RestTemplate restTemplate,  Model model, Principal principal) {
			
		   WebClient client = new WebClient();
		   client.getOptions().setCssEnabled(false);
		   client.getOptions().setJavaScriptEnabled(false);
		   try {
			   
			   String searchUrl = "https://www.spectrumit.co.uk/job-search?utf8=%E2%9C%93&search%5Bquery%5D=junior+developer&search%5Blocation%5D=fareham&search%5Bradius%5D=10.0";
			 
			   HtmlPage page = client.getPage(searchUrl);
			   List<DomNode> items = page.querySelectorAll(".main-result-info-panel");

		     
			   if(items.isEmpty()){
				   System.out.println("No items found !");
			   }else{
		    	 //job-title
		    	 //results-job-location
		    	 //results-salary
		    	 //results-posted-at
		    	 //job-description
		    	 for(DomNode htmlItem : items){
	    		 
		    		 String title = htmlItem.querySelector(".job-title") == null ? "Not provided" : htmlItem.querySelector(".job-title").asText();

		    		 System.out.println("Title: " +title);
		    		 
		    	 }
		     }  
			   
			   
		   }catch(Exception e){
		     e.printStackTrace();
		   }
		
		   
			return "home";
	   }
	   
	   
	   @GetMapping("/CV-Library")
	   public String getCVLibraryJobs(RestTemplate restTemplate,  Model model, Principal principal) {
			
		   WebClient client = new WebClient();
		   client.getOptions().setCssEnabled(false);
		   client.getOptions().setJavaScriptEnabled(false);
		   try {
			   
			   String searchUrl = "https://www.cv-library.co.uk/junior-developer-jobs-in-fareham?permanent=true&distance=10&posted=7&us=1";
			 
			   HtmlPage page = client.getPage(searchUrl);
			   List<DomNode> items = page.querySelectorAll(".job__main");

		     
			   if(items.isEmpty()){
				   System.out.println("No items found !");
			   }else{

				   //job__title
				   //job__details-value salary
				   //job__details-value location
				   //job__description
				   //job__details-term company
				   //data-jd-posted - might be dodge
				   
				   
				   for(DomNode htmlItem : items){
	    		 
		    		 String title = htmlItem.querySelector(".job__title") == null ? "Not provided" : htmlItem.querySelector(".job__title").asText();

		    		 System.out.println("Title: " +title);
		    		 
		    	 }
		     }  
			   
			   
		   }catch(Exception e){
		     e.printStackTrace();
		   }
		
		   
			return "home";
	   }

	   
	   
	   
	   
}

