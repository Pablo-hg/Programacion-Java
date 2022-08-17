package aleatoriolistadin;
import java.util.ArrayList;
public class AleatorioListaDin {
    
    public static void main(String[] args) {
       ArrayList lista = new ArrayList();//reservo memoria para la lista
       
       lista.add(5);
       
       if(lista.contains(1))
            System.out.println("Contiene el 1");
       else
            System.out.println("No contiene el 1");
       
        System.out.println(lista.size());
       
       int x = (int)lista.get(0);
       
        System.out.println(x);
       
    }
    
}
