/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Name
 */
public class HospitalAdminSingleton {
    private static Employee hospitalAdminInstance = null;

    private HospitalAdminSingleton() {
    }
    public static Employee getInstance(){
        if(hospitalAdminInstance == null){
            hospitalAdminInstance = new HospitalAdminEmployee();
            return hospitalAdminInstance;
        }
        else
            return hospitalAdminInstance;
    }
}
