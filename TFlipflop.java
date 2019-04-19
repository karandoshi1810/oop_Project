package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFlipflop extends JFrame implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JLabel l1,l3,l4;
    JTextField t1,t2,t3,t4;
    public TFlipflop() {
        f1 = new JFrame("T flip-flop");
        t1 = new JTextField("");
        t2 = new JTextField("");
        t3 = new JTextField("");
        t4 = new JTextField("");
        l1 = new JLabel("CK");

        l3 = new JLabel("Q");
        l4 = new JLabel("Q'");
        b1 = new JButton("Previous");
        b2 = new JButton("Output");
        b3 = new JButton("Next");
        b4 = new JButton("Exit");
        b5 = new JButton("SR flip-flop");
        b6 = new JButton("D flip-flop");
        b7 = new JButton("JK flip-flop");
        b8 = new JButton("Waveform");
        b9 = new JButton("Truth table");


        t1.setBounds(500,180,30,30);
        t2.setBounds(490,270,30,30);
        t3.setBounds(900,190,150,50);
        t4.setBounds(900,320,150,50);
        b1.setBounds(330, 600, 100, 50);
        b1.setBackground(Color.PINK);
        b2.setBounds(530, 600, 100, 50);
        b2.setBackground(Color.PINK);
        b3.setBounds(730, 600, 100, 50);
        b3.setBackground(Color.PINK);
        b4.setBounds(930,600,100,50);
        b4.setBackground(Color.PINK);
        b5.setBounds(1250,200,100,50);
        b5.setBackground(Color.PINK);
        b6.setBounds(1250,310,100,50);
        b6.setBackground(Color.PINK);
        b7.setBounds(1250,420,100,50);
        b7.setBackground(Color.PINK);
        b8.setBounds(1250,530,100,50);
        b8.setBackground(Color.PINK);
        b8.setBounds(1250,640,100,50);
        b8.setBackground(Color.PINK);
        l1.setBounds(510, 420, 200, 50);
        l3.setBounds(938, 460, 20, 50);
        l4.setBounds(938, 350, 20, 20);
        ImageIcon i5 = new ImageIcon("D:\\JAVA_Project\\T_flipflop_image.PNG");
        JLabel l5 = new JLabel(i5);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);


        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(b9);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(t4);
        f1.add(l1);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);





        f1.setSize(1500,1500);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            f1.dispose();
            new TD();
        }
        if(e.getSource() == b2){
            t3.setText("1");


            if(t2.getText().equals("1") && t1.getText().equals("0")){
                t3.setText("No change");
                t3.setBackground(new Color(255,51,51));
                t4.setText("No change");
                t4.setBackground(new Color(255,51,51));
            }
            if(t2.getText().equals("1") && t1.getText().equals("1")){
                t3.setText("Toggle");
                t3.setBackground(new Color(0,255,128));
                t4.setText("Toggle");
                t4.setBackground(new Color(0,255,128));
            }
            if(t2.getText().equals("0") && (t1.getText().equals("1") || t1.getText().equals("0"))){
                t3.setText("No change");
                t3.setBackground(new Color(255,51,51));
                t4.setText("No change");
                t4.setBackground(new Color(255,51,51));
            }
        }
        if(e.getSource() == b3){
            f1.dispose();
            new ThanksFrame();
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
            new JKD();
        }
        if(e.getSource() == b8){
            //f1.dispose();
            new Waveform();
        }
        if(e.getSource() == b9){
            //f1.dispose();
            new TruthTable();
        }
    }
    public static void main(String[] args) {
        new TFlipflop();
    }
}