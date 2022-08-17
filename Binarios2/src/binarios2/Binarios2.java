
package binarios2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binarios2 {
    
    
     public static void eyl (int mes, char dia){
        
        String nombreArchivo = "mes" + mes  + ".txt";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\Binarios2\\" + nombreArchivo);
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir");
        }
        
        DataOutputStream dos = new DataOutputStream(fos);
        String diasSemana = "LMXJVSD";
        int numDias = 0;
        
        //case para ver el mes-> numDias
        switch(mes){
            case 2: numDias = 29;
            break;
            case 4:
            case 6:
            case 9:
            case 11: numDias = 30;
            break;
            default: numDias = 31;
         }
        
        //bucle de escritura hasta numDias
        for (int i = 0; i < numDias; i++){
            try {
                //writeInt
                dos.writeInt(i + 1);
                int pos = (diasSemana.indexOf(dia) + i)%7;
                char letra = diasSemana.charAt(pos);
                //writeChar(charat en diasSemana)
                dos.writeChar((char)letra);
            } catch (IOException ex) {
                System.out.println("Error de E/S");
            }
        }
        
        try {
            dos.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar");
        }
        
        FileInputStream fis  = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\Binarios2" + nombreArchivo);
            dis = new DataInputStream(fis);
        } catch (IOException ex) {
            System.out.println("Error al abrir");
        }
        
        for (int i = 0; i < numDias; i++){
            int j = 0;
            char l = ' ';
            try {
                j = dis.readInt();
                l = dis.readChar();
            } catch (IOException ex) {
                System.out.println("Error E/S");
            }
            System.out.println(j + " " + l);
        }
        
        try {
            dis.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar");
        }
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        eyl(5, 'V');
    }
    
}