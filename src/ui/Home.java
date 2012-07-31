/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author suresh
 */
public class Home extends JPanel{
JLabel labels;
    public Home(){
        labels = new JLabel("this is me");
        add(labels);
    }

}
