
package Memory;

import ClinicalCase.ClinicalCase;


public class Alzheimer extends MemoryDeficit{
    private String declining_area;
    private static int totalAlzheimer=0;
    private ClinicalCase clin;

    public Alzheimer(String declining_area, String deficit_id,String memory_loss,String patient_id,String patient_name,
    String patient_surname,int age,String gender) {
        super(deficit_id,memory_loss);
        this.declining_area = declining_area;
        
        
        clin=new ClinicalCase(patient_id,patient_name,patient_surname,age,gender);
        
        totalAlzheimer++;
        
    }
    public static int getTotalAlzheimer() {
        return totalAlzheimer;
        
    }

    @Override
    public String toString() {
        return "Deficit ID: "+super.deficit_id+"\n"+"Memory loss: "+Alzheimer.super.memory_loss+"\n"+ clin.toString()+ "Declining Area: "+declining_area + "\n"  ;

    }
    
}
