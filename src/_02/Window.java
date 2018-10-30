package _02;

import javax.swing.*;
import java.awt.*;

public class Window {
    private JFrame frame;
    private JTextField[] text = new JTextField[3];
    private JButton button;
    private JPanel top = new JPanel();
    private JPanel bottom = new JPanel();

    public Window(Integer moves){
        frame = new JFrame("Corrida");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(150,100);

        for(int k = 0; k < text.length; k++){
            this.text[k] = new JTextField();
            top.add(text[k]);
            text[k].setText(Integer.toString(moves));
        }
        button = new JButton("Inicia");
        bottom.add(button);
        frame.add(top, BorderLayout.NORTH);
        frame.add(bottom, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    public void move(int i, int moves){
        this.text[i-1].setText(Integer.toString(moves));
        this.text[i-1].validate();
        this.text[i-1].repaint();
    }
}
