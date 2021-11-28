/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClinicalCase;

/**
 *
 * @author PC
 */
public class ClinicalCase {
    private String patient_id;
    private String patient_name;
    private String patiensurname;
    private int age;
    private String gender;

    public ClinicalCase(String patient_id, String patient_name, String patiensurname, int age, String gender) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patiensurname = patiensurname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
         return   "Patient ID: " + patient_id + "\n" + "Patient name: "+patient_name + "\n" + "Patient Surname: " + patiensurname + "\n" + "Age: "+age + "\n" + "Gender: " + gender+"\n";  

    }

    public String getPatient_id() {
        return patient_id;
    }
    
    
    
    
}
