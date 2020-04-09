package Business;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Name
 */
public class HospitalDirectory {

    List<Person> hospitalDirectory;

    public HospitalDirectory() {
        this.hospitalDirectory = new ArrayList<>();
    }

    public void UpdateHospitalDirectory(Person personObject) {
        this.hospitalDirectory.add(personObject);
    }

//    public Person ValidateUserIdPassword(String userName, String userPassword) {
//
//        for (Person userID : hospitalDirectory) {
//
//        }
//    }
}
