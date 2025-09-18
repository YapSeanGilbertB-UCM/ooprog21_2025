import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {

        while (true) {
    
            String name = JOptionPane.showInputDialog("Enter your name:");
           
            if (name == null || name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name cannot be empty.");
                continue;
            }
        
            int response = JOptionPane.showConfirmDialog(null, "Do you want your name to be shown as: " + name + "?", "Confirm Name", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                return; 
            } else {
                JOptionPane.showMessageDialog(null, "Please enter your name again.");
            }
        }
    }
}
   