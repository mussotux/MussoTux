/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.FlowLayout;
import javax.swing.*;
import ui.MainFrame;

/**
 *
 * @author munnaraju
 */
public class TestPanel extends javax.swing.JPanel {

    String inputText;
    JPopupMenu menu1;
    JMenuItem item1, item2;
    MainFrame mf;
    FlowLayout fl,fl1;

    /**
     * Creates new form TestPanel
     */
    public TestPanel() {
        initComponents();


        fl = new FlowLayout();
        menuPanel.setLayout(fl);
        fl.setVgap(0);
//        fl.setHgap(200);
        fl.setAlignment(FlowLayout.LEFT);

        JMenuBar jb = new JMenuBar();

        JMenu mn = new JMenu("Files");
        JMenuItem mi = new JMenuItem("Open");
        JMenuItem mi1 = new JMenuItem("Save");

        JMenu menu2 = new JMenu("Edit");
        JMenuItem ni = new JMenuItem("Cut");
        JMenuItem ni1 = new JMenuItem("Copy");

        menuPanel.add(jb);
        menuPanel.add(mn);
        menuPanel.add(mi);
        menuPanel.add(mi1);
        menuPanel.add(menu2);
        menuPanel.add(ni);
        menuPanel.add(ni1);
        jb.add(menu2);
        menu2.add(ni);
        menu2.add(ni1);

        jb.add(mn);
        mn.add(mi);
        mn.add(mi1);
//        menuPanel.add(jb);






    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        menuPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton1)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    void TestPanelMenu(TestPanel tp) {
//        fl = new FlowLayout();
//        tp.setLayout(fl);
//        fl.setVgap(0);
////        fl.setHgap(200);
//        fl.setAlignment(FlowLayout.LEFT);
//
//        JMenuBar jb = new JMenuBar();
//
//        JMenu mn = new JMenu("Files");
//        JMenuItem mi = new JMenuItem("Open");
//        JMenuItem mi1 = new JMenuItem("Save");
//
//        JMenu menu2 = new JMenu("Edit");
//        JMenuItem ni = new JMenuItem("Cut");
//        JMenuItem ni1 = new JMenuItem("Copy");
//
//
//        jb.add(menu2);
//        menu2.add(ni);
//        menu2.add(ni1);
//
//        jb.add(mn);
//        mn.add(mi);
//        mn.add(mi1);
//        tp.add(jb);
    }
}
