package ejercicio4bis;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class EjercicioBis2 {
    
    public static void main(String[] args) {
        
        String[] goleadores = {"Lionel Messi", "Kylian Mbappe", "Fabio Quagliarella", "Mbaye Diagne", "Duvan Zapata", "Robert Lewandowski", "Mohamed Salah", "Sadio Mane", "Pierre-Emerick Aubameyang", "Nicolas Pepe", "Krzysztof Piatek"};
        int [] goles = {36, 32, 26, 30, 22, 22, 22, 22, 22, 22, 21};
        int [] puntos = {72, 64, 52, 45, 44, 44, 44, 44, 44, 44, 42};
        
        Jugador j = null;
        ArrayList<Jugador> aj = new ArrayList();
        
        
        for (int i = 0; i < goleadores.length; i++){
            j = new Jugador(goleadores[i],goles[i],puntos[i]);
            aj.add(j);
        }
        
        Iterator it = aj.iterator();
        DataOutputStream dos = null;
        DataInputStream dis = null;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        
        
        try {
            fos = new FileOutputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\BotaOro4.dat");    
            dos = new DataOutputStream(fos);
        
            /*for (int i = 0; i < goles.length; i++){
                oos.writeUTF(goleadores[i]);            
                oos.writeInt(goles[i]);            
                oos.writeInt(puntos[i]);
            } */
            while (it.hasNext()){
               j = (Jugador)it.next();
               dos.writeUTF(j.getNombre());
               dos.writeInt(j.getGoles());
               dos.writeInt(j.getPuntos());
            }  
            
            dos.close();
            
        } catch (IOException ex) {
            System.out.println("Error al escribir o al abrir");
        }
        
        try{
            fis = new FileInputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\BotaOro4.dat");
            dis = new DataInputStream(fis);
        
            for (int i = 0; i < goles.length; i++){
                /*System.out.println((Jugador)dis.readObject());*/
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