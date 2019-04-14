package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFlipflop implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
   public TFlipflop() {
       JFrame f1 = new JFrame("T flip-flop");
       JTextField t1 = new JTextField("");
       JTextField t2 = new JTextField("");
       JTextField t3 = new JTextField("");
       JTextField t4 = new JTextField("");
       JLabel l1 = new JLabel("CK");
       JLabel l2 = new JLabel("T");
       JLabel l3 = new JLabel("Q");
       JLabel l4 = new JLabel("Q'");
       JButton b1 = new JButton("Previous");
       JButton b2 = new JButton("Output");
       JButton b3 = new JButton("Next");
       JButton b4 = new JButton("Exit");

       t1.setBounds(400,250,30,30);
       t2.setBounds(400,200,30,30);
       t3.setBounds(900,250,150,50);
       t4.setBounds(900,200,150,50);
       b1.setBounds(330, 500, 100, 50);
       b1.setBackground(Color.PINK);
       b2.setBounds(530, 500, 100, 50);
       b2.setBackground(Color.PINK);
       b3.setBounds(730, 500, 100, 50);
       b3.setBackground(Color.PINK);
       b4.setBounds(930,500,100,50);
       b4.setBackground(Color.PINK);
       l1.setBounds(390, 250, 200, 50);
       l2.setBounds(390, 200, 20, 20);
       l3.setBounds(890, 250, 20, 50);
       l4.setBounds(890, 200, 20, 20);
       ImageIcon i5 = new ImageIcon("D:\\JAVA_Project\\T_flipflop_image.PNG");
       JLabel l5 = new JLabel(i5);
       l5.setLocation(400,250);

       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);

       f1.setLayout(null);
       f1.add(t1);
       f1.add(t2);
       f1.add(t3);
       f1.add(t4);
       f1.add(b1);
       f1.add(b2);
       f1.add(b3);
       f1.add(b4);
       f1.add(l5);
       f1.add(l1);
       f1.add(l2);
       f1.add(l3);
       f1.add(l4);

       f1.setSize(1500,1500);
       f1.setVisible(true);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

    public static void main(String[] args) {
        new TFlipflop();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            f1.dispose();
            new JKD();
        }
        if(e.getSource() == b2){
            if(t2.getText().equals("1") && t1.getText().equals("0")){
                t3.setText("No change");
                t3.setBackground(new Color(255,51,51));
                t4.setText("No change");
                t4.setBackground(new Color(255,51,51));
            }
            else if(t2.getText().equals("1") && t1.getText().equals("1")){
                t3.setText("Toggle");
                t3.setBackground(new Color(0,255,128));
                t4.setText("Toggle");
                t4.setBackground(new Color(0,255,128));
            }
            else if(t2.getText().equals("0") && (t1.getText().equals("1") || t1.getText().equals("0"))){
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
}
