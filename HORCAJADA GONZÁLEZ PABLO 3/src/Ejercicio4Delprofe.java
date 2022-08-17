
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Ejercicio4Delprofe {
    
    public static void main(String[] args) {
        
        String[] goleadores = {"Lionel Messi", "Kylian Mbappe", "Fabio Quagliarella", "Mbaye Diagne", "Duvan Zapata", "Robert Lewandowski", "Mohamed Salah", "Sadio Mane", "Pierre-Emerick Aubameyang", "Nicolas Pepe", "Krzysztof Piatek"};
        int [] goles = {36, 32, 26, 30, 22, 22, 22, 22, 22, 22, 21};
        int [] puntos = {72, 64, 52, 45, 44, 44, 44, 44, 44, 44, 42};
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        
        try {
            fos = new FileOutputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\BotaOro.dat");    
            oos = new ObjectOutputStream(fos);
        
        
        for (int i = 0; i < puntos.length; i++){
                oos.writeUTF(goleadores[i]);
                oos.writeInt(goles[i]);
                oos.writeInt(puntos[i]);
            } 
        
            oos.close();
            
        } catch (IOException ex) {
            System.out.println("Error al escribir o al abrir");
        }
        
        try{
            
        fis = new FileInputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\BotaOro.dat");
        ois = new ObjectInputStream(fis);
        
        for (int i = 0; i < goles.length; i++){
            
                
            System.out.print(ois.readUTF());
            System.out.print(" ");
            System.out.print(ois.readInt());
            System.out.print(" ");
            System.out.println(ois.readInt());
            
            
        }
        ois.close();
        
        }
        catch (IOException ex) {
               System.out.println("Error al leer o al abrir");
               //ex.printStackTrace();
            }
            
    }
    
}
