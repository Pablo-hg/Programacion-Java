
package ejercicio.primo;


public class Primo {

    
    public static void main(String[] args) {
        
        
        System.out.println("Teneis que escribir un programa que declare un número entero y almacene en una variable boolean si dicho número es o no primo (true si es primo, y false si no lo es)");
    
        int x = 5;
        
        int aux = 5 % 2 ;
        
        
        boolean b1 = ((x % 2) == 0);//1 == 0
        
        boolean b2 = ((x % 3) == 0);//2 ==0
        
        boolean b3 = ((x % 4) == 0);//2 ==0
        
        boolean b4 = ((x % 5) == 0);//2 ==0
        
        boolean noprimo = b1 || b2 || b3;
        
        boolean primo = !noprimo;
        
        System.out.println(aux);
        
        System.out.println(b1);
        
        System.out.println(b2);
        
        System.out.println(b3);
        
        System.out.println(b4);
        
        System.out.println(noprimo);
        
        System.out.println(primo);
        
      
        
       
    }
    
    
}
