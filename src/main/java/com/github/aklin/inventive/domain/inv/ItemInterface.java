package com.github.aklin.inventive.domain.inv;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.aklin.inventive.domain.concrete.inventory.v0.item.ItemEntryDeserializer;

@JsonDeserialize(using = ItemEntryDeserializer.class)
public interface ItemInterface extends InventoryEntry {
}
