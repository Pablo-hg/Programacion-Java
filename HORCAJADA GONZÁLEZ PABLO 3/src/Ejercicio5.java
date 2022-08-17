
import java.util.ArrayList;
import java.util.Iterator;


public class Ejercicio5 {
    public static void main(String[] args) {
        
        
        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        
        Iterator it = lista.iterator();
        while(it.hasNext()){
            int numero = (int) it.next();//i++
            System.out.println(numero);
        }
        
    }
    
}
