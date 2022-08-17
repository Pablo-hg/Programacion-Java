
import java.util.ArrayList;
import java.util.Iterator;


public class ejercicio5 {
    public static void main(String[] args) {
        
        ArrayList<String> letras = new ArrayList<String>();
        
        letras.add("a");
        letras.add("b");
        letras.add("c");
        letras.add("d");
        letras.add("e");
        letras.add("f");
        letras.add("g");
        letras.add("h");
        letras.add("i");
        letras.add("j");
        
       
        Iterator it = letras.iterator();
        while(it.hasNext()){
            String letra = (String) it.next();
            System.out.println(letra);
        }
         
          
    }
    
}
