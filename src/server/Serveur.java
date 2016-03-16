package server;


import client.Commun;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;





public class Serveur
{
    public static void main(String...args) throws IOException 
    { 
        Socket sock = new ServerSocket(9001).accept();
        
        Commun.transfert(
                sock.getInputStream(),
                new FileOutputStream("D:\\test2.jpg"),
                true);
        
        sock.close(); 
    } 
}