package com.github.aklin.inventive.domain;


public interface ContainerInterface extends InventoryEntry, Hierarchical {

	public long getSlotsTotal();

	public long getSlotsFree();

	public long getSlotsOccupied();

}
