package module7;
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
    public MyFrame() {
        this.setSize(400, 400);
        this.setTitle("Module Seven");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0, 0, 100));
//jf.getContentPane().setBackground(Color.pink);
//jf.getContentPane().setBackground(new Color(0xffcc));
    }
}