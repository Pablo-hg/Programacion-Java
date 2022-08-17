
package binarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Binarios {
    
    public static void main(String[] args) {
        
        FileOutputStream escribirbyte = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Alumno a = null;
        
        try {
             escribirbyte = new FileOutputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\PruebaEscribirByte.txt");
             oos = new ObjectOutputStream(escribirbyte);
        } catch (IOException ex) {
            System.out.println("Error de e/s");
        }
        
        //generar 3 objetos de la clase Alumno
        Alumno a1 = new Alumno('a',7);
        Alumno a2 = new Alumno('b',6);
        Alumno a3 = new Alumno('c',5);
        
        try {
            //writeObject(objeto)
            oos.writeObject(a1);
            oos.writeObject(a2);
            oos.writeObject(a3);
            
            FileInputStream leerbytes = null;
        
            leerbytes = new FileInputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\PruebaEscribirByte.txt");
        
            ois = new ObjectInputStream(leerbytes);
            
          /*Alumno a4 = (Alumno) ois.readObject();
            Alumno a5 = (Alumno) ois.readObject();
            Alumno a6 = (Alumno) ois.readObject();*/
            for (int i = 1; i <=3; i++){
                a = (Alumno) ois.readObject();
                System.out.println(a);
            }
            
            
            
        } catch (IOException ex) {
            System.out.println("Error de e/s o de lectura o de escritura o de apertura");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en la clase");
        }
        
    }
    
}
