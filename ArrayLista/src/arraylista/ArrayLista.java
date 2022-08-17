
package arraylista;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLista {
    
    public static void main(String[] args) {
       int num_elementos = 0;
       int suma_valores = 0;
       int max_valor = 0;
        //igualarlo con aleatorio entre 5 y 10 [5-10]
        num_elementos = (int)(Math.random()*6)+5 ;
        ArrayList lista = new ArrayList(num_elementos);
        int i = 0;
        while (i < num_elementos){
        //añadir valores entre 45 y 90[45-90]
            lista.add((int)(Math.random()*46)+45);
        //acumular los valores de los elementos para despues hacer la media
            suma_valores = (int)lista.get(i)+ suma_valores;
        //voy quedandome con el mayor en cada vuelta
            if((int)lista.get(i) > max_valor)
                max_valor = (int)lista.get(i);
            i++; 
        }//Ordena un ArrayList de  menor a mayor la lista
        Collections.sort(lista);
        System.out.println("Maximo generado: " + max_valor);
        System.out.println("Media calculada: " +(double)suma_valores/lista.size());
        System.out.print("La diferencia entre el 2º y el penultimo es :"
                + " " + ((int)lista.get(lista.size()-2) - (int)lista.get(1)));
        System.out.print("--> " + ((int)lista.get(lista.size()-2)));
        System.out.println(" - " + (int)lista.get(1));
    }
    
}
