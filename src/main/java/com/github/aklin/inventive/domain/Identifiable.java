package com.github.aklin.inventive.domain;

/**
 * Represents a uniquely identifiable item and provides a method to retrieve its identifier
 */
public interface Identifiable {

	/**
	 * Get unique identifier.
	 *
	 * @return
	 */
	public long getID();
}
