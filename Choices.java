package package1;

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

        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);
        b5.setBackground(Color.WHITE);
        b5.setForeground(Color.BLACK);
        b6.setBackground(Color.WHITE);
        b6.setForeground(Color.BLACK);
        b7.setBackground(Color.WHITE);
        b7.setForeground(Color.BLACK);
        ImageIcon kd = new ImageIcon("D:\\oop_Project\\SR flip flop.PNG");
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
