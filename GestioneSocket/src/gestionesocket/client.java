/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket;

import com.sun.security.ntlm.Client;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tutti
 */
public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("12.0.0.1", 2000);
            } catch (IOException ex) {
                System.err.println("errore nella connessione il server alla porta 2000");
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
