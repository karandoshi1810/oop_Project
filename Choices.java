package package1;
import package1.DD;
import package1.DFlipflop;
import package1.SRFlipflop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choices implements ActionListener {
    JFrame f1;
    JButton b1, b2, b3, b4, b5, b6, b7;
    JLabel l1;

    public Choices() {
        f1 = new JFrame("Choices");
        b1 = new JButton("SR Flip-Flop");
        b2 = new JButton("D Flip-Flop");
        b3 = new JButton("JK Flip-Flop");
        b4 = new JButton("T Flip-Flop");
        b5 = new JButton("Previous");
        b6 = new JButton("Next");
        b7 = new JButton("Exit");

        b1.setBounds(550, 165, 100, 65);
        b2.setBounds(700, 165, 100, 65);
        b3.setBounds(550, 235, 100, 65);
        b4.setBounds(700, 235, 100, 65);
        b5.setBounds(400, 540, 100, 65);
        b6.setBounds(600, 540, 100, 65);
        b7.setBounds(800, 540, 100, 65);

        b1.setBackground(new Color(0,0,0));
        b1.setForeground(new Color(255,255,255));
        b2.setBackground(new Color(0,0,0));
        b2.setForeground(new Color(255,255,255));
        b3.setBackground(new Color(0,0,0));
        b3.setForeground(new Color(255,255,255));
        b4.setBackground(new Color(0,0,0));
        b4.setForeground(new Color(255,255,255));
        b5.setBackground(new Color(0,0,0));
        b5.setForeground(new Color(255,255,255));
        b6.setBackground(new Color(0,0,0));
        b6.setForeground(new Color(255,255,255));
        b7.setBackground(new Color(0,0,0));
        b7.setForeground(new Color(255,255,255));


        ImageIcon kd = new ImageIcon("D:\\Image.png");
        l1 = new JLabel(kd);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);


        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(l1);
        f1.setSize(1500, 1500);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






    }

    public static void main(String[] args) {
        new Choices();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            f1.dispose();
            new SRD();
        }
        if (e.getSource() == b2) {
            f1.dispose();
            new DD();
        }
        if (e.getSource() == b5) {
            f1.dispose();
            new MainFrame();
        }
        if (e.getSource() == b6) {
            f1.dispose();
            new SRD();
        }
        if (e.getSource() == b7) {
            f1.dispose();
            new ThanksFrame();
        }
    }
}
