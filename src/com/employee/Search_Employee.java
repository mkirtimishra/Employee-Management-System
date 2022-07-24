package com.employee;//package com.Employeee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search_Employee implements ActionListener {
    JFrame f;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;

    Search_Employee(){
        f=new JFrame("Search");

        Color c=new Color(192,192,192);
        f.getContentPane().setBackground(c);
        f.setLayout(null);

        l5=new JLabel();
        l5.setBounds(0,0,500,270);
        l5.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource(""));//
        l5.setIcon(img);

        l=new JLabel("Employee Id");
        l.setVisible(true);
        //l.setBounds(40,60,250,30);
        l.setBounds(40,50,250,30);
        l.setForeground(Color.BLACK);
        Font F1=new Font("serif",Font.BOLD,25);
        l.setFont(F1);
        l5.add(l);
        f.add(l5);

        t=new JTextField();
        t.setBounds(240,50,220,30);
        l5.add(t);

        b=new JButton("Search");
        b.setBounds(240,150,100,30);
        b.addActionListener(this);
        l5.add(b);

        b2=new JButton("Cancle");
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        l5.add(b2);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            f.setVisible(false);
            Details d=new Details();
        }
        if(ae.getSource()==b) {

            new Update_Employee(t.getText());
            f.setVisible(false);
        }

    }

    public static void main(String[] args) {
        Search_Employee v=new Search_Employee();

    }
}
