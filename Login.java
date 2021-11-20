import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login {

    /*In this program we will be looking at a simple login system, with GUI.
     If you want to change the style of the JFrame you can use:
     UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
     The program is open source, so feel free to use it. It was made by martin1000*/

    public static void main(String[] args) throws Exception {
        //we will need to check if the text in usernameField and passwordField is the same as in the next two Strings:
        String username = "martin1000";
        String password = "javaisfun1234";

        //creating Swing components
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton login = new JButton("login");
        JLabel incorrect = new JLabel("Please try again!");
        login.setFocusPainted(false);
        JFrame frame = new JFrame("Simple login");
        JLabel usernameLabel = new JLabel("username:");
        JLabel passwordLabel = new JLabel("password:");

        //setting the location to the middle or the screen
        frame.setLocationRelativeTo(null);

        //adding the proper close operation to the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
        frame.setSize(400, 200);

        //setting it's layout to nothing (=null)
        frame.setLayout(null);

        //setting the locations of the components
        usernameField.setBounds(80, 30, 240, 25);
        frame.add(usernameField);
        passwordField.setBounds(80, 80, 240, 25);
        frame.add(passwordField);
        login.setBounds(160, 125, 80, 25);
        frame.add(login);
        usernameLabel.setBounds(2, 30, 62, 15);
        frame.add(usernameLabel);
        passwordLabel.setBounds(2, 80, 60, 15);
        frame.add(passwordLabel);
        incorrect.setForeground(Color.RED);
        incorrect.setBounds(10, 125, 100, 15);
        incorrect.setVisible(false);
        frame.add(incorrect);

        //adding a listener, to listen to login button press
        login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            /* here we are checking if usernameField and passwordField both equal to their Strings (so username and password String)
              we are using String.valueOf to get the String from JPasswordField */
                if(usernameField.getText().equals(username) && String.valueOf(passwordField.getPassword()).equals(password)) {

                    //code if condition is true
                    incorrect.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Success!", "login successful!", JOptionPane.PLAIN_MESSAGE);
                }else {

                    //code if condition is false
                    incorrect.setVisible(true);
                }
            }
        });
        //setting the frame to visible
        frame.setVisible(true);
    }
}
