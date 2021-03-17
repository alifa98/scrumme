package ir.zodeveloper.scrumme.common.entity.listener;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import ir.zodeveloper.scrumme.common.entity.AbstractEntity;

public class CreateOrUpdateEntityListener {

	@PrePersist
	public void preCreate(final AbstractEntity entity) {
		entity.setCreationDate(new Date());
		entity.setLastModifiedDate(new Date());
	}

	@PrePersist
	@PreUpdate
	public void preUpdate(final AbstractEntity entity) {
		entity.setLastModifiedDate(new Date());
	}

}
