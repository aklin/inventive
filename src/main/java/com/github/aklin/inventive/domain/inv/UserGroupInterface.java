package com.github.aklin.inventive.domain.inv;

import com.github.aklin.inventive.domain.core.Describable;
import com.github.aklin.inventive.domain.core.Hierarchical;
import com.github.aklin.inventive.domain.core.Identifiable;
import com.github.aklin.inventive.domain.core.Nameable;
import com.github.aklin.inventive.services.IUserEntryService;

public interface UserGroupInterface extends Identifiable, Nameable, Describable, Hierarchical, IUserEntryService {
}
