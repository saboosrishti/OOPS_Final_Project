/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Business.EmployeeDirectory;
import Business.SpecialityFactory;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vikas
 */
public class TestJunitTest {
    
    public TestJunitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of test1 method, of class TestJunit.
     */
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
