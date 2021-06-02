package kodlamaio.Hrms.entities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployerConfirmedByEmployee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "employer_id")
	private int employerId;
	
	@Column(name = "is_confirmed",columnDefinition = "boolean default false")
	private boolean isConfirmed;
}
