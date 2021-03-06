package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TruthTable implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3;
    JLabel l1;
    public TruthTable(){
        f1 = new JFrame("Truth-Table");
        b1 = new JButton("Back");
        b2 = new JButton("Exit");

        b1.setBounds(285,630,100,70);
        b1.setBackground(new Color(255,153,51));
        b2.setBounds(985,630,100,70);
        b2.setBackground(new Color(255,153,51));

        ImageIcon i1 = new ImageIcon("D:\\JAVA_Project\\Truth_Table.PNG");
        l1 = new JLabel(i1);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f1.add(b1);
        f1.add(b2);
        f1.add(l1);
        f1.setSize(1500,1500);
        f1.setVisible(true);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TruthTable();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            f1.dispose();

        }
        if(e.getSource() == b2){
            f1.dispose();
            new ThanksFrame();
        }
    }
}

