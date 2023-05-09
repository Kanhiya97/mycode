package com.example.demo.entites;
 
import java.util.*;
import javax.persistence.*;
@Table(name ="EmployeRecord")
@Entity
public class EmployeeEnitites    {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int id;
	
    private String firstName;
	 
    private String lastName;
	 
    private String gender;
	 
    private String dob;
	 
    private String fatherName;
	 
    private String bloodGroup;
	 
	private Long moblieNumber;
	 
	private  String emailId;
	  
	@OneToMany(targetEntity =EmployeeAddress.class ,cascade = CascadeType.ALL)
	@JoinColumn(name="emp_add",referencedColumnName = "emp_id")
     private   List<EmployeeAddress> employeeAdress;
	  
	@OneToMany(targetEntity = EmployeeFamily.class,cascade = CascadeType.ALL )
	@JoinColumn(name="emp_family",referencedColumnName = "emp_id") 
	private   List<EmployeeFamily> employeeFamily;

	public EmployeeEnitites() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeEnitites(int id, String firstName, String lastName, String gender, String dob, String fatherName,
			String bloodGroup, Long moblieNumber, String emailId, List<EmployeeAddress> employeeAdress,
			List<EmployeeFamily> employeeFamily) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.fatherName = fatherName;
		this.bloodGroup = bloodGroup;
		this.moblieNumber = moblieNumber;
		this.emailId = emailId;
		this.employeeAdress = employeeAdress;
		this.employeeFamily = employeeFamily;
	}

	@Override
	public String toString() {
		return "EmployeeEnitites [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", dob=" + dob + ", fatherName=" + fatherName + ", bloodGroup=" + bloodGroup
				+ ", moblieNumber=" + moblieNumber + ", emailId=" + emailId + ", employeeAdress=" + employeeAdress
				+ ", employeeFamily=" + employeeFamily + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Long getMoblieNumber() {
		return moblieNumber;
	}

	public void setMoblieNumber(Long moblieNumber) {
		this.moblieNumber = moblieNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<EmployeeAddress> getEmployeeAdress() {
		return employeeAdress;
	}

	public void setEmployeeAdress(List<EmployeeAddress> employeeAdress) {
		this.employeeAdress = employeeAdress;
	}

	public List<EmployeeFamily> getEmployeeFamily() {
		return employeeFamily;
	}

	public void setEmployeeFamily(List<EmployeeFamily> employeeFamily) {
		this.employeeFamily = employeeFamily;
	}

	
	  }

 
