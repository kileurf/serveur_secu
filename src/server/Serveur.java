package server;


import client.Commun;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;





public class Serveur
{
    public static void recoit() throws IOException 
    { 
        Socket sock =null;
        try{
        sock =new ServerSocket(8080).accept();
        
        Commun.transfert(
                sock.getInputStream(),
                new FileOutputStream("D:\\test2.jpg"),
                true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            try{
            sock.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            } 
        }
        
    } 
}