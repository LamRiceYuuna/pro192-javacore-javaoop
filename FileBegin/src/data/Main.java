

package data;


import java.io.*;
/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String fname = "";
        File f = new File(fname);
        if(f.exists())
            System.out.println("The file" + fname + "does not exist");
        else {
            System.out.println("The file" + fname + " exists");
             
            
            
        }
        
    }
    
}
