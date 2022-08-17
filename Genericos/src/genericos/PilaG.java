 
package genericos;

import java.util.ArrayList;

public class PilaG<E> {
    
    protected ArrayList<E> stack;
	//Estructura donde almacenamos los elementos de la pila
	
	public PilaG(){
	//Construir una pila vacía
            this.stack = new ArrayList();
		
	}
	
	public boolean pop (){
	/*desapilamos un elemento,
	si se puede hacer devolvemos true
	si no se puede devolvemos false*/
            if (!this.esVacia()){
                this.stack.remove(this.stack.size() - 1);
                return true;
            }
            
            else //pila está vacía
                return false;
            
	}
	
	public void push (E el){
	//apilamos un nuevo emento que será la nueva cima
            this.stack.add(el);
	}
	
	public E cima(){		
            //devolvemos el valor del elemento que está en la cima si lo hay
            //si la pila es vacia devolvemos el menor valor de los enteros           
            if (this.esVacia()) //if (this.esVacia() == true)
                return null;
            else //la pila contiene al menos un elemento
                return stack.get(stack.size() - 1);
	}
	
	public boolean esVacia(){
		//es vacía la pila?
		//true-> sí, false-> no
            /*if (this.stack.size() == 0)
                return true;
            else 
                return false;*/
            //cuando la pila es null, no se puede llamar al metodo
            return (this.stack.size() == 0); 
            
	}
	
	public String toString(){		
		/*
                imprimimos la pila, ejemplo:		
		|4|
		|3|
		|2|
		|1|		
		*/
            // <1, 2, 3, 4>   recorrido <------
            String cad = "";
            for (int i = this.stack.size() - 1; i >= 0; i--)
                cad = cad + "|" + this.stack.get(i) + "|" + "\n";
            //this.stack.get(i) --> llamada implicita a toString
            return cad;
                
		
	}
    
}
