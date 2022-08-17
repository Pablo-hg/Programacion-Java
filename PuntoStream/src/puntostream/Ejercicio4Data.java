
package puntostream;

import java.io.*;

public class Ejercicio4Data {

    //CAMBIAR LOS OBJECT POR DATA
    public static void main(String[] args) {
   
        
        String[] goleadores = {"Lionel Messi", "Kylian Mbappe", "Fabio Quagliarella", "Mbaye Diagne", "Duvan Zapata", "Robert Lewandowski", "Mohamed Salah", "Sadio Mane", "Pierre-Emerick Aubameyang", "Nicolas Pepe", "Krzysztof Piatek"};
        int [] goles = {36, 32, 26, 30, 22, 22, 22, 22, 22, 22, 21};
        int [] puntos = {72, 64, 52, 45, 44, 44, 44, 44, 44, 44, 42};
        DataOutputStream dos = null;
        DataInputStream dis = null;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\BotaOro2.dat");    
            dos = new DataOutputStream(fos);
        
            for (int i = 0; i < goles.length; i++){
                dos.writeUTF(goleadores[i]);            
                dos.writeInt(goles[i]);            
                dos.writeInt(puntos[i]);
            } 
        
            dos.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir o al abrir");
        }
        
        try{
            fis = new FileInputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\BotaOro2.dat");
            dis = new DataInputStream(fis);
        
            for (int i = 0; i < goles.length; i++){
                System.out.print(dis.readUTF());
                System.out.print(" ");
                System.out.print(dis.readInt());
                System.out.print(" ");
                System.out.println(dis.readInt());
            }
            
            dis.close();
        
        } catch (IOException ex) {
               System.out.println("Error al leer o al abrir");
               //ex.printStackTrace();
            }
            
    }
    
}
