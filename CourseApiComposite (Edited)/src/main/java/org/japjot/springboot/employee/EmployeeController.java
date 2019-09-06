package org.japjot.springboot.employee;


import java.util.List;

import org.japjot.springboot.employee.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
     @RestController
public class EmployeeController {
	
      @Autowired
	public EmployeeService empser; 

      @GetMapping("/details/{empId}/{companyId}")
      public EmployeeInfo getdetails(@PathVariable Long empId, Long companyId) {
	         return empser.getdetailsById(empId,companyId);
	  }
    
      
      @GetMapping("/details")
      public List<EmployeeInfo> getAlldetails() {
	         return empser.getAll();
	  }

     @DeleteMapping(value="/details")
     public void deletedetails(@PathVariable Long empId,@PathVariable Long companyId) {
	         empser.deletedetails(empId,companyId);
      }
     @PutMapping(value="/details/{empId}/{companyId}")
     public void updateDetails(@RequestBody EmployeeInfo employeeInfo, @PathVariable Long empId,@PathVariable Long companyId) {
     	
    	 // employeeInfo.setEmployeeidentity(new EmployeeIdentity(CompId,EmpId));
    	    empser.updateDetails(empId,companyId,employeeInfo);
     }
     @PostMapping(value="/details/{empId}/{companyId}")
     public void adddetails(@RequestBody EmployeeInfo employeeInfo,@PathVariable Long empId,@PathVariable Long companyId) {
    	 // employeeInfo.setEmployeeidentity(new EmployeeIdentity(CompId,EmpId));
	        empser.adddetails(empId,companyId,employeeInfo);
	       
     }
     

    


}
