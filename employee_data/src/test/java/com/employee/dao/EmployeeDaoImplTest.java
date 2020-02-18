/**
 * 
 */
package com.employee.dao;
import static org.junit.Assert.assertNotNull;

import static org.assertj.core.api.Assertions.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.employee.entity.Employee;



 @Sql(scripts= {"classpath:/db/create-tables.sql"})
 @ContextConfiguration("classpath:data-context.xml")
 @RunWith(SpringRunner.class)
public class EmployeeDaoImplTest {
	 
	 
	 
	 @Autowired // we wired in the bean of the employeeDao
	 EmployeeDao employeeDaoImpl;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void dbConnectionTest() throws SQLException {
		String jdbcUrl = "jdbc:mysql://localhost:3306/employee_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		String user = "employee_user";
		String password = "employee123";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		
		
		Connection dbCon = null;
		try {
			dbCon = DriverManager.getConnection(jdbcUrl, user, password );
			
			assertThat(dbCon).isNotNull();
			assertNotNull(dbCon);
			}
			catch(SQLException sqle) {
				sqle.printStackTrace();
		
		}
			finally {
				dbCon.close();
			}
		
	}
	
	
	@Test
	public void saveEmployeeToDBTest() {
		
		
		Employee newEmployee = new Employee();
		newEmployee.setFirstName("Mary");
		newEmployee.setLastName("Black");
		newEmployee.setEmail("mary@mail.com");
		newEmployee.setPhoneNumber("09045");
		
		Date employeeDate = Date.valueOf("2000-07-24");
		newEmployee.setDateOfBirth(employeeDate);
		
		assertThat(employeeDaoImpl).isNotNull();
		
		employeeDaoImpl.saveEmployee(newEmployee);
		
		int id = newEmployee.getEmployeeId();
		Employee existingEmployee = employeeDaoImpl.getById(id);
		assertThat(existingEmployee).isNotNull();
		//assertThat(existingEmployee)employeeDate.
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
