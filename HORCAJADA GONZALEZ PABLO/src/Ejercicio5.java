
import java.util.ArrayList;


public class Ejercicio5 {

    
    public static void main(String[] args) {
        
        //APARTADO A//
        int [] apartadoa = {5,0,3};
        int i = apartadoa.length-1;
        int menor = 0;
        while (i > 0){
            if(apartadoa[i] < apartadoa[i -1])
                menor = apartadoa[i];
            i--;
        }
        i = 0;
        int j = 0;
        int suma = 0;
        int media = 0;
        while(i < menor){
            suma = suma + apartadoa[i];
            i++;
            j++;
        }
        media = suma / j;
        System.out.println(media);
        //APARTADO A//
        
        
        //APARTADO B//
        i = 0;
        ArrayList apartadob = new ArrayList (apartadoa.length);
        while ( i < apartadoa.length){
            apartadob.add(apartadoa[i]);
                    i++;
        }
        
        //APARTADO B//
        
    }
    
}
