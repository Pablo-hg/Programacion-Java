package estacion;
import java.util.Comparator;

public class Comparador implements Comparator<Hora>{
    
    @Override
    public int compare(Hora o1, Hora o2){
        return o1.compareTo(o2);
        
    } 
}
