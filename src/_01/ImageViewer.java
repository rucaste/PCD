package _01;

import javax.swing.*;
import java.awt.*;

public class Calculator{

        private JFrame frame;

        public Calculator(String title) {
            frame = new JFrame(title);

            frame.setLayout(new BorderLayout());

            frame.setSize(300,200);
            frame.setLocation(300, 200);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.add(new JButton("1"), BorderLayout.WEST);
            frame.add(new JButton("2"), BorderLayout.EAST);

            frame.setVisible(true);
        }






}
