package com.github.aklin.inventive.domain.core;

import com.fasterxml.jackson.annotation.JsonGetter;

/**
 * Represents a uniquely identifiable item and provides a method to retrieve its identifier
 */
public interface Identifiable {
	public static final long UNDEFINED = -1;

	/**
	 * Get unique identifier.
	 *
	 * @return
	 */
	@JsonGetter("id")
	public long getID();
}
