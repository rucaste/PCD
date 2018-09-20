package _01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class Janela extends JFrame {

    public Janela(String title){
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setLayout(new GridLayout(4,2));

        JLabel labelTitle = new JLabel("title");
        this.add(labelTitle);

        JTextField textTitle = new JTextField("Hello");
        this.add(textTitle);
        this.setVisible(true);
    }



}
