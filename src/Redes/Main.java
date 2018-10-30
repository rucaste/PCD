package Redes;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress inetAddress = InetAddress.getByName("172.217.19.36");
        System.out.println(inetAddress);

    }

}
