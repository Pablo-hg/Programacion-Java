
package multiplicacion;


public class Multiplicacion {

    public static void main(String[] args) {
        /*int x = 5;
        int y = 3;
        int z = x*y;
        System.out.println(z);
        
        Está prohibida la multiplicacion usando
        for y la operacion sumar,llevar a cabo la 
        multiplicacion de x por y dejando en z el resultado*/
        
        
        
        int x = 5;
        int y = 3;
        int z = 0;
        for ( int k =1; k <=y  ; k++){//si k vale 1, como k es menor que y ( osea 1 es > que 3),
            z = z + x;                //,que me haga la siguiente operacion y veces(osea 3
        }
        System.out.println(z);
            
        
        
        
        
    }
    
}
