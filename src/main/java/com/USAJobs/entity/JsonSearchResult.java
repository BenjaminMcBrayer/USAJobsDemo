package com.USAJobs.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonSearchResult {

	@JsonProperty("LanguageCode")
	private String languageCode;

	/**
	 * 
	 */
	public JsonSearchResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the languageCode
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * @param languageCode the languageCode to set
	 */
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

}
