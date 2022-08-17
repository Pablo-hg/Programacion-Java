package cola;
public class Principal {
    public static void main(String[] args) {
        
        //Instanciar una cola vacia
        Cola c = new Cola();
        
        //Añadimos elementos a la cola
        c.encolar(1);
        c.encolar(2);
        c.encolar(3);
        c.encolar(4);
        
        //Imprimimos la cola y al cabecera
        System.out.println(c.cabecera());
        System.out.println(c); 
        
        
        //sacamos elementos de la cola
        c.desencolar();
        c.desencolar();
        
        System.out.println(c.cabecera());
        System.out.println(c);
        
        c.desencolar();
        c.desencolar();
        
        System.out.println(c.cabecera());
        System.out.println(c);//no imprime nada porque está vacia
        
        
    }
    
}
