package com.github.aklin.inventive.domain.inv;


import com.github.aklin.inventive.domain.core.Hierarchical;

public interface ContainerInterface extends InventoryEntry, Hierarchical {

	public long getSlotsTotal();

	public long getSlotsFree();

	public long getSlotsOccupied();

}
