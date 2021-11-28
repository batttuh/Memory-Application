/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memory;

import ClinicalCase.ClinicalCase;

/**
 *
 * @author PC
 */
public class Amnesia extends MemoryDeficit {
    private String amnesia_type;
    private String cause;
    private String location;
    private ClinicalCase clin;
    private static int totalAmnesia=0;
    public Amnesia(String amnesia_type, String cause,String location ,String deficit_id,String memory_loss,String patient_id,String patient_name,String patient_surname,int age,String gender) {
        super(deficit_id, memory_loss);
        this.amnesia_type = amnesia_type;
        this.cause=cause;
        this.location=location;
        
        clin=new ClinicalCase(patient_id,patient_name,patient_surname,age,gender);
        
        totalAmnesia++;
        
    }
    public static int getTotalAmnesia(){
        return totalAmnesia; 
    }
    

    
    public String toString() {
     return "Deficit ID: "+super.deficit_id+"\n"+"Memory loss: "+super.memory_loss+"\n"+ clin.toString()+ "Amnesia Type: "+ amnesia_type+ "\n"+ "Cause: "+ cause +"\n" + "Location: "+ location+ "\n";    

    }

    
}
