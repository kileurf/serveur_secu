package client;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client
{
    public static void main(String...args) throws IOException 
    { 
        Socket sock = new Socket(InetAddress.getLocalHost(),9001);
    
        Commun.transfert(
                new FileInputStream("D:\\test.jpg"),
                sock.getOutputStream(),
                true);
        
        sock.close();
    } 
}