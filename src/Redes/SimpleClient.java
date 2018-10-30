package Redes;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

    private BufferedReader in;
    private PrintWriter out;
    private Socket socket;

    public static void main(String[] args) {
        new SimpleClient().runClient();
    }

    private void runClient() {
        try{
            connectToServer();
            sendMessages();
        } catch (IOException e){
            
        }
        finally {
            System.out.println("a fechar ...");
            try {
                socket.close();
            }
            catch (IOException e){
                
            }
        }
    }

    private void sendMessages() throws IOException {
        for(int i = 0; i < 20; i++){
            out.println("Olá " + i);
            String str = in.readLine();
            System.out.println(str);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        out.println("FIM");
    }

    private void connectToServer() throws IOException {
        InetAddress inetAddress = InetAddress.getByName(null);
        System.out.println("Endereço = " + inetAddress);
        socket = new Socket(inetAddress, SimpleServer.PORT);
        System.out.println("Socket = " + socket);

        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                socket.getOutputStream())), true);
    }

}
