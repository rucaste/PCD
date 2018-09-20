package _01;

import java.io.File;
import java.io.FileFilter;

public class Main {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir"); // obtem o diretorio de execucao (raiz do projeto Eclipse)

        File[] files = new File(path).listFiles(new FileFilter() {
            public boolean accept(File f) {
            }
        });

        System.out.println(files);


        ImageViewer imageViewer = new ImageViewer("Gallery");

    }
}


