package com.USAJobs.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchedObjectDescriptor {

	@JsonProperty("PositionID")
	private String positionId;
	@JsonProperty("PositionTitle")
	private String positionTitle;
	@JsonProperty("PositionURI")
	private String positionUri;

	/**
	 * 
	 */
	public MatchedObjectDescriptor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the positionId
	 */
	public String getPositionId() {
		return positionId;
	}

	/**
	 * @param positionId the positionId to set
	 */
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	/**
	 * @return the positionTitle
	 */
	public String getPositionTitle() {
		return positionTitle;
	}

	/**
	 * @param positionTitle the positionTitle to set
	 */
	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}

	/**
	 * @return the positionUri
	 */
	public String getPositionUri() {
		return positionUri;
	}

	/**
	 * @param positionUri the positionUri to set
	 */
	public void setPositionUri(String positionUri) {
		this.positionUri = positionUri;
	}

}
