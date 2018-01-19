package com.github.aklin.inventive.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes an immutable (ie. geographic) location
 */
public interface Locatable extends Identifiable, Hierarchical {

	/**
	 * Get parent location. If no parent location exists, this method must return null
	 *
	 * @return Get parent location or null
	 */
	@Override
	public Locatable getParent();

	/**
	 * Get full path as list. Root location is the first element of the list. The last item in the list is this element.
	 *
	 * @return
	 */
	public default List<Locatable> getFullLocation() {
		final List<Locatable> ret;

		if (getParent() != null) {
			ret = getParent().getFullLocation();
			ret.add(getParent());
			return ret;
		}

		ret = new ArrayList<>();

		ret.add(this);

		return ret;
	}

}
