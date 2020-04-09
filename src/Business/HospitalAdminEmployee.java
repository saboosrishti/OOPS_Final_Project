package Business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name
 */
public class HospitalAdminEmployee extends Employee{
    
    public HospitalAdminEmployee() {
        super("admin","admin");
        super.setFirstName("Cool");
        super.setLastName("Administrator");
        this.employeeDepartment = "Admin";
    }
    
    
}
