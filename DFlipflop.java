package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DFlipflop implements ActionListener {
    JFrame f1;
    JLabel l1, l2, l3, l4, l5,l6;
    JButton b1, b2, b3,b4,b5,b6,b7;
    JTextField t1, t2, t3, t4;

    public DFlipflop() {
        f1 = new JFrame("D triggered Flip-Flop");
        f1.setSize(1500, 1500);

        t1 = new JTextField("");
        t2 = new JTextField("");
        t3 = new JTextField("");
        t4 = new JTextField("");
        b1 = new JButton("Previous");
        b2 = new JButton("Output");
        b3 = new JButton("Next");
        b7 = new JButton("Exit");
        b4 = new JButton("JK flip-flop");
        b5 = new JButton("T flip-flop");
        l1 = new JLabel("D Flip-Flop");
        l2 = new JLabel("D");
        l3 = new JLabel("CK");
        l4 = new JLabel("Q");
        l5 = new JLabel("Q'");

        t1.setBounds(350, 120, 20, 50);
        t2.setBounds(700, 225, 250, 50);
        t3.setBounds(350, 220, 20, 50);
        t4.setBounds(700, 125, 250, 50);
        b1.setBounds(300, 500, 100, 50);
        b2.setBounds(500, 500, 100, 50);
        b3.setBounds(700, 500, 100, 50);
        b7.setBounds(900,500,100,50);
        b4.setBounds(1200,150,150,50);
        b5.setBounds(1200,250,150,50);
        b6.setBounds(1200,350,150,50);
        l1.setBounds(625, -90, 200, 250);
        l2.setBounds(330, 120, 20, 20);
        l3.setBounds(330, 220, 20, 50);
        l4.setBounds(970, 140, 20, 20);
        l5.setBounds(970, 220, 20, 20);

        f1.getContentPane().setBackground(Color.WHITE);
        l1.setForeground(Color.BLACK);
        l2.setForeground(Color.BLACK);
        l3.setForeground(Color.BLACK);
        l4.setForeground(Color.BLACK);
        l5.setForeground(Color.BLACK);
        l1.setFont(new Font(null, Font.BOLD, 20));


        f1.setLayout(null);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b7);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(t4);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            if (t2.getText().equals("0") && t1.getText().equals("0")||t1.getText().equals("1")) {
                t3.setText("Memory");
                t4.setText("Memory");
            }
           else if (t2.getText().equals("1") && t1.getText().equals("0")) {
                t3.setText("0");
                t4.setText("1");
            }
           else if (t2.getText().equals("1") && t1.getText().equals("1")) {
                t3.setText("1");
                t4.setText("0");
            }
        }
       else if(e.getSource()==b1){
            f1.dispose();
            new DD();
        }
        if(e.getSource() == b3){
            f1.dispose();
        }
        if(e.getSource() == b7){
            f1.dispose();
            new ThanksFrame();
        }
    }
    public static void main (String[]args){
        new DFlipflop();
    }
}
