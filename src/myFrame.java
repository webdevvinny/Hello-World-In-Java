import javax.swing.*;

public class myFrame{
    public static void main(String [] args){
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        label.setText("Bro I Love to Code!!");



        frame.setResizable(true);
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);

    }
}

