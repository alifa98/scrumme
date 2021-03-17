package ir.zodeveloper.scrumme.common.exception.suberror;

import ir.zodeveloper.scrumme.common.exception.ApiSubError;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class ValidationError implements ApiSubError {

	private String entity;
	private String field;
	private Object rejectedValue;
	private String message;

	ValidationError(String object, String message) {
		this.entity = object;
		this.message = message;
	}

}
