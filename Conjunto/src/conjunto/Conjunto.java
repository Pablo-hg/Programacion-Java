package conjunto;

import java.util.ArrayList;

public class Conjunto {
    
    private ArrayList<Integer> set;
        public Conjunto(){
            this.set = new ArrayList<Integer>();
        }
        
        public Conjunto(Conjunto c){
            //copia lo que hay en c en this
            /*for (int i = 0; i < this.set.size();i++)
                this.añadir(c.set.get(i));*/
            //LLamar al constructor de copia de ArrayList
            //this.set igual a c.set
             this.set = new ArrayList<Integer>(c.set);
        }

    
        public boolean añadir (int el){
            //Si el elemento ya está no lo vueleve a añadir y devuelve falso
            //Si no estaba previamente, lo añade y devuelve cierto
            if (!this.set.contains(el)){ //el elemento no estaba
                this.set.add(el);
                return true;
            } 
            else//el elemento ya estaba
                return false;
        }
        
        
        public boolean quitar (int el){
            //true si se puede hacer la operacion
            //en otro caso false
            if (!this.set.contains(el))
                return false;
            else
                this.set.remove(el);
                return true;
        }
        
        
        public void vaciar(){
            this.set.clear();//vacia el Array
        }
        
        
        public Conjunto union(Conjunto c){
            //this union c(en este caso)
            //this = {1,2,3}
            //c = {1,4}
            //Utilizar constructor copia
            Conjunto aux = new Conjunto(c);
            for (int i = 0; i < this.set.size();i++)
                aux.añadir(this.set.get(i));
            //c = {1, 4}
            //this = {1, 2, 3}
            //aux = {1, 2, 3, 4}
            return aux;
            //c es un parametro de entrada/salida
        }
        
        
        public Conjunto interseccion(Conjunto c){
            //this interseccion c(en este caso)
            //devuelve los  valores comunes de this y c (osea el 1)
            Conjunto res = new Conjunto();
            for (int i = 0;i < this.set.size();i++)
                if (c.set.contains(this.set.get(i)))
                    res.añadir(this.set.get(i));
            //c = {1, 4}
            //this = {1, 2, 3}
            //res = {1}
            return res;
        }
        
    @Override
        public String toString (){
            String cad = "{";
            if (!this.set.isEmpty()){
            for ( int i = 0; i < this.set.size(); i++)
                cad = cad + this.set.get(i) + ", ";
                 cad = cad + this.set.get(this.set.size()-1);
            }
            return cad + "}";
        }
    
}
