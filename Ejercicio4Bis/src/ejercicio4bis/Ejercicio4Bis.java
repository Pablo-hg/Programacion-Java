
package ejercicio4bis;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio4Bis {

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
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        
        
        try {
            fos = new FileOutputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\BotaOro3.dat");    
            oos = new ObjectOutputStream(fos);
        
            /*for (int i = 0; i < goles.length; i++){
                oos.writeUTF(goleadores[i]);            
                oos.writeInt(goles[i]);            
                oos.writeInt(puntos[i]);
            } */
            while (it.hasNext())
                oos.writeObject((Jugador)it.next());
            oos.close();
            
        } catch (IOException ex) {
            System.out.println("Error al escribir o al abrir");
        }
        
        try{
            fis = new FileInputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\BotaOro3.dat");
            ois = new ObjectInputStream(fis);
        
            for (int i = 0; i < goles.length; i++){
                
                System.out.println((Jugador)ois.readObject());
              /*System.out.print(ois.readUTF());
                System.out.print(" ");
                System.out.print(ois.readInt());
                System.out.print(" ");
                System.out.println(ois.readInt());*/
            }
            
            ois.close();
        
        } catch (IOException ex) {
               System.out.println("Error al leer o al abrir");
               //ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
            System.out.println("Error al leer");
        }
            
    }
    
}
