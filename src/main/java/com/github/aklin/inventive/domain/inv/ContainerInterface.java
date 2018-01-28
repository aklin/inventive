package com.github.aklin.inventive.domain.inv;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.aklin.inventive.domain.concrete.inventory.v0.container.SimpleContainerDeserializer;
import com.github.aklin.inventive.domain.core.Hierarchical;

@JsonDeserialize(using = SimpleContainerDeserializer.class)
public interface ContainerInterface extends InventoryEntry, Hierarchical {

	public long getSlotsTotal();

	public long getSlotsFree();

	public long getSlotsOccupied();

}
