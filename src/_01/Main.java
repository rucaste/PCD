package _01;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        File file = new File("/home/rui/IdeaProjects/PCD/src/_01/pictures");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }

        ImageViewer imageViewer = new ImageViewer("Gallery", files);

        //ImageViewer imageViewer = new ImageViewer("Gallery");

    }
}


