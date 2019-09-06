package org.japjot.springboot.employee;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeInfo, EmployeeIdentity>{

	public EmployeeInfo findById(Long empId, Long companyId);

	public void deleteById(Long empId, Long companyId);
	
	

	
	
}
