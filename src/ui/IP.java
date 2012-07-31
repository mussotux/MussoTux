/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author suresh
 */
public class IP {

    static String[] header;
    static String userList;
    static String message;
    String[] single_user;
    public static String[] users = new String[10];
    static String group_id;
    String pri[];
    String GID;
    String UserName;
    String Message;

    public void ParseInput(String input) {
        header = input.split("::");

        if (header[0].equalsIgnoreCase("ul")) {
            System.out.println("It is user list and users are " + header[1]);
            userList = header[1];

            single_user = userList.split(";");
            try {
                for (int a = 0; a <= single_user.length; a++) {
                    System.out.println("User :" + a + single_user[a]);
                    users[a] = single_user[a];
                    System.out.println("user placed");
                }

            } catch (Exception ex) {
            }



        } else if (header[0].equalsIgnoreCase("msg")) {
            System.out.println("It is message and the message is " + header[1]);
            message = header[1];
        } else if (header[0].equalsIgnoreCase("GID")) {
            group_id = header[1];
            System.out.println("Group id has been received as " + group_id);

        } else {
            String priv = header[0];
            pri = priv.split(":");
            if (pri[0].equalsIgnoreCase("PM")) {
                GID = pri[1];
                UserName = pri[2];
                Message = pri[3];
                System.out.println("gid is: " + GID + " username is " + UserName + " message is :" + pri[3]);


                if (PrivateChat.state == true) {
                        String[] parts = HomePanel.self.split("#");
                        String id = parts[1];
                        System.out.println("IDDDDDDDDDDDDDDD = " + id);
                        System.out.println("ZZZZZZZZZZZZZZZ =  "+HomePanel.self_id);


                    if (PrivateChat.username.getText().contains(UserName)) {

                        PrivateChat.displayTextArea.append(HomePanel.self + ":" + Message + "\n");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, UserName + " : " + Message);

                }
            }
        }
    }
}
