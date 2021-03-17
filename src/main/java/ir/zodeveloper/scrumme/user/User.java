package ir.zodeveloper.scrumme.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import ir.zodeveloper.scrumme.common.entity.AbstractEntity;

@Entity
@Table(name = "SCRUMMI_USER")
public class User extends AbstractEntity {

	@Column(length = 20)
	private String name;

	@Column(length = 100, unique = true)
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
