/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author munnaraju
 */
import java.io.*;
import java.io.File;
import javax.swing.filechooser.FileFilter;

class TxtSaveFilter extends FileFilter {

    public boolean accept(File f) {
        if (f.isDirectory()) {
            return false;
        }

        String s = f.getName();

        return s.endsWith(".txt") || s.endsWith(".TXT");
    }

    public String getDescription() {
        return "*.txt,*.TXT";
    }
}
