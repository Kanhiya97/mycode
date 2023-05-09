package com.example.demo.entites;
import javax.persistence.*;
@Entity
@Table(name = "EmployeeFamilyInfoRecord")
 public class EmployeeFamily   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
   private String relation;
   
   private Long mobileNo;

public EmployeeFamily() {
	super();
	// TODO Auto-generated constructor stub
}

public EmployeeFamily(int id, String name, String relation, Long mobileNo) {
	super();
	this.id = id;
	this.name = name;
	this.relation = relation;
	this.mobileNo = mobileNo;
}

@Override
public String toString() {
	return "EmployeeFamily [id=" + id + ", name=" + name + ", relation=" + relation + ", mobileNo=" + mobileNo + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRelation() {
	return relation;
}

public void setRelation(String relation) {
	this.relation = relation;
}

public Long getMobileNo() {
	return mobileNo;
}

public void setMobileNo(Long mobileNo) {
	this.mobileNo = mobileNo;
}
   
   
    
}
