
package puntostream;

import java.io.*;//importa todos las que empiecen por .io.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PuntoStream {
    
    
    /*Crea una clase Punto que describa un punto en 2D (x, y), para luego en la clase Principal
    generar un ArrayList de puntos que se recorrerá mediante un Iterador con objeto de almacenarlos
    en un archivo. El método a utilizar para la escritura, escribirá directamente cada objeto Punto al archivo.*/
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Punto> puntos = new ArrayList();
        
        Punto p1 = new Punto(1, 1);
        Punto p2 = new Punto(2, 1);
        Punto p3 = new Punto(1, 2);
        
        puntos.add(p1);
        puntos.add(p2);
        puntos.add(p3);
        
        FileOutputStream fos = null;
        
        try {
            fos = new FileOutputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\Punto.dat");
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(fos);
            
            Iterator<Punto> it = puntos.iterator();
       
            while(it.hasNext()){
                oos.writeObject((Punto)it.next());
            }
        
            oos.close();
            
        } catch (IOException ex) {
            System.out.println("Error de escritura, apertura o cierre");
            ex.printStackTrace();
        }
        
        
        FileInputStream fis;
        try {
            fis = new FileInputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\Punto.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
        
            for (int i = 0; i < 3; i++)
                System.out.println((Punto)ois.readObject());
            
            ois.close();
            
        } catch (IOException ex) {
            System.out.println("Error al leer, abrir o cerrar");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al leer");
        }
        
    }
    
}
