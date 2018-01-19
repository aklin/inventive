package com.github.aklin.inventive.domain;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.ArrayList;
import java.util.List;

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


	/**
	 * Get hierarchy path. The first element in the result is the root element. The last element is the current element.
	 *
	 * @return
	 */
	public default List<Hierarchical> getFullLocation() {
		final List<Hierarchical> ret;

		ret = isRoot() ? new ArrayList<>() : getParent().getFullLocation();

		ret.add(this);

		return ret;
	}

	@JsonGetter("is-root")
	public default boolean isRoot() {
		return getParent() == null;
	}
}
