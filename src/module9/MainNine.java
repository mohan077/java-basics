package module9;
import javax.swing.*;
import java.awt.*;
public class MainNine {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("/Users/mohan/Desktop/01college work/java/project/src/pic4.jpeg");
        Image newImage= icon.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,250,250);
        panel1.setBackground(Color.red);
        JPanel panel2 = new JPanel();
        panel2.setBounds(250,0,250,250);
        panel2.setBackground(Color.blue);
        JPanel panel3 = new JPanel();
        panel3.setBounds(0,250,500,250);
        panel3.setBackground(Color.GREEN);
//creating a label
        JLabel label = new JLabel();
        label.setText("Hello");
        label.setIcon(newIcon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);
        panel1.add(label);
        JLabel label2 = new JLabel();
        label2.setText("Vamoss");

        label2.setVerticalAlignment(JLabel.TOP);
        label2.setHorizontalAlignment(JLabel.LEFT);
        panel2.add(label2);
        JFrame frame= new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
    }
}
