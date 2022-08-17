
import java.util.ArrayList;

public class Lista <E>{
    
    private ArrayList<E> list;

    public Lista() {
        this.list = new ArrayList<E>();
    }
	
    public Lista(Lista l){		
        this.list = new ArrayList<E>(l.list);			
    }
	
    public boolean esta(E el){
        return !this.list.contains(el);                
    }        
        
    public boolean anadirElemento (E el){
        boolean res = false;
        if (esta(el)){
            res = true;
            this.list.add(el);
        }
        return res;		
    }
	
    public boolean quitarElemento (E el){		
        return this.list.remove((E)el);		
    }
        
    public void vaciar(){		
        this.list.clear();		
    }    
}
