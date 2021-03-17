package ir.zodeveloper.scrumme.room;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ir.zodeveloper.scrumme.common.entity.AbstractEntity;
import ir.zodeveloper.scrumme.user.User;

@Entity
@Table(name = "SCRUMMI_ROOM")
public class Room extends AbstractEntity {

	@Column(length = 100, nullable = false)
	private String name;

	@Column(length = 6, nullable = false, unique = true)
	private String code;

	@Column(nullable = false)
	@Convert(converter = RoomVisibilityTypeAttributeConverter.class)
	private RoomVisibilityType type;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "creator_fk", nullable = false)
	private User creator;

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public RoomVisibilityType getType() {

		return type;
	}

	public void setType(RoomVisibilityType type) {

		this.type = type;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

}
