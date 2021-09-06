

import java.net.*;
import java.io.*;
public class ServidorSocket{
    public static void main(String[] args){
        
        try {
            System.out.print("[ Iniciando Servidor TCP    .........................  ");
            ServerSocket ss = new ServerSocket(3300, 5, InetAddress.getByName("127.0.0.1"));
            System.out.println("[OK] ]");
            
            System.out.print("[ Esperando solicitudes de conexión ..................  ");
            Socket sock = ss.accept(); // Operación de bloqueo (esperando solicitud de conexión)
            System.out.println("[OK] ]");
            
            InputStream is = sock.getInputStream(); //Canal de entrada de datos
            OutputStream os = sock.getOutputStream(); //Canal de salida de datos
            byte[] buf = new byte[20]; // recibir búfer

            System.out.print("[ Esperando la recepción del mensaje  ..............  ");
            is.read(buf); // Operación de bloqueo (esperando la llegada de datos)
            System.out.println("[OK] ]");
            
            String msg = new String(buf); // Asignación de matriz(vector) de bytes recibidos a cadena
            
            System.out.println("  Mensaje recibido: "+ msg);
        }catch(Exception e){System.out.println(e);}    
        System.out.println("[ Fin ]");
    }
}