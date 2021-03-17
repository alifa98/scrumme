package ir.zodeveloper.scrumme.room;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class RoomVisibilityTypeAttributeConverter implements AttributeConverter<RoomVisibilityType, Integer> {

	@Override
	public Integer convertToDatabaseColumn(RoomVisibilityType attribute) {

		return attribute.getCode();
	}

	@Override
	public RoomVisibilityType convertToEntityAttribute(Integer dbData) {

		return RoomVisibilityType.fromCode(dbData);
	}
}
