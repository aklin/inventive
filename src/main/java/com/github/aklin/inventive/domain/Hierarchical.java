package com.github.aklin.inventive.domain;

import com.fasterxml.jackson.annotation.JsonGetter;

/**
 * Represents an entity that exists in a parent-child hierarchy. A parent can have many children,
 * but a child can only have one parent.
 */
public interface Hierarchical {

	/**
	 * Get parent element
	 *
	 * @return Parent or null
	 */
	public Hierarchical getParent();

	@JsonGetter("is-root")
	public default boolean  isRoot(){
		return getParent() == null;
	}
}
