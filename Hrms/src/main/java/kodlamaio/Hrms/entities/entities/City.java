package kodlamaio.Hrms.entities.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "cities")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "city_name")
	private String cityName;
	
	@OneToMany(mappedBy = "cities")
	private List<JobAdvert> jobAdverts;
	
	public City() {
		
	}

	public City(int id, String cityName, List<JobAdvert> jobAdverts) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.jobAdverts = jobAdverts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<JobAdvert> getJobAdverts() {
		return jobAdverts;
	}

	public void setJobAdverts(List<JobAdvert> jobAdverts) {
		this.jobAdverts = jobAdverts;
	}

}
