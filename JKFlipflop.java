package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JKFlipflop implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    public JKFlipflop(){
         f1 = new JFrame("JK flip-flop");
         t1 = new JTextField("");
         t2 = new JTextField("");
         t3 = new JTextField("");
         t4 = new JTextField("");
         t5 = new JTextField("");
         l1 = new JLabel("J");
         l2 = new JLabel("CK");
         l3 = new JLabel("K");
         l4 = new JLabel("Q");
         l5 = new JLabel("Q'");
         b1 = new JButton("Previous");
         b2 = new JButton("Output");
         b3 = new JButton("Next");
         b4 = new JButton("Exit");
         b5 = new JButton("SR flip-flop");
         b6 = new JButton("D flip-flop");
         b7 = new JButton("T flip-flop");
         b8 = new JButton("Waveform");
         b9 = new JButton("Truth table");

        t1.setBounds(325,170,60,60);
        t2.setBounds(325,440,60,60);
        t3.setBounds(320,300,60,60);
        t4.setBounds(955,220,100,50);
        t5.setBounds(950,400,100,50);
        l1.setBounds(415,82,200,250);
        l2.setBounds(406,110,200,250);
        l3.setBounds(415,142,200,250);
        l4.setBounds(715,90,200,250);
        l5.setBounds(715,144,200,250);
        b1.setBounds(300,600,100,50);
        b1.setBackground(Color.PINK);
        b2.setBounds(500,600,100,50);
        b2.setBackground(Color.PINK);
        b3.setBounds(700,600,100,50);
        b3.setBackground(Color.PINK);
        b4.setBounds(900,600,100,50);
        b4.setBackground(Color.PINK);
        b5.setBounds(1200,150,100,50);
        b5.setBackground(Color.PINK);
        b6.setBounds(1200,250,100,50);
        b6.setBackground(Color.PINK);
        b7.setBounds(1200,350,100,50);
        b7.setBackground(Color.PINK);
        b8.setBounds(1200,450,100,50);
        b8.setBackground(Color.PINK);
        b9.setBounds(1200,550,100,50);
        b9.setBackground(Color.PINK);
        ImageIcon i1 = new ImageIcon("D:\\JAVA_Project\\JK_image.PNG");
        l6 = new JLabel(i1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

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
        f1.add(b9);
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
            new DFlipflop();
        }
        if(e.getSource() == b2){
            if(t1.getText().equals("0") && t2.getText().equals("1")&&t3.getText().equals("0")){
                t4.setText("NO change");
                t4.setBackground(new Color(0,255,128));
                t5.setText("No change");
                t5.setBackground(new Color(0,255,128));
            }
            else if(t1.getText().equals("1") && t2.getText().equals("1") && t3.getText().equals("0")){
                t4.setText("1");
                t4.setBackground(new Color(0,255,128));
                t5.setText("0");
                t5.setBackground(new Color(0,255,128));
            }
            else if(t1.getText().equals("0") && t2.getText().equals("1") && t3.getText().equals("1")){
                t4.setText("0");
                t4.setBackground(new Color(0,255,128));
                t5.setText("1");
                t5.setBackground(new Color(0,255,128));
            }
            else if(t1.getText().equals("1") && t2.getText().equals("1") && t3.getText().equals("")){
                t4.setText("Toggle");
                t4.setBackground(new Color(0,255,128));
                t5.setText("Toggle");
                t5.setBackground(new Color(0,255,128));
            }
        }
        if(e.getSource() == b3){
            f1.dispose();
            new TD();
        }
        if(e.getSource() == b4){
            f1.dispose();
            new ThanksFrame();
        }
        if(e.getSource() == b5){
            f1.dispose();
            new SRD();
        }
        if(e.getSource() == b6){
            f1.dispose();
            new DD();
        }
        if(e.getSource() == b7){
            f1.dispose();
            new TD();
        }
        if(e.getSource() == b8){
           // f1.dispose();
            new Waveform();
        }
        if(e.getSource() == b9){
            // f1.dispose();
            new TruthTable();
        }
    }
}