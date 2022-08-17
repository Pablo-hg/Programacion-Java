
package serie;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serie implements Serializable{

    public static void main(String[] args) {
        
        //Vamos a escribir objetos de la clase examenen el fichero examen.dat
        String enunciado = "enundicado";
        Fecha f1 = new Fecha(22,5,2020);
        
        Examen ex1 = new Examen(9,enunciado,f1);
        Examen ex2 = new Examen(8,enunciado,f1);
        
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        
        try {
            fos = new FileOutputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\Examen.dat");
            oos = new ObjectOutputStream(fos);
        
            oos.writeObject(ex1);
            oos.writeObject(ex2);
        
            oos.close();
            
        } catch (IOException ex) {
            System.out.println("Error al abrir, al escribir o al cerrar");
            ex.addSuppressed(ex);
        }    
        
    }
    
}
