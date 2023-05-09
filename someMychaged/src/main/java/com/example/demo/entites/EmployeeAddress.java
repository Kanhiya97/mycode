package com.example.demo.entites;
import javax.persistence.*;
 
@Entity
@Table(name="Employee_AddRecord")
public class EmployeeAddress   {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int adressId;
    private String homeNo;
	
	private String colonyName;
	
	private String landMarks;
	
	private String city;
	
	private String state;
	
	private String pinCode;

	public EmployeeAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeAddress(int adressId, String homeNo, String colonyName, String landMarks, String city, String state,
			String pinCode) {
		super();
		this.adressId = adressId;
		this.homeNo = homeNo;
		this.colonyName = colonyName;
		this.landMarks = landMarks;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [adressId=" + adressId + ", homeNo=" + homeNo + ", colonyName=" + colonyName
				+ ", landMarks=" + landMarks + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}

	public int getAdressId() {
		return adressId;
	}

	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}

	public String getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}

	public String getColonyName() {
		return colonyName;
	}

	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}

	public String getLandMarks() {
		return landMarks;
	}

	public void setLandMarks(String landMarks) {
		this.landMarks = landMarks;
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

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
 

	 
	 
}
