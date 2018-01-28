package com.github.aklin.inventive.domain.inv;

public interface ItemBuilderInterface {

	/**
	 * Use parameter as template. Calling {@link #create()} directly
	 * afterwards effectively clones the item
	 *
	 * @param template
	 * @return
	 */
	public ItemBuilderInterface from(ItemInterface template);

	/**
	 * Set container ID
	 *
	 * @param id
	 * @return
	 * @see com.github.aklin.inventive.domain.core.Identifiable
	 */
	public ItemBuilderInterface setID(long id);

	/**
	 * Set item name
	 *
	 * @param name
	 * @return
	 * @see com.github.aklin.inventive.domain.core.Nameable
	 */
	public ItemBuilderInterface setName(String name);

	/**
	 * Set item description
	 *
	 * @param description
	 * @return
	 * @see com.github.aklin.inventive.domain.core.Describable
	 */
	public ItemBuilderInterface setDescription(String description);

	/**
	 * Set item type ID. This builder will perform any lookup necessary
	 *
	 * @param typeID
	 * @return
	 */
	public ItemBuilderInterface setType(long typeID);

	/**
	 * Set item container ID. This builder will perform any lookup necessary
	 *
	 * @param parentID
	 * @return
	 */
	public ItemBuilderInterface setContainer(long parentID);

	/**
	 * Create Container object
	 *
	 * @return
	 */
	public ItemInterface create();
}
