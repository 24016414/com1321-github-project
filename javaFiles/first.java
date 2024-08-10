import javax.swing.JOptionPane;

public class first{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name");
        JOptionPane.showMessageDialog(null,"Evening "+name);
    }
}