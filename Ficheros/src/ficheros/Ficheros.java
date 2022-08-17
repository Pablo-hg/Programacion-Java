
package ficheros;

import java.io.File;

public class Ficheros {
    
    public static void main(String[] args) {
        
        /*Escribir un programa que liste todos los archivos contenidos
        en un directorio y, para cada uno de ellos, muestre su nombre, 
        su ruta absoluta, sus permisos de lectura, escritura y ejecución.*/
        
        File directorio = new File("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas");
        
        if ((directorio.exists() && (directorio.isDirectory()))){
            
            //creamos un array de todos los ficheros que hay en el directorio
            File[] lista = directorio.listFiles();
            
            for (int i = 0;i < lista.length; i++){
                System.out.println("Ruta Absoluta : " + lista[i]);
                System.out.println("Nombre : " + lista[i].getName());
                System.out.println("Permiso de lectura : " + lista[i].canRead());
                System.out.println("Permiso de escritura : " + lista[i].canWrite());
                System.out.println("Permiso de ejecucion : " + lista[i].canExecute());
            }
        
        
        }
    }
    
}
