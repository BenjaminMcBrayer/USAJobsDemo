package com.USAJobs.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

	@JsonProperty("MatchedObjectDescriptor")
	private MatchedObjectDescriptor matchedObjectDescriptor;
	@JsonProperty("RelevanceRank")
	private int relevanceRank;

	/**
	 * 
	 */
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the matchedObjectDescriptor
	 */
	public MatchedObjectDescriptor getMatchedObjectDescriptor() {
		return matchedObjectDescriptor;
	}

	/**
	 * @param matchedObjectDescriptor the matchedObjectDescriptor to set
	 */
	public void setMatchedObjectDescriptor(MatchedObjectDescriptor matchedObjectDescriptor) {
		this.matchedObjectDescriptor = matchedObjectDescriptor;
	}

	/**
	 * @return the relevanceRank
	 */
	public int getRelevanceRank() {
		return relevanceRank;
	}

	/**
	 * @param relevanceRank the relevanceRank to set
	 */
	public void setRelevanceRank(int relevanceRank) {
		this.relevanceRank = relevanceRank;
	}

}
