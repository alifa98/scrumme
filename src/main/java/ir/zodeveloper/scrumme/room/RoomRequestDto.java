package ir.zodeveloper.scrumme.room;

import ir.zodeveloper.scrumme.common.dto.CommonRequestDto;

public class RoomRequestDto extends CommonRequestDto {

	private Long id;

	private String name;

	private String code;

	private RoomVisibilityType type;

	private Long creator;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public void validateCreationData() {

	}

}
