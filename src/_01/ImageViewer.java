package _01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class ImageViewer {

    private JFrame frame;
    private JButton rightButtom = new JButton("Next");
    private JButton downButton = new JButton("Refresh");
    private JButton leftButton = new JButton("Prev");

    private JLabel image = new JLabel();

    private ImageIcon icon;
    private JLabel jlabel;

    private int i;
    private int size;

    private ArrayList<File> files;
    private ArrayList<ImageIcon> imageIcons = new ArrayList<>();

    private ListenerForPrevious listenerForPrevious = new ListenerForPrevious();
    private ListenerForNext listenerForNext = new ListenerForNext();
    private ListenerForDown listenerForDown = new ListenerForDown();


    public ImageViewer(String title) {

        refresh();

        i=0;
        frame = new JFrame(title);

        this.files = files;

        frame.setLayout(new BorderLayout());

        frame.setSize(600,400);
        frame.setLocation(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(leftButton, BorderLayout.WEST);
        frame.add(rightButtom, BorderLayout.EAST);
        frame.add(downButton, BorderLayout.SOUTH);

        frame.add(image);

        image.setIcon(imageIcons.get(i));

        frame.setVisible(true);

        leftButton.addActionListener(listenerForPrevious);
        rightButtom.addActionListener(listenerForNext);
        downButton.addActionListener(listenerForDown);
    }

    private void setImage(int i){
        image.setIcon(imageIcons.get(i));
    }

    public void nextImage(){
        if(i < size - 1) {
            i++;
            setImage(i);
        }
    }

    public void previousImage(){
        if(i > 0) {
            i--;
            setImage(i);
        }
    }

    public void refresh(){
        File f = new File("/home/rui/IdeaProjects/PCD/src/_01/pictures");
        files = new ArrayList<File>(Arrays.asList(f.listFiles()));
        for(File file:files){
            imageIcons.add(new ImageIcon(String.valueOf(file)));
        }
        size = files.size();
    }

    private class ListenerForPrevious implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            previousImage();
        }
    }

    private class ListenerForNext implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nextImage();
        }
    }

    private class ListenerForDown implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            refresh();
            i=0;
        }
    }




}

