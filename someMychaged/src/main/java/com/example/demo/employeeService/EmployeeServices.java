package com.example.demo.employeeService;

 


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
 
import com.example.demo.entites.EmployeeAddress;
 
import com.example.demo.entites.EmployeeEnitites;

 
 
@Service
public class EmployeeServices {
	
	@Autowired
	private EmployeeRepositery employeeRepo;
	 

	public Map<String, Object> empAll(int pageNo,int pageSize) {
		
		java.util.List<EmployeeEnitites> allEmployees = new ArrayList<EmployeeEnitites>();
		
		PageRequest paging = PageRequest.of(pageNo, pageSize);
		
		Page<EmployeeEnitites> pagedResult = employeeRepo.findAll(paging);
		
		 allEmployees=pagedResult.getContent();
		 Map<String, Object> response = new HashMap<>();
		 response.put("Employees", allEmployees);
		 response.put("currentPage", pagedResult.getNumber());
	     response.put("totalItems", pagedResult.getTotalElements());
	     response.put("totalPages", pagedResult.getTotalPages());
	     
		return   response;
	}
	
	public List<EmployeeEnitites> allEmployye() {
		List<EmployeeEnitites> empData =null;
		 	empData=employeeRepo.findAll();
		 return empData;
	}

	public Optional<EmployeeEnitites> findById(int id) {
		Optional<EmployeeEnitites> empData =null;
		 	empData=employeeRepo.findById(id);
		 
		return empData;
	}
	 
	
	public EmployeeEnitites removeEmp(EmployeeEnitites id) {
		employeeRepo.delete(id);
		return id;
		
	}
	
	public EmployeeEnitites addEmp(EmployeeEnitites emp) {
		
		EmployeeEnitites addData=employeeRepo.save(emp);
		System.out.println("servifdfjkdjfkdfk");
		System.out.println(addData);
		return addData;
		
	}
	
	public EmployeeEnitites updateEmployee(EmployeeEnitites updaeEmp) {
		employeeRepo.save(updaeEmp);
		return updaeEmp;
		
	}
	
	public List<EmployeeEnitites> findByName(String firstName) {
		List<EmployeeEnitites> data= employeeRepo.findByName(firstName);
		return data; 	 
 }
}
		 

