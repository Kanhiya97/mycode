package com.example.demo.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.entites.*;

 
@Repository
public interface EmployeeRepositery extends JpaRepository<EmployeeEnitites,Integer>{
	
	@Query(value ="select *from employe_record as er inner join employee_add_record as ed on er.id=ed.adress_id inner join\r\n"
			+ "employee_family_info_record as ef on er.id=ef.id where er.first_name=:name",nativeQuery = true)
	List<EmployeeEnitites> findByName(@Param("name") String firstName);	
	
}
