package kodlamaio.Hrms.entities.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Entity
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
@Table(name = "candidates")
public class Candidate extends User{
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "birth_date")
	private int birthDate;
	
	@Transient
	private String passwordValidation;
	
	public Candidate() {
		
	}

	public Candidate(String firstName, String lastName, String identityNumber, int birthDate,
			String passwordValidation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
		this.passwordValidation = passwordValidation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public String getPasswordValidation() {
		return passwordValidation;
	}

	public void setPasswordValidation(String passwordValidation) {
		this.passwordValidation = passwordValidation;
	}

}
