

import java.net.*;
import java.io.*;
public class ClienteSocket{
    public static void main(String[] args){
        try {
            System.out.print("[ Conectando con Servidor TCP    ..................  ");
            Socket sock = new Socket("127.0.0.1", 3300);
            System.out.println("[OK] ]");
            
            InputStream is = sock.getInputStream(); // Canal de entrada de dados
            OutputStream os = sock.getOutputStream(); // Canal de salida de dados
            String msg = "Hola con Sockets!";
            byte[] buf = msg.getBytes(); // obteniendo la representación del byte del mensaje

            System.out.print("[ Enviando mensaje    ..............................  ");
            os.write(buf);
            System.out.println("[OK] ]");
        }catch(Exception e){System.out.println(e);}    
        System.out.println("[ Fin ]");
    }
}