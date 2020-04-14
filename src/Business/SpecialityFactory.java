/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author arpita
 */
public class SpecialityFactory implements AbstractDoctorFactory {
    @Override
    public DoctorEmployee getObject(String doctorDepartment) {
        switch (doctorDepartment) {
            case "Cardiology":
                return new Cardiologist(doctorDepartment);
            case "Neurology":
                return new Neurologist(doctorDepartment);
            case "Orthology":
                return new Orthologist(doctorDepartment);
            default:
                return new Pediatrician(doctorDepartment);
        }
    }
}
