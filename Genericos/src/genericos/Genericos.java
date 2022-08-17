
package genericos;

import java.util.ArrayList;
import java.util.Iterator;

public class Genericos {

    
    public static <E> int tamanio(PilaG<E> p){//denotamos que el metodo es generico
        return p.stack.size();
    }
     
    
    public static <E extends Comparable> E maximo(PilaG<E> p){
      //return null;
      //compareTo para las comparaciones
      E maximo = null;
      if (p != null){
        Iterator it = p.stack.iterator();
        
      
      if (it.hasNext())
          //prevenimos la posibilidad de que tengamos null como argumento
        maximo = (E) it.next();
      
      while(it.hasNext())//it.hasNext() == true
      {  
         E elemento = (E) it.next();
         if (elemento.compareTo(maximo) > 0)
              maximo = elemento;
         //System.out.println(elemento);
      }
      
      }
      
      return maximo;
      //Tanto en el caso de p = null como en el caso de vacía devolvemos null
      
      
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList lista = new ArrayList();
        
        lista.add(1);
        
        lista.add("Prueba1");
        
        //System.out.println(lista.toString());
        
        PilaG pg = new PilaG();
        
        pg.push(1);
        
        pg.push("Prueba2");
        
        pg.push(lista);
        
        String cad = pg.toString();
        
        System.out.println(cad);
        
        ColaG cg = new ColaG();
        
        cg.encolar(2);
        
        cg.encolar("Prueba3");
        
        cg.encolar(pg);
        
        String cad2 = cg.toString();
        
        System.out.println(cad2);
        
        int tam = Genericos.tamanio(pg);
        
        System.out.println(tam);
        
        PilaG<Integer> pi = new PilaG();
        
        PilaG<Double> pnull = null;
        
        //la pila está a null--> NullPointerException
        //pnull.esVacia();
        
        SerVivo sv  = new SerVivo();
        
        Guerrero g1 = new Guerrero("G1");
        
        sv = g1;
        
        SerVivo sv2 = new Guerrero("G2");
        
        int someInteger = 10;
        
        PilaG<SerVivo> psv = new PilaG();
        
        PilaG<Guerrero> pgg = new PilaG();
        
        //Esta asignación no se puede hacer
        
        //psv = pgg;
        
        PilaG<Integer> pint = new PilaG();
        
        pint.push(1);
        
        pint.push(2);
        
        pint.push(3);
        
        Genericos.maximo(pint);
        
        
    }
    
}
