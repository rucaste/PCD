package _01;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageViewer {

        private JFrame frame;
        private ImageIcon icon;
        private JLabel jlabeç;
        private int i;


        public ImageViewer(String title, File[] files) {
            i=0;
            frame = new JFrame(title);

            frame.setLayout(new BorderLayout());

            frame.setSize(600,400);
            frame.setLocation(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.add(new JButton("Prev"), BorderLayout.WEST);
            frame.add(new JButton("Nex"), BorderLayout.EAST);
            frame.add(new JButton("Refresh"), BorderLayout.SOUTH);

            JLabel image = new JLabel();

            frame.add(image);

            ImageIcon imageIcon = new ImageIcon(String.valueOf(files[i]));

            imageIcon = getScaledImage(imageIcon, 500, 350);

            image.setIcon(imageIcon);

            frame.setVisible(true);
        }

        private Image getScaledImage(Image srcImg, int w, int h){
            BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = resizedImg.createGraphics();

            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(srcImg, 0, 0, w, h, null);
            g2.dispose();

            return resizedImg;
    }






}
