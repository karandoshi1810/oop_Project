package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFlipFlop extends JFrame implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    public TFlipFlop () {
         f1 = new JFrame("T flip-flop");
         t1 = new JTextField("");
        t2 = new JTextField("");
        t3 = new JTextField("");
        t4 = new JTextField("");
        l1 = new JLabel("CK");
       l2 = new JLabel("T");
        l3 = new JLabel("Q");
    l4 = new JLabel("Q'");
         b1 = new JButton("Previous");
         b2 = new JButton("Output");
        b3 = new JButton("Next");
        b4 = new JButton("Exit");

        t1.setBounds(520,420,30,30);
        t2.setBounds(530,350,30,30);
        t3.setBounds(948,460,150,50);
        t4.setBounds(948,350,150,50);
        t1.setBackground(Color.pink);
        b1.setBounds(330, 600, 100, 50);
        b1.setBackground(Color.PINK);
        b2.setBounds(530, 600, 100, 50);
        b2.setBackground(Color.PINK);
        b3.setBounds(730, 600, 100, 50);
        b3.setBackground(Color.PINK);
        b4.setBounds(930,600,100,50);
        b4.setBackground(Color.PINK);
        l1.setBounds(510, 420, 200, 50);
        l2.setBounds(520, 350, 20, 20);
        l3.setBounds(938, 460, 20, 50);
        l4.setBounds(938, 350, 20, 20);
        ImageIcon i5 = new ImageIcon("D:\\oop_Project\\Tflipflop.PNG");
        JLabel l5 = new JLabel(i5);





        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(t4);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

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
    }
    public static void main(String[] args) {
        new TFlipFlop();
       }
}
