package package1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SRD implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3;
    JLabel l1;
    public SRD(){
        f1 = new JFrame("SR Flip-Flop description");
        b1 = new JButton("<<Previous");
        b2 = new JButton("Next>>");
        b3 = new JButton("Exit");


        b1.setBounds(400,540,100,65);
        b2.setBounds(600,540,100,65);
        b3.setBounds(800,540,100,65);

        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);

        ImageIcon i1 = new ImageIcon("D:\\oop_Project\\A.PNG");
        l1 = new JLabel(i1);

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
        new SRD();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            f1.dispose();
            new Choices();
        }
        if(e.getSource() == b2){
            f1.dispose();
            new SRFlipflop();
        }
        if(e.getSource() == b3){
            f1.dispose();
            new ThanksFrame();
        }

    }

}