package org.japjot.springboot.employee;

  import java.util.List;
  import org.japjot.springboot.employee.*;

  import org.springframework.stereotype.Service;

import jdk.internal.org.jline.utils.Log;

  @Service
     public class EmployeeService {
	
     private EmployeeRepository emprep;

     private EmployeeIdentity employeeIdentity;

     private EmployeeInfo employeeInfo;

     public void adddetails(Long empId, Long companyId,EmployeeInfo employeeInfo) {
	        EmployeeIdentity employeeIdentity = new EmployeeIdentity();
	        employeeIdentity.setEmpId(empId);
	        employeeIdentity.setCompanyId(companyId);
	        emprep.save(employeeInfo);
	      // Log.debug("employee identity emp id:"+ empId +"employeecompanyid :" + companyId+"employeeInfo :"+ employeeInfo);
     }


     public EmployeeInfo getdetailsById(Long empId,Long companyId) {
            return emprep.findById(empId,companyId);
     }
     
     public List<EmployeeInfo> getAll() {

         return emprep.findAll();
	         
     }

     public void updateDetails(Long empId, Long companyId,EmployeeInfo employeeInfo) {
    	    EmployeeIdentity employeeIdentity = new EmployeeIdentity();
	        employeeIdentity.setEmpId(empId);
	        employeeIdentity.setCompanyId(companyId);
	        emprep.save(employeeInfo);
	       // Log.debug("employee info:"+employeeInfo);
    	 
     }
     public void deletedetails(Long empId, Long companyId) {
    	 emprep.deleteById(empId,companyId);
     }








}
