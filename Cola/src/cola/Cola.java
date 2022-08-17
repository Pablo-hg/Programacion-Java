package cola;
import java.util.ArrayList;

public class Cola {
    private ArrayList<Integer> queue;

    public Cola() {
        //construrir una cola vacia
        this.queue = new ArrayList<Integer>();
    }

    public void encolar(int el){
        //añadir un elemento al final de la cola
       this.queue.add(el);
    }
    
    public boolean desencolar(){
        if (this.esVacia())
            return false;
        else{ //hay elementos en al cola
            this.queue.remove(0);
            return true;
        }
    }
    
    public int cabecera(){
        if (this.esVacia())
            return Integer.MIN_VALUE;
        else
            return queue.get(0);
    }
    
    public boolean esVacia(){
        /*if (this.queue.size()== 0)
            return true;
        else
            return false;*/
        return (this.queue.size()== 0);
    }
    
    @Override
    public String toString(){
        //En al misma linea ponemos elementos separados por comas
        String cad = "";
        //recorrido de izq a der
        if (!esVacia()){
            for (int i = 0; i <= queue.size()-1; i++)
                cad = cad  + queue.get(i) + ", ";
                 cad = cad  + queue.get(queue.size()-1);
	}
        return cad;
    }
}
    

