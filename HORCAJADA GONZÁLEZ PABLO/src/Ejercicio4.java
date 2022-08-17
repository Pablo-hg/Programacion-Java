
import java.io.*;


public class Ejercicio4 {
    public static void main(String[] args) {
        
        //Jugadores
        String[] mvp = {"James Harden", "Kawhi Leonard", "Paul George", "Stephen Curry","DamianLillard",
                        "Giannis Antetokounmpo", "Nikola Jokic", "CJ McCollum", "Russell Westbrook","DeMar DeRozan"};
        //Puntos por partido en Playoffs
        int [] points_game = {32, 31, 28, 27, 27, 26, 25, 25, 23, 22};
        //Partidos jugados en Playoffs
        int [] partidos = {11, 18, 5, 16, 16, 15, 14, 16, 5, 7};
        
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        FileInputStream fis = null;
        
        try{
            fos = new FileOutputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\MVP.dat");  
            oos = new ObjectOutputStream(fos);
            
            for (int i = 0; i < mvp.length; i++){
                oos.writeUTF(mvp[i]);
                oos.writeInt(points_game[i]);
                oos.writeInt(partidos[i]*points_game[i]);
            }
            
            oos.close();
            
        } catch (IOException ex) {
            System.out.println("Error al escribir o al abrir");
        }
        
        
        try{
            fis = new FileInputStream("D:\\Cosas de clase\\cosas de todo\\PROGRAMACION (JAVA)\\Pruebas\\MVP.dat");
            ois = new ObjectInputStream(fis);

            for (int i = 0; i < mvp.length; i++){
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
        }  
    }
    
}
