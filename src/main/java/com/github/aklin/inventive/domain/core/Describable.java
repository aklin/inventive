package com.github.aklin.inventive.domain.core;

import com.fasterxml.jackson.annotation.JsonGetter;

/**
 * Entity has a user-friendly description.
 */
public interface Describable {

	/**
	 * Get user-friendly description
	 *
	 * @return
	 */
	@JsonGetter("description")
	public String getDescription();
}
