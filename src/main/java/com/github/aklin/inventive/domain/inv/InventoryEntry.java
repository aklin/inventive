package com.github.aklin.inventive.domain.inv;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.aklin.inventive.domain.concrete.inventory.v0.item.ItemEntryDeserializer;
import com.github.aklin.inventive.domain.core.Describable;
import com.github.aklin.inventive.domain.core.Locatable;

@JsonDeserialize(using = ItemEntryDeserializer.class)
public interface InventoryEntry extends Locatable, Describable {
}
