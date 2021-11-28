/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memory;

import javafx.geometry.VPos;

/**
 *
 * @author PC
 */
public abstract class MemoryDeficit {
    protected String deficit_id;
    protected String memory_loss;
    protected static int totalDeficit=0;
    MemoryDeficit(String deficit_id,String memory_loss){
        this.deficit_id=deficit_id;
        this.memory_loss=memory_loss;
        totalDeficit++;
    }
    public abstract String toString();
    
    public static int getTotalDeficit(){
        return totalDeficit;
    }
    public  String getDeficit_id(){
        return deficit_id;
    }
   
}
