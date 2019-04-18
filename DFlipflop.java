package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DFlipflop implements ActionListener {
    JFrame f1;
    JLabel l1,l6;
    JButton b1, b2, b3,b4,b5,b6,b7,b8;
    JTextField t1, t2, t3, t4;

    public DFlipflop() {
        f1 = new JFrame("D triggered Flip-Flop");


        t1 = new JTextField("");
        t2 = new JTextField("");
        t3 = new JTextField("");
        t4 = new JTextField("");
        b1 = new JButton("Previous");
        b2 = new JButton("Output");
        b3 = new JButton("Next");
        b6 = new JButton("Waveform");
        b7 = new JButton("Exit");
        b4 = new JButton("JK flip-flop");
        b5 = new JButton("T flip-flop");
        b8 = new JButton("SR flip-flop");
        l1 = new JLabel("D flip-flop");

        t1.setBounds(360, 270, 50, 20);
        t2.setBounds(935, 390, 150, 50);
        t3.setBounds(935, 280, 150, 50);
        t4.setBounds(360, 340, 50, 20);
        b1.setBounds(300, 500, 100, 50);
        b2.setBounds(500, 500, 100, 50);
        b3.setBounds(700, 500, 100, 50);
        b4.setBounds(1200,150,150,50);
        b5.setBounds(1200,250,150,50);
        b6.setBounds(1200,350,150,50);
        b5.setBounds(1200,450,150,50);
        b7.setBounds(900,500,100,50);
        l1.setBounds(25,-90,200,250);
        ImageIcon i1 = new ImageIcon("D:\\JAVA_Project\\D_image.PNG");
        l6 = new JLabel(i1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);


        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(t4);
        f1.add(l1);
        f1.add(l6);
        f1.setSize(1500, 1500);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            if (t1.getText().equals("0") && t4.getText().equals("0")) {
                t3.setText("Memory");
                t3.setBackground(new Color(0,255,128));
                t2.setText("Memory");
                t2.setBackground(new Color(0,255,128));
            }
           else if (t1.getText().equals("0") && t4.getText().equals("1")) {
                t3.setText("Memory");
                t3.setBackground(new Color(0,255,128));
                t2.setText("Memory");
                t2.setBackground(new Color(0,255,128));
            }
            else if (t1.getText().equals("1") && t4.getText().equals("0")) {
                t3.setText("0");
                t3.setBackground(new Color(0,255,128));
                t2.setText("1");
                t2.setBackground(new Color(0,255,128));
            }
            else if (t1.getText().equals("1") && t4.getText().equals("1")) {
                t3.setText("1");
                t3.setBackground(new Color(0,255,128));
                t2.setText("0");
                t2.setBackground(new Color(0,255,128));
            }
        }
        else if(e.getSource()==b1){
            f1.dispose();
            new DD();
        }
        if(e.getSource() == b3){
            f1.dispose();
            new JKD();
        }
        if(e.getSource() == b4){
            f1.dispose();
            new JKD();
        }
        if(e.getSource() == b5){
            f1.dispose();
            new TD();
        }
        if(e.getSource() == b6){
            //f1.dispose();
            new Waveform();
        }
        if(e.getSource() == b7){
            f1.dispose();
            new ThanksFrame();
        }
        if(e.getSource() == b8){
            f1.dispose();
            new SRFlipflop();
        }
    }

    public static void main (String[]args){
        new DFlipflop();
    }
}