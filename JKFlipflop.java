package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JKFlipflop implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    public JKFlipflop(){
        JFrame f1 = new JFrame("JK flip-flop");
        JTextField t1 = new JTextField("");
        JTextField t2 = new JTextField("");
        JTextField t3 = new JTextField("");
        JTextField t4 = new JTextField("");
        JTextField t5 = new JTextField("");
        JLabel l1 = new JLabel("J");
        JLabel l2 = new JLabel("CK");
        JLabel l3 = new JLabel("K");
        JLabel l4 = new JLabel("Q");
        JLabel l5 = new JLabel("Q'");
        JButton b1 = new JButton("Previous");
        JButton b2 = new JButton("Output");
        JButton b3 = new JButton("Next");
        JButton b4 = new JButton("Exit");
        JButton b5 = new JButton("SR flip-flop");
        JButton b6 = new JButton("D flip-flop");
        JButton b7 = new JButton("T flip-flop");
        JButton b8 = new JButton("Waveform");

        t1.setBounds(425,200,25,25);
        t2.setBounds(425,230,25,25);
        t3.setBounds(425,260,25,25);
        t4.setBounds(725,200,25,25);
        t5.setBounds(725,260,25,25);
        l1.setBounds(415,82,200,250);
        l2.setBounds(406,110,200,250);
        l3.setBounds(415,142,200,250);
        l4.setBounds(715,90,200,250);
        l5.setBounds(715,144,200,250);
        b1.setBounds(300,500,100,50);
        b1.setBackground(Color.PINK);
        b2.setBounds(500,500,100,50);
        b2.setBackground(Color.PINK);
        b3.setBounds(700,500,100,50);
        b3.setBackground(Color.PINK);
        b4.setBounds(1000,500,100,50);
        b4.setBackground(Color.PINK);
        b5.setBounds(1200,150,100,50);
        b5.setBackground(Color.PINK);
        b6.setBounds(1200,250,100,50);
        b6.setBackground(Color.PINK);
        b7.setBounds(1200,350,100,50);
        b7.setBackground(Color.PINK);
        b8.setBounds(1200,450,100,50);
        b8.setBackground(Color.PINK);
        ImageIcon i1 = new ImageIcon("D:\\oop_Project\\JK_image.PNG");
        l6 = new JLabel(i1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);

        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(t4);
        f1.add(t5);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);

        f1.setSize(1500,1500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }

    public static void main (String[] args) {
        new JKFlipflop();
    }
    @Override
    public void actionPerformed (ActionEvent e) {
   if(e.getSource() == b1){
       f1.dispose();
       new DFlipFlop();
   }
   if(e.getSource() == b2){
       if(t1.getText().equals("0") && t2.getText().equals("1")&&t3.getText().equals("0")){
           t4.setText("NO change");
           t5.setText("No change");
       }
   }
    }
}
