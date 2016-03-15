/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import exceptions.WrongServerPortException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import resources.Globals;

/**
 * This class is used to launch server threading process. 
 * @author romainchigar
 */
public class Server {
    
    private ServerSocket serverSocket;
    
    public Server() throws WrongServerPortException {
        try {
            this.serverSocket = new ServerSocket(Globals.SERVER_PORT);
        } catch(Exception e) {
            throw new WrongServerPortException(Globals.SERVER_PORT);
        }
    }
    
    public void run() {
        try {
            while (true) {
                new ServerThread(this.serverSocket.accept()).run();
            }
        } catch (Exception e) {
            
        }
    }
    
    private class ServerThread implements Runnable {

        private Socket socket;
        
        public ServerThread(Socket socket) {
            this.socket = socket;
        }
        
        @Override
        public void run() {
            try {
                while (true) {
                    InputStream is = socket.getInputStream();
                   
                }
            } catch (Exception e) {
                
            }
        }
        
    } 
}
