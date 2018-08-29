import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtUserlogin;
    private JButton submitButton;
    private JButton clearButton;
    private JPasswordField pwdUsrpwd;
    private JPanel mainPanel;

    public Login() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,txtUserlogin.getText()
                                + " " + new String (pwdUsrpwd.getPassword())
                        );
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUserlogin.setText("");
                pwdUsrpwd.setText("");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }
}
