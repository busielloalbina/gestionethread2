/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionethread;

import com.sun.security.ntlm.Client;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tutti
 */
public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 2000);
            BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream outVersoServer = new DataOutputStream(socket.getOutputStream());
            BufferedReader inDalServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String messaggioDelServer= inDalServer.readLine(); //lettura dell'inputstream
            System.out.println("Messaggio del server"+ messaggioDelServer);
            System.out.println("Messaggio per il server: ");
            String messaggioPerServer = tastiera.readLine();
            outVersoServer.writeBytes( messaggioPerServer+"\r\n" );
            messaggioDelServer = inDalServer.readLine();
            System.out.println("Messaggio del server:"+ messaggioDelServer);
            System.out.println("Chiusura connessione");
            socket.close();//chiusura della connessione
            
            
            
            
            } catch (UnknownHostException e){
                e.printStackTrace();
                
            } catch (IOException ex) {
                System.err.println("errore nella connessione il server alla porta 2000");
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                 
            }
    }
    
}

