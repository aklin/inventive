package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.inv.TypeInterface;

import java.util.List;

public interface TypeEntryServiceInterface {

	/**
	 * Get all types
	 *
	 * @return
	 */
	public List<TypeInterface> listAll();

	/**
	 * Get Type by ID
	 *
	 * @param id Type or null
	 * @return
	 */
	public TypeInterface get(long id);

	/**
	 * Get default TypeInterface for entries that don't specify one
	 *
	 * @return
	 */
	public TypeInterface getDefaultType();
}
