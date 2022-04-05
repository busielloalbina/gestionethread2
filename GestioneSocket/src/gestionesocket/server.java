/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket;

import com.sun.corba.se.spi.activation.Server;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import static java.time.Clock.system;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;


/**
 *
 * @author tutti
 */
public class server {
    public static void main(String[] args) {
        try {
            //apertura alla porta, avvio del servizio
            ServerSocket serverSocket = new ServerSocket(2000); 
            System.out.println("Server avviato correttamente");
            //attesa di richiesta del server
            Socket socket = serverSocket.accept();
             System.out.println("connessione avvenuta");
             system.out.println("Socket: " + socket);
        } catch(BindException ex) {
            System.err.println("porta occupata");
            
        }
        
        catch (IOException ex) {
            System.err.println("errore avvio server sulla porta 2000");
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
 