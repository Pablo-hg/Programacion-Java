package conjunto;
public class Principal {
    
    public static void main(String[] args) {
        
        Conjunto c = new Conjunto();
        Conjunto c2 = new Conjunto();
        
        //añadimos valores a c y p
        c.añadir(1);
        c.añadir(2);
        c.añadir(3);
        
        c2.añadir(1);
        c2.añadir(4);
        
        //interseccion de c y p
        //si se repiten los numeros varias veces, solo los mete una vez
        Conjunto c3 = c.interseccion(c2);
        
        /*
        //quitamos los valores que esten en la posicion x de c p
        c.quitar(2);
        p.quitar(1);
        */
        
        //union de c y p
        Conjunto c4 = c.union(c2);
        
        //añadimos un elemento a c4, pero al hacerlo, no se añade en c2
        c4.añadir(5);
        
        
        
    }
    
}
