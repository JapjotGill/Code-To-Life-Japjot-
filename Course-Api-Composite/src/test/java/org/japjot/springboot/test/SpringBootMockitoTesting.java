package org.japjot.springboot.test;

import org.japjot.springboot.employee.EmployeeRepository.*;
import org.japjot.springboot.employee.EmployeeRepository;
import org.japjot.springboot.employee.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMockitoTesting {

	@Autowired
	private EmployeeService EmpSer;
	
	@MockBean
	private EmployeeRepository EmpRep;
	
	@Test
	public void getAllTest() {
	
	}
	
	
}
