package com.github.aklin.inventive.domain.inv;

public interface ContainerBuilderInterface {

	/**
	 * Set container ID
	 *
	 * @param id
	 * @return
	 * @see com.github.aklin.inventive.domain.core.Identifiable
	 */
	public ContainerBuilderInterface setID(long id);

	/**
	 * Set container name
	 *
	 * @param name
	 * @return
	 * @see com.github.aklin.inventive.domain.core.Nameable
	 */
	public ContainerBuilderInterface setName(String name);

	/**
	 * Set container description
	 *
	 * @param description
	 * @return
	 * @see com.github.aklin.inventive.domain.core.Describable
	 */
	public ContainerBuilderInterface setDescription(String description);

	/**
	 * Set container type ID. This builder will perform any lookup necessary
	 *
	 * @param typeID
	 * @return
	 */
	public ContainerBuilderInterface setType(long typeID);

	/**
	 * Set containe parent ID. This builder will perform any lookup necessary
	 *
	 * @param parentID
	 * @return
	 */
	public ContainerBuilderInterface setParent(long parentID);

	/**
	 * Create Container object
	 *
	 * @return
	 */
	public ContainerInterface create();

}
