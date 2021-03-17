package ir.zodeveloper.scrumme.room;

public enum RoomVisibilityType {
	PUBLIC(0), PASSWORD_PROTECTED(1);

	private Integer code;

	RoomVisibilityType(Integer code) {

		this.code = code;
	}

	public Integer getCode() {

		return code;
	}

	public static RoomVisibilityType fromCode(Integer code) {

		for (RoomVisibilityType type : values())
			if (type.getCode().equals(code))
				return type;

		return null;
	}
}
