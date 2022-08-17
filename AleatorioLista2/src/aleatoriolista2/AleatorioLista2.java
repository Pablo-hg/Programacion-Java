
package aleatoriolista2;

import java.util.ArrayList;

public class AleatorioLista2 {
    
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();//reservo memoria para la lista
       
       lista.add(3);
       
       if(lista.contains(1))
            System.out.println("Contiene el 1");
       else
            System.out.println("No contiene el 1");
       
        System.out.println(lista.size());
       
       int x = (int)lista.get(0);
       
        System.out.println(x);
        
        int aleatorio = 0;
        
        while ( aleatorio != 100){
            aleatorio = (int)(Math.random()*101);
            if(!lista.contains(aleatorio))//si no lo contiene
               lista.add(aleatorio);//lo añado
            System.out.println(aleatorio);
        }
        int i = 0;
        while ( i < lista.size()){
            System.out.println(lista.get(i));//no se repiten los numeros
            i++;
        }
        System.out.println("Paramos");
    }
    
}
