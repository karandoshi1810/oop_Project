package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JKD implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3;
    JLabel l1;
    public JKD(){
        f1 = new JFrame("JK flip-flop description");
        b1 = new JButton("Previous");
        b2 = new JButton("Next");
        b3 = new JButton("Exit");

        b1.setBounds(330,630,100,50);
        b1.setBackground(Color.PINK);
        b1.setForeground(Color.BLACK);
        b2.setBounds(630,630,100,50);
        b2.setBackground(Color.PINK);
        b2.setForeground(Color.BLACK);
        b3.setBounds(930,630,100,50);
        b3.setBackground(Color.PINK);
        b3.setForeground(Color.BLACK);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        ImageIcon kd = new ImageIcon("D:\\JAVA_Project\\JKdescription.PNG");
        l1 = new JLabel(kd);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(l1);
        f1.setSize(1500,1500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new JKD();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            f1.dispose();
            new SRD();
        }
        else if(e.getSource() == b2){
            f1.dispose();

        }
        else if(e.getSource() == b3){
            f1.dispose();
            new ThanksFrame();
        }
    }
}
