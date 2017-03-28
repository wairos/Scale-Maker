/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scalemaker;

/**
 *
 * @author waire
 */
public class LowerAndRaise {

    public static String lowerNote(String name) {
        if(name.length() == 1){
        name = name + "b"; 
        return name;
        }
        if(name.length() >= 2){
            switch(name) 
        {
            case "C#":case "D#":case "E#":case "F#":
            case "G#":case "A#":case "B#":
                name = name.replace("#",  "");
                break;
            case "Cb":case "Db":case "Eb":case "Fb":
            case "Gb":case "Ab":case "Bb":
                 name = name + 'b';
                 break;
            case "C##":case "D##":case "E##":case "F##":
            case "G##":case "A##":case "B##":
                name = name.replace("##","#");
                break;
            case "Cbb":case "Dbb":case "Ebb":case "Fbb":
            case "Gbb":case "Abb":case "Bbb":
                 System.out.println("Try a different scale");
                 break;      
            }
        }     
                return name;
        
    }   public static String raiseNote(String name) {
        if(name.length() == 1){
        name = name + "#"; 
        return name;
        }
        if(name.length() >= 2){
            switch(name) 
            {
            case "C#":case "D#":case "E#":case "F#":
            case "G#":case "A#":case "B#":
                name = name.replace("#",  "##");
                break;
            case "Cb":case "Db":case "Eb":case "Fb":
            case "Gb":case "Ab":case "Bb":
                 name = name.replaceAll("b", "");
                 break;
            case "C##":case "D##":case "E##":case "F##":
            case "G##":case "A##":case "B##":
                System.out.println("Try a different scale");
                break;
            case "Cbb":case "Dbb":case "Ebb":case "Fbb":
            case "Gbb":case "Abb":case "Bbb":
                 name = name.replace("bb","b");
                 break; 
            }
        }
                return name;
        
    } 
    
    
}
