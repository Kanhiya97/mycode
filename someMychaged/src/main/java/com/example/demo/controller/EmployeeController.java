package com.example.demo.controller;
import java.util.List;
import java.util.Map;
import java.util.Optional;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
 
import org.springframework.http.HttpHeaders;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.employeeService.EmployeeServices;
import com.example.demo.entites.EmployeeAddress;
 
import com.example.demo.entites.EmployeeEnitites;
import com.example.demo.entites.EmployeeFamily;
 
@RestController
 
 @RequestMapping( "/Employees" )
public class EmployeeController {
	@Autowired
	private EmployeeServices employeeService;
	
	 
 
	
	//get All Employees
	@GetMapping("/allEmployee")
	public  ResponseEntity<Map<String, Object>> getAll(@RequestParam(value="pageNo",defaultValue = "1")  int pageNo,@RequestParam(value="pageSize",defaultValue = "1") @DefaultValue("1") int pageSize){
		Map<String, Object> response= employeeService.empAll(pageNo,pageSize);
          
		 
		return new ResponseEntity<>(response, HttpStatus.OK);  
	}
	
	//Get all Employee 
	@GetMapping("/allEmp")
	public ResponseEntity<List<EmployeeEnitites>> getAllEmp(){
		
		List<EmployeeEnitites> list=employeeService.allEmployye();	
		return	ResponseEntity.of(Optional.of(list));
		}
	
	@GetMapping("findEmp/{id}")
	public ResponseEntity<Optional<EmployeeEnitites>> getById(@PathVariable("id") int id) {
		 
		Optional<EmployeeEnitites> list=employeeService.findById(id);
		HttpHeaders headers1 = new HttpHeaders();
		headers1.add("Employe is not here", "not found");
		if(list.isEmpty()) {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Employe is not here", "not found");
			  return new ResponseEntity("Employee not found", headers, HttpStatus.OK);
			 
			}
		 
		return ResponseEntity.of(Optional.of(list));
		}
	
	 
	   
	  @PostMapping(value = "/addEmp", produces  = {"application/json"})
	  public ResponseEntity<EmployeeEnitites> addEmp(@RequestBody EmployeeEnitites addEmployee ){
		  
		  System.out.println("fdfkjlkfldlfjfljlkdljflk");
		  System.out.println(addEmployee );
		  employeeService.addEmp(addEmployee);
		  HttpHeaders headers = new HttpHeaders();
			headers.add("Employe add", "not found");
		  return new ResponseEntity("Employee  save", headers, HttpStatus.OK);
         
	}
	   
	 
	@PutMapping("/update")
	public ResponseEntity updateEmp(@RequestBody EmployeeEnitites updateEmployee) {
		EmployeeEnitites update=null;
		HttpHeaders headers = new HttpHeaders();
		update=	employeeService.updateEmployee(updateEmployee);
		if(update==null) {
		return	new ResponseEntity(" Employee id is wrong ", headers, HttpStatus.BAD_REQUEST);
		}
		 headers.add("insert Employee", "done");
		  return new ResponseEntity(" update Employee details ", headers, HttpStatus.OK);
		 
		
	}
	@DeleteMapping("empDelete/{id}")
	public ResponseEntity<EmployeeEnitites> deleteEmp(@PathVariable("id") EmployeeEnitites id )
	{
		EmployeeEnitites delete=null;
		delete=	employeeService.removeEmp(id);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Deleate employee", "deleteEmployee");
		return new ResponseEntity("Employee has been  deleted ", headers, HttpStatus.OK);
		
	}
	
	//findByName
		@GetMapping("/findByName")
		public ResponseEntity<List<EmployeeEnitites>> findByname(@RequestParam("firstName") String firstName) {
			 
			List<EmployeeEnitites> list=employeeService.findByName(firstName);
			HttpHeaders headers1 = new HttpHeaders();
			headers1.add("Employe is not here", "not found");
			if(list.isEmpty()) {
				HttpHeaders headers = new HttpHeaders();
				headers.add("Employe is not here", "not found");
				  return new ResponseEntity("Employee not found", headers, HttpStatus.OK);
				 
				}
			 
			return ResponseEntity.of(Optional.of(list));
			}

	 
 
}


 
