
import Memory.Alzheimer;
import Memory.Amnesia;
import Memory.MemoryDeficit;
import java.util.ArrayList;

public class InfoClass {
    
    static ArrayList<MemoryDeficit> memoryArrayList=new ArrayList<MemoryDeficit>();
        
    
    public static void addMemory(MemoryDeficit def){
        memoryArrayList.add(def);
    }
    public static String getAllMemory(){
        String b="";
        MemoryDeficit memoryDeficit;
        for(int i=0;i<memoryArrayList.size();i++){
            memoryDeficit=memoryArrayList.get(i);
            b+=memoryDeficit.toString();
            b+="\n";
        }
        return b;
    }
    public static String getAmnesia(){
        MemoryDeficit memoryDeficit;
        String b="";
        for(int i=0;i<memoryArrayList.size();i++){
            memoryDeficit=memoryArrayList.get(i);
            if(memoryDeficit instanceof Amnesia){
                b+=memoryDeficit.toString();
                b+="\n";
            }
            
        }
        return b;
    }
    public static String getAlzheimer(){
        MemoryDeficit memoryDeficit;
         String b="";
        for(int i=0;i<memoryArrayList.size();i++){
             memoryDeficit=memoryArrayList.get(i);
            if(memoryDeficit instanceof Alzheimer){
               b+=memoryDeficit.toString();
                b+="\n";
            }
            
        }
        return b;
    }
    public static MemoryDeficit searchMemory(String id){
        for(int i=0;i<memoryArrayList.size();i++){
            if((memoryArrayList.get(i).getDeficit_id()).equals(id)){
                return memoryArrayList.get(i);
            }
            
        }
        return null;
    }
    public static String showTotalMemory(){
         return ("Total Desificits: " +MemoryDeficit.getTotalDeficit()+"\n"+"Total Amnestics: "+Amnesia.getTotalAmnesia() + "\n"+"Total Alzheimers: " + Alzheimer.getTotalAlzheimer());

    }
    public static String showImprovement(){
        return "fds";
    }
}
