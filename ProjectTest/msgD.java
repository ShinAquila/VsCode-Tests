import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class msgD {
    public static void main(String[] args) {
        String ask = JOptionPane.showInputDialog(null, "Enter your name","Name Request", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Welcome "+ask+"!","Welcome", JOptionPane.INFORMATION_MESSAGE);

        String[] options = {"I adore turtles", "Yes", "Maybe", "Urm...", "No", "Hate them"};
        ImageIcon icon = new ImageIcon("src/images/turtle32.png");
        String n = (String)JOptionPane.showInputDialog(null, "Do you like turtles??","I like turtles", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);
        System.out.println(n);
    }
}
