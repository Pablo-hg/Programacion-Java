package pila;
import java.util.ArrayList;

public class Pila {
	
	private ArrayList<Integer> stack;
	//Estructura donde almacenamos los elementos de la pila
	
	public Pila(){
        //Construir una pila vacia
        this.stack = new ArrayList<Integer>();
	}
	
	public boolean pop (){
	/*desapilamos un elemento
	si se puede hacer devolvemos true
	si no se puede devolvemos false*/
        if (!this.esVacia()){
            this.stack.remove(this.stack.size()-1);
            return true;  
        }
        else
            return false;
	}
	
	public void push (int el){
	//apilamos un nuevo elemento que será la nueva cima
        this.stack.add(el);
	}
	
	public int cima(){
	//devolvemos el valor del elemento que está en la cima si lo hay.
        //Si la pila está vacia, devolvemos el menor valor de los enteros
         if (this.esVacia()) //if(this.esVacia() == true)
             return Integer.MIN_VALUE;
         else //la pila contiene almenos un elemento
             return stack.get(stack.size()-1); //si fuera la 1º habria que poner index en los ()
	}
	
	public boolean esVacia(){
	//es vacía la pila?
	//true-> sí, false-> no
        /*if (this.stack.size() == 0)
            return true;
        else
            return false;*/
        return (this.stack.size() == 0);
	}
	
	public String toString(){
        /*imprimimos la pila, ejemplo:	
	|4|
	|3|
	|2|
	|1|*/	
        String cad = "";
        for (int i = stack.size()-1; i>=0; i--)
           cad = cad + "|" + stack.get(i) + "|" + "\n"; // "\n" es un salto de linea
        return cad;
	}
}