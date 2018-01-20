package com.github.aklin.inventive.domain;

/**
 * Describes an immutable (ie. geographic) location
 */
public interface Locatable extends Identifiable, Nameable, Hierarchical {

	/**
	 * Get parent location. If no parent location exists, this method must return null
	 *
	 * @return Get parent location or null
	 */
	@Override
	public Locatable getParent();
}
