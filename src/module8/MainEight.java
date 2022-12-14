package module8;
import module7.MyFrame;
import javax.swing.*;
import java.awt.*;
public class MainEight {
    public static void main(String[] args) {
        ImageIcon icon= new ImageIcon("/Users/mohan/Desktop/01college work/java/project/src/ronaldo.jpeg");
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);

        JLabel label = new JLabel();
        label.setText("suuuuuuiiiiiii");
        label.setIcon(newIcon);

        MyFrame frame = new MyFrame();
        frame.add(label);
    }
}