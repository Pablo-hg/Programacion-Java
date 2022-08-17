
package arrayanumero;

import java.util.ArrayList;

public class ArrayaNumero {

    public static void main(String[] args) {
   
        int [] arrai = {1, 2, 3, 4, 0};
        ArrayList lista = new ArrayList();
        
        int i = 0;
        int elemento = 0;
        while (i < arrai.length){
            elemento = arrai[i];
            lista.add(elemento);
            i++;
        }
        System.out.println("holas");
    }
    
}
