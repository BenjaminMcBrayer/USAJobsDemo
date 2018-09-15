package com.USAJobs.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonSearchResult {

	@JsonProperty("LanguageCode")
	private String languageCode;
	@JsonProperty("SearchResult")
	private SearchResult result;

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

	/**
	 * @return the result
	 */
	public SearchResult getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(SearchResult result) {
		this.result = result;
	}

}
