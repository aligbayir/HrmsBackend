package kodlamaio.Hrms.entities.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "job_advert")
public class JobAdvert {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_advert_name")
	private String JobAdvertName;
	
	@ManyToOne
	@Column(name = "employer_id")
	private int employerId;
	
	@ManyToOne
	@JoinColumn(name = "job_position_id")
	@Column(name = "job_position_id")
	private int jobPositionId;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	@Column(name = "city_id")
	private int cityId;
	
	@Column(name = "salary_max")
	private int salaryMax;
	
	@Column(name = "salary_min")
	private int salaryMin;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "open_position_count")
	private int openPositionCount;
	
	@Column(name = "application_deadline")
	private LocalDate applicationDeadLine;
	
	public JobAdvert() {
		
	}

	public JobAdvert(int id, String jobAdvertName, int employerId, int jobPositionId, int cityId, int salaryMax,
			int salaryMin, String description, int openPositionCount, LocalDate applicationDeadLine) {
		super();
		this.id = id;
		JobAdvertName = jobAdvertName;
		this.employerId = employerId;
		this.jobPositionId = jobPositionId;
		this.cityId = cityId;
		this.salaryMax = salaryMax;
		this.salaryMin = salaryMin;
		this.description = description;
		this.openPositionCount = openPositionCount;
		this.applicationDeadLine = applicationDeadLine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobAdvertName() {
		return JobAdvertName;
	}

	public void setJobAdvertName(String jobAdvertName) {
		JobAdvertName = jobAdvertName;
	}

	public int getEmployerId() {
		return employerId;
	}

	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}

	public int getJobPositionId() {
		return jobPositionId;
	}

	public void setJobPositionId(int jobPositionId) {
		this.jobPositionId = jobPositionId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getSalaryMax() {
		return salaryMax;
	}

	public void setSalaryMax(int salaryMax) {
		this.salaryMax = salaryMax;
	}

	public int getSalaryMin() {
		return salaryMin;
	}

	public void setSalaryMin(int salaryMin) {
		this.salaryMin = salaryMin;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOpenPositionCount() {
		return openPositionCount;
	}

	public void setOpenPositionCount(int openPositionCount) {
		this.openPositionCount = openPositionCount;
	}

	public LocalDate getApplicationDeadLine() {
		return applicationDeadLine;
	}

	public void setApplicationDeadLine(LocalDate applicationDeadLine) {
		this.applicationDeadLine = applicationDeadLine;
	}
}
