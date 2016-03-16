package client;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client
{
    public static void envoie(String path) throws IOException 
    { 
        
        Socket sock = null;
        try{
        sock=new Socket(InetAddress.getLocalHost(),9001);
    
        Commun.transfert(
                new FileInputStream(path),
                sock.getOutputStream(),
                true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
        sock.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    } 
}