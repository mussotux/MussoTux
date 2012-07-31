/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author munnaraju
 */
public class Writer {

    public static void main(String[] args) {
        FileWriter outFile;
        try {
            FileWriter fstream = new FileWriter("out.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write("Hello Java");
            out.write("Hello i am raju");
        } catch (IOException ex) {
            Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
