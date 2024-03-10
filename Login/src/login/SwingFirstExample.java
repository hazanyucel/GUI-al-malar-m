
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingFirstExample implements ActionListener{
JButton loginButton;
JTextField userText;
JPasswordField passwordText;
JLabel success;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Ilk Swing ornegim");

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

      
        panel.setLayout(null);

        
        JLabel userLabel = new JLabel("User");
      
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Same process for password label and text field.
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        /*This is similar to text field but it hides the user
         * entered data and displays dots instead to protect
         * the password like we normally see on login screens.
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        
        
        // Creating login button
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new SwingFirstExample());
        panel.add(loginButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user=userText.getText();
        String password=passwordText.getText();
        if (user.equals("hazan")&& password.equals("QwerTy13")) {
            JLabel success =new JLabel();
            success.setText("Login Succesful");
            
        }
    }

}
