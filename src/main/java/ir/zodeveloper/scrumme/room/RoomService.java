package ir.zodeveloper.scrumme.room;

import org.springframework.stereotype.Service;

@Service
public class RoomService {

	public Room createRoom(RoomRequestDto roomRequestDto) {
		roomRequestDto.validateCreationData();
	}
}
