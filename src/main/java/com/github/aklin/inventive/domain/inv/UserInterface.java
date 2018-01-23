package com.github.aklin.inventive.domain.inv;

import com.github.aklin.inventive.domain.core.Identifiable;
import com.github.aklin.inventive.domain.core.Nameable;

public interface UserInterface extends Identifiable, Nameable {

	/**
	 * Get login name
	 *
	 * @return
	 */
	@Override
	public String getName();

	/**
	 * Get first name
	 *
	 * @return
	 */
	public String getFirstName();

	/**
	 * Get last name
	 *
	 * @return
	 */
	public String getLastName();


	/**
	 * Get full name
	 * @return
	 */
	public String getFullName();
}
