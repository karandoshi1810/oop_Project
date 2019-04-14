package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TD implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3;
    JLabel l1;
    public TD(){
        JFrame f1 = new JFrame("T flip-flop description");
        JButton b1 =new JButton("Previous");
        JButton b2 = new JButton("Next");
        JButton b3 =new JButton("Exit");

        b1.setBounds(280,630,100,65);
        b1.setBackground(new Color(51,51,255));
        b1.setForeground(Color.WHITE);
        b2.setBounds(620,630,100,65);
        b2.setBackground(new Color(51,51,255));
        b2.setForeground(Color.WHITE);
        b3.setBounds(990,630,100,65);
        b3.setBackground(new Color(51,51,255));
        b3.setForeground(Color.WHITE);

        ImageIcon i1 = new ImageIcon("D:\\JAVA_Project\\T_flipflop_description.PNG");
        l1 = new JLabel(i1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(l1);
        f1.setSize(1500,1500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TD();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            f1.dispose();
            new JKD();
        }
        if(e.getSource() == b2){
            f1.dispose();

        }
        if(e.getSource()==b3){
            f1.dispose();
            new ThanksFrame();
        }

    }
}
