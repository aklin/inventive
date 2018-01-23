package com.github.aklin.inventive.domain.core;

import com.fasterxml.jackson.annotation.JsonGetter;


/**
 * Represents an entity that has a name. Names are not guaranteed to be unique.
 */
public interface Nameable {

	/**
	 * Get user-friendly name. Name can change depending on context
	 * and may not be unique. Consult each implementer's Javadoc
	 * to make sure
	 *
	 * @return
	 */
	@JsonGetter("name")
	public String getName();
}
