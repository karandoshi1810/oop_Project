package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JKFlipflop implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    public JKFlipflop(){
        JFrame f1 = new JFrame("JK flip-flop descrription");
        JButton b1 = new JButton("Previous");
        JButton b2 = new JButton("Output");
        JButton b3 = new JButton("Next");
        JButton b4 = new JButton("Exit");
        JButton b5 = new JButton("SR flip flop");
        JButton b6 = new JButton("D flip-flop");
        JButton b7 = new JButton("T flip-flop");
        JTextField  t1 = new JTextField("");
        JTextField t2 = new JTextField("");
        JTextField t3 = new JTextField("");
        JTextField t4 = new JTextField("");
        JTextField t5 = new JTextField("");
        JLabel l1 = new JLabel("J");
        JLabel l2 = new JLabel("CK");
        JLabel l3 = new JLabel("K");
        JLabel l4 = new JLabel("Q");
        JLabel l5 = new JLabel("Q'");



        t1.setBounds(350, 120, 20, 40);
        t2.setBounds(350, 180, 20, 50);
        t3.setBounds(350, 240, 20, 50);
        t4.setBounds(650, 120, 250, 50);
        t5.setBounds(650, 240, 250, 50);
        b1.setBounds(330, 500, 100, 50);
        b1.setBackground(Color.PINK);
        b2.setBounds(530, 500, 100, 50);
        b2.setBackground(Color.PINK);
        b3.setBounds(730, 500, 100, 50);
        b3.setBackground(Color.PINK);
        b4.setBounds(930,500,100,50);
        b4.setBackground(Color.PINK);
        b5.setBounds(1200,150,150,50);
        b5.setBackground(Color.PINK);
        b6.setBounds(1200,250,150,50);
        b6.setBackground(Color.PINK);
        b7.setBounds(1200,350,150,50);
        b7.setBackground(Color.PINK);
        l1.setBounds(340, 15, 200, 250);
        l2.setBounds(330, 190, 20, 20);
        l3.setBounds(340, 245, 20, 50);
        l4.setBounds(630, 135, 20, 20);
        l5.setBounds(630, 255, 20, 20);
        ImageIcon i1 = new ImageIcon("D:\\JAVA_Project\\JK_description.PNG");
        l6 = new JLabel(i1);
        l6.setLocation(350,500);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        //f1.setLayout(null);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(t4);
        f1.add(t5);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.setSize(1500,1500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // f1.setLayout(null);
    }

    public static void main(String[] args) {
        new JKFlipflop();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            f1.dispose();
            new DFlipflop();
        }
       else if(e.getSource() == b2){
            if(t1.getText().equals("0") && t2.getText().equals("1") &&  t3.getText().equals("0")){
                t4.setText("No change");
                t4.setBackground(Color.blue);
                t5.setText("No change");
                t5.setBackground(Color.blue);
            }
           else if(t1.getText().equals("1") && t2.getText().equals("0") &&  t3.getText().equals("1")){
                t4.setText("1");
                t4.setBackground(Color.blue);
                t5.setText("0");
                t5.setBackground(Color.blue);
            }
           else if(t1.getText().equals("0") && t2.getText().equals("1") &&  t3.getText().equals("1")){
                t4.setText("0");
                t4.setBackground(Color.blue);
                t5.setText("1");
                t5.setBackground(Color.blue);
            }
           else if(t1.getText().equals("1") && t2.getText().equals("1") &&  t3.getText().equals("1")){
                t4.setText("Toggles");
                t4.setBackground(Color.blue);
                t5.setText("Toggles");
                t5.setBackground(Color.blue);
            }
        }
       else if(e.getSource() == b3){
            f1.dispose();
            new TD();
        }
       else if(e.getSource() == b4){
            f1.dispose();
            new ThanksFrame();
        }
       else if(e.getSource() == b5){
            f1.dispose();
            new SRFlipflop();
        }
       else if(e.getSource() == b6){
            f1.dispose();
            new DFlipflop();
        }
       else if(e.getSource() == b3){
            f1.dispose();
            new TD();
        }

    }
}
