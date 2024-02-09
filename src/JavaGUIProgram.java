
import javax.swing.*;
import java.awt.*;

public class JavaGUIProgram {

    public static void main(String [] args){
    JFrame frame = new JFrame();
    frame.setTitle("My First Java GUI Program");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setSize(420, 420);

    frame.getContentPane().setBackground(Color.cyan);
    }

}
