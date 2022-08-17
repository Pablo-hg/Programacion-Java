
package ficheros;

import java.io.FileWriter;
import java.io.IOException;



public class Escribir {
    
    public static void escribir(){
        /* try {//si eel try da error, ejecuta el catch
            FileWriter directorio = new FileWriter("C:/Pruebas");//crea el fichero Prueba.txt en al ubicacion indicada
        } catch (IOException ex) {
            System.out.println("la ruta no es correcta");
        }*/
       //FileWriter directorio = new FileWriter("C:/Pruebas/prueba.txt"); 
       //write(char) para escribir en el fichero
       //close para cerra el flujo de datos
       
       FileWriter escribir = null;
        try {
            escribir = new FileWriter("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\prueba.txt");
            for(char i='a'; i <'z';i++)
                escribir.write(i);
                escribir.close();
        } catch (IOException ex) {
            System.out.println("Posible error de apertura, escritura o cierre");
        }
    }
    
    public static void main(String[] args){
        /*.Escribe un programa que abre un archivo llamado “prueba.txt”, escribe en un archivo
            caracteres desde el carácter ‘a’ hasta el carácter ‘z’, carácter a carácter, y lo cierra.
        */
        
        
        
        escribir();
                
    }    
}
