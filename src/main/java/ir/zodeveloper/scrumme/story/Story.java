package ir.zodeveloper.scrumme.story;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ir.zodeveloper.scrumme.common.entity.AbstractEntity;
import ir.zodeveloper.scrumme.room.Room;
import ir.zodeveloper.scrumme.user.User;

@Entity
@Table(name = "SCRUMMI_STORY")
public class Story extends AbstractEntity {

	@Column(length = 100, nullable = false)
	private String title;

	@Column(length = 300)
	private String description;

	private Integer point;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_fk", nullable = false)
	private Room room;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "creator_fk", nullable = false)
	private User creator;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

}
