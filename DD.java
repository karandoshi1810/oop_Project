package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DD implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3;
    JLabel l1;
    public DD(){
        f1 = new JFrame("D flip-flop description");
        b1 = new JButton("Previous");
        b2 = new JButton("Next");
        b3 = new JButton("Exit");

        b1.setBounds(420,700,100,65);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b2.setBounds(700,701,100,67);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b3.setBounds(1000,701,100,65);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        ImageIcon kd = new ImageIcon("D:\\oop_Project\\Dflipflop_description.PNG");
        l1 = new JLabel(kd);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(l1);
        f1.setSize(1500,1500);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}

    public static void main(String[] args) {
        new DD();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            f1.dispose();
            new SRFlipflop();
        }
        else if(e.getSource() == b2){
            f1.dispose();
            new DFlipFlop();
        }
        else if(e.getSource() == b3){
            f1.dispose();
            new ThanksFrame();
        }
    }
}