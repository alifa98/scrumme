package ir.zodeveloper.scrumme.room;

import ir.zodeveloper.scrumme.common.CommonUtil;

public class RoomUtil {

	private RoomUtil() {
		// This is Utility Class.
	}

	public Room getRoomInstance(RoomRequestDto requestDto) {

		Room roomInstance = new Room();
		roomInstance.setName(requestDto.getName());
		roomInstance.setType(requestDto.getType());
		roomInstance.setCode(CommonUtil.getRandomString(6));

		return roomInstance;
	}

}
