import org.junit.Test;

import Business.EmployeeDirectory;
import Business.SpecialityFactory;
import junit.framework.Assert;

public class TestJunit {
	@Test
	public void test1() {
		
		
		EmployeeDirectory re = new EmployeeDirectory();
	    Assert.assertEquals(false, re.ValidateEmployeeLogin("admin", "admin"));
		
	}
	@Test
	public void test2() {
		
		
		EmployeeDirectory re = new EmployeeDirectory();
		//re.getEmployeeList();
		
	    Assert.assertEquals(true, !re.ValidateEmployeeLogin("admin", "admin"));
		
	}
	
	@Test
	public void test3() {
		SpecialityFactory sp = new SpecialityFactory();
		//System.out.println(sp.getObject("Cardiology").getEmployeeDepartment());
		Assert.assertEquals(true, sp.getObject("Cardiology").getEmployeeDepartment().equals("Cardiology"));
	}
	@Test
	public void test4() {
		SpecialityFactory sp = new SpecialityFactory();
		//System.out.println(sp.getObject("Cardiology").getEmployeeDepartment());
		Assert.assertEquals(true, sp.getObject("Neurology").getEmployeeDepartment().equals("Neurology"));
	}
    
}
