
package ficheros;

import static ficheros.Leer.leer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Leer {
    
    public static void leer(){
        
         FileReader leer = null;
         int c = -1;
         try {
            //constructor para crear el objeto de la clase FileReader
             leer = new FileReader("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\prueba.txt");
            c = leer.read();//igualamos el caracteres que ha leido a la "c"
            
            //bucle de lectura de read()
            while(c != -1){
                System.out.println((char)c);
                c = leer.read();//igualamos el caracter que ha leido a la "c"
            }
            //cerrar con close() el flujo de datos
            leer.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar");
        }
    }
    
    
    public static void leer2(){
        FileReader leer2 = null;
        try {
            leer2 = new FileReader("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\prueba.txt");
            BufferedReader buffer = new BufferedReader(leer2);
            String linea = null;
            linea = buffer.readLine();
            
            while ( linea != null){
                System.out.println(linea);
                linea = buffer.readLine();
            }
            buffer.close();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
    
    public static void main(String[] args) {
        
        /*2º A continuación, para comprobar si se ha escrito bien, abre el archivo para leer,
            lee todo lo que contiene, carácter a carácter, y escribe por pantalla los caracteres leídos.*/
        leer();
        
        
       /*3.Hacer lo mismo del ejercicio2, pero leyendo línea a línea utilizando una clase filtro.*/
        leer2();
    }
    
}
