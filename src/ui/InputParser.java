/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author suresh
 */
public class InputParser {

    int i;
    static int j;
    static String userList, messageList, testString;
    static String[] single_user;
    String ull;
    static String[] arr;
    static String[] user;
    String name1, name2, name3, name4;


    JLabel[] labels;
    HomePanel hp;

    public void parse(String input) {

        arr = input.split("::");
        System.out.println("Array input length :" + arr.length);

      for (i = 0; i < arr.length; i++) {

          System.out.println("Input array " + i + "  :" + arr[i]);
           

           userList = arr[i];
            if (!userList.equals("ul")) {
//            if(arr[0].equalsIgnoreCase("ul")){
//                userList = arr[1];
                single_user = userList.split(";");

                int users = single_user.length;
                System.out.println("No of Users:" + users);

                for (j = 0; j < single_user.length; j++) {

                    System.out.println("User array" + j + "  :" + single_user[j]);
                    try {


                        name1 = single_user[0];
                        name2 = single_user[1];
                        name3 = single_user[2];
                        name4 = single_user[3];



                    } catch (Exception ex) {
                    }

                    System.out.println("NAMES:" + name1+name2+name3+name4);
                }

            }

            if (userList.equals("msg")) {
                System.out.println("message is detected");


            }
       }


    }

    public void getUserID(String username) {
        int index = username.indexOf("#");
        JOptionPane.showMessageDialog(hp, "INDEX OF # IS" + index);
    }
}
