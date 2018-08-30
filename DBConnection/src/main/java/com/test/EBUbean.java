package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "ebu_info")
public class EBUbean {
	
	@Id
	@Column(name = "ebu_nbr")
	private int ebuID;
	
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "ebu_timezone")
	private String timezone;
	
	@Column(name = "ebu_city")
	private String city;
	
	@Column(name = "ebu_state")
	private String state;
	
	//constructor
	@Autowired
	public EBUbean() {
		super();
	}
	
	//getters, setters, hashcode, equals, toString
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public int getEbuID() {
		return ebuID;
	}
	public void setEbuID(int ebuID) {
		this.ebuID = ebuID;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result + ebuID;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((timezone == null) ? 0 : timezone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EBUbean other = (EBUbean) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (ebuID != other.ebuID)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (timezone == null) {
			if (other.timezone != null)
				return false;
		} else if (!timezone.equals(other.timezone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EBUbean [countryCode=" + countryCode + ", ebuID=" + ebuID + ", timezone=" + timezone + ", city=" + city
				+ ", state=" + state + "]";
	}	
	
}
