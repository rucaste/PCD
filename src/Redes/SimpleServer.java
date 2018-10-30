package Redes;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static final int PORT = 8080;
    private BufferedReader in;
    private PrintWriter out;

    public static void main(String[] args) {
        try {
            new SimpleServer().startServing();
        } catch (IOException e){}
    }

    private void startServing() throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Lonçou ServerSocket: " + serverSocket);
        try{
            Socket socket = serverSocket.accept();
            try{
                System.out.println("Conexão aceite: " + socket);
                doConections(socket);
                serve();
            } 
            finally {
                System.out.println("a fechar ...");
                socket.close();
            }
        }
        finally {
            serverSocket.close();
        }
    }

    private void serve() throws IOException {
        while(true){
            String str = in.readLine();
            if(str.equals("FIM")){
                break;
            }
            System.out.println("Eco: " + str);
            out.println(str);
        }
    }

    private void doConections(Socket socket) throws IOException {
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                socket.getOutputStream())), true);
    }

}
