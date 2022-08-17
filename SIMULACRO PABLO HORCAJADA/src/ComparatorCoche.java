
import java.util.Comparator;


public class ComparatorCoche implements Comparator<Coche>{
    
    @Override
    public int compare(Coche o1, Coche o2){
        if (o1.getPrioridad() == o2.getPrioridad())
            return 0;
        else if (o1.getPrioridad() < o2.getPrioridad())
            return -1;
        else
            return 1;
            
    }
}
