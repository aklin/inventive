package com.github.aklin.inventive.domain;

import com.fasterxml.jackson.annotation.JsonGetter;

public interface Describable {

	/**
	 * Get user-friendly description
	 * @return
	 */
	@JsonGetter("description")
	public String getDescription();
}
