
package genericos;

import java.util.ArrayList;
import java.util.Iterator;

public class ColaG <E>{
     private ArrayList <E> queue;

    public ColaG() {
        //construir una cola vacía
        this.queue = new ArrayList();
    }
    
    public void encolar(E el){
        //añadir un elemento al final de la cola
        this.queue.add(el);
    }
    
    public boolean desencolar(){
        if (this.esVacia())
            return false;
        else{//hay elementos en la cola
            this.queue.remove(0);
            return true;
        }    
    }
    
    public E cabecera(){
        //si es vacia min_value de Integer
        if (this.esVacia())
            return null;
        else
            return this.queue.get(0);
    }
    
    public boolean esVacia(){
        /*if (this.queue.size() == 0)
            return true;
        else
            return false;*/        
        return (this.queue.size() == 0);
    }
    
    @Override
    public String toString(){
        //En la misma línea ponemos elementos separados por comas
        String cad = "";
        //recorrido de izquierda a derecha a diferencia
        //de lo que hacíamos en la clase Pila
        /*if (!esVacia()){
        for (int i = 0; i < this.queue.size() - 1; i++)
            cad = cad + this.queue.get(i) + ", ";
        cad = cad + this.queue.get(this.queue.size() - 1);
        //this.stack.get(i) --> llamada implicita a toString 
        }*/
        Iterator it = this.queue.iterator();
        E elemento = null;
        while(it.hasNext()){
            elemento = (E) it.next();
            cad = cad + elemento + ",";
    }
       
        return cad;
        
        
        
    }
    
    
    
    
}

