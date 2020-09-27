package com.demo.JobTracker;

import java.util.ArrayList;
import java.util.List;

public class Results {

	private List<JobReed> results;
	
	public Results() {
	}
	
	/* Results list specific for REED job site */
	public Results(List<JobReed> results) {
		this.results = results;
	}
	

	//Renamed getter for ResponseEntity
	public List<JobReed> getResults() {
		System.out.print("In getResults");
		return results;
	}
	
	//Renamed setter for ResponseEntity	
	public void setResults(List<JobReed> results) {
		System.out.print("In setResults");
		this.results = results;
	}
	
}
