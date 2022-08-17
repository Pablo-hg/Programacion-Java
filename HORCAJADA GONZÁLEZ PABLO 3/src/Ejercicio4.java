

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Ejercicio4 {

    public static void main(String[] args) {
       
        FileOutputStream escribir = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        
        
        
        try{
            escribir = new FileOutputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\BotaOro.dat");
            oos = new ObjectOutputStream(escribir);
        }  catch (IOException ex) {
            System.out.println("Error de E/S");
        }
        
        String[] goleadores = {"Lionel Messi", "Kylian Mbappe", "Fabio Quagliarella",
                                "Mbaye Diagne", "Duvan Zapata", "Robert Lewandowski", "Mohamed Salah", "Sadio Mane",
                                "Pierre-Emerick Aubameyang", "Nicolas Pepe", "Krzysztof Piatek"};
            
            int [] goles = {36, 32, 26, 30, 22, 22, 22, 22, 22, 22, 21};
            int [] puntos ={72, 64, 52, 45, 44, 44, 44, 44, 44, 44, 42};
            
          
            try {
               for (int i = 0; i < goleadores.length; i++){
                   String linea = goleadores[i] + " " + goles[i] + " " + puntos[i];
                   oos.writeChars(linea);
               }

               FileInputStream leer = null;
               leer = new FileInputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\BotaOro.txt");
               ois = new ObjectInputStream(leer);
               
               
              
                //la cosa es que ahora en el fichero están escritos todos los jugadores con sus
                //respectivos goles y puntos en orden, pero no entendia ni sabia hacerlo sin usar
                //el Buffered. Mi idea era hacer que imprimiera  linea a linea , pero no deja usar 
                //el .readline sin usar el buefeered
               
               
            } catch (IOException ex) {
            System.out.println("Error de e/s o de lectura o de escritura o de apertura");
        }
             
         
           
    }

    
    
}
