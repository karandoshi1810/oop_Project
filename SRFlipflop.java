package package1;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import javax.swing.*;
import javax.xml.stream.util.StreamReaderDelegate;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SRFlipflop implements ActionListener {
    JFrame f1;
    JLabel l1,l5,l6,l7;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    JTextField t1,t2,t3,t4,t5,t6;


    public SRFlipflop(){
        f1 = new JFrame("Edge triggered Flip-Flop");
        t1 = new JTextField("");
        t2 = new JTextField("");
        t3 = new JTextField("");
        t4 = new JTextField("");
        t5 = new JTextField("");
        t6 = new JTextField("");
        b1 = new JButton("Previous");
        b2 = new JButton("Output");
        b8 = new JButton("Exit");
        b3 = new JButton("Next");
        b4 = new JButton("D flip-flop");
        b5 = new JButton("JK flip-flop");
        b6 = new JButton("T flip-flop");
        b7 = new JButton("Waveform");
        l1 = new JLabel("SR Flip-Flop");

        l5 = new JLabel("Q");
        l7 = new JLabel("Q'");


        t1.setBounds(410,225,30,30);
        t2.setBounds(405,365,30,30);
        t3.setBounds(410,505,30,30);
        t4.setBounds(920,430,150,50);
        t5.setBounds(920,250,150,50);
        t6.setBounds(500,400,300,50);
        b1.setBounds(300,580,100,50);
        b2.setBounds(500,580,100,50);
        b3.setBounds(700,580,100,50);
        b8.setBounds(900,580,100,50);
        b4.setBounds(1200,150,150,50);
        b5.setBounds(1200,250,150,50);
        b6.setBounds(1200,350,150,50);
        b7.setBounds(1200,450,150,50);
        l1.setBounds(625,-90,200,250);
        l5.setBounds(910,270,20,20);
        l7.setBounds(907,430,20,20);
        ImageIcon kd = new ImageIcon("D:\\JAVA_Project\\SR_image.PNG");
        l6 = new JLabel(kd);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);


        f1.getContentPane().setBackground(Color.WHITE);
        l1.setForeground(Color.BLACK);
        l5.setForeground(Color.BLACK);
        l7.setForeground(Color.BLACK);
        l1.setFont(new Font(null,Font.BOLD,20));




        f1.add(l1);
        f1.add(l5);
        f1.add(l7);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b8);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(t4);
        f1.add(t5);
        f1.add(l6);
        f1.setSize(1500,1500);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b2) {
            if ((t1.getText().equals("1")) && (t2.getText().equals("0")) && t3.getText().equals("1")) {
                t4.setText("No change");
                t4.setBackground(new Color(0,255,128));
                t5.setText("No change");
                t5.setBackground(new Color(0,255,128));
            } else if ((t1.getText().equals("0"))&& (t2.getText().equals("1")) && (t3.getText().equals("0")) ) {
                t4.setText("No change");
                t4.setBackground(new Color(0,255,128));
                t5.setText("No change");
                t5.setBackground(new Color(0,255,128));

            }else if (t1.getText().equals("0") && t2.getText().equals("1") && t3.getText().equals("1")) {
                t4.setText("0");
                t4.setBackground(new Color(0,255,128));
                t5.setText("1");
                t5.setBackground(new Color(0,255,128));
            } else if (t1.getText().equals("1") && t2.getText().equals("1") && t3.getText().equals("0")) {
                t4.setText("1");
                t4.setBackground(new Color(0,255,128));
                t5.setText("0");
                t5.setBackground(new Color(0,255,128));
            } else if (t1.getText().equals("1") && t2.getText().equals("1") && t3.getText().equals("1")) {
                t4.setText("Forbidden");
                t4.setBackground(new Color(0,255,128));
                t5.setText("Forbidden");
                t5.setBackground(new Color(0,255,128));
            }
        } else if (e.getSource() == b1) {
            f1.dispose();
            new SRD();
        } else if (e.getSource() == b2) {
            f1.dispose();
        }
        else if(e.getSource() == b3){
            f1.dispose();
            new DD();
        }
        else if(e.getSource() == b4){
            f1.dispose();
            new DD();
        }
       else if(e.getSource() == b5){
            f1.dispose();
            new JKD();
        }
       else if(e.getSource() == b6){
            f1.dispose();
            new TD();
        }
        else if(e.getSource() == b7){
            //f1.dispose();
            new Waveform();
        }
       else if(e.getSource() == b8){
            f1.dispose();
            new ThanksFrame();
        }

    }



    public static void main(String[] args) {
        new SRFlipflop();
    }
}