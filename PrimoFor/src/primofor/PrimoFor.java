
package primofor;

public class PrimoFor {

    
    public static void main(String[] args) {
        
        int x = 11;
        int num_div = 0;
        
        for (int divisor = 2; divisor < x; divisor++){//divisor <= x -1 
           if ( x % divisor == 0)
               num_div++;
           
        }
       if (num_div == 0)
            System.out.println("el numero es primo");
       else //num_div es mayor que cero
            System.out.println("el numero no es primo");
    }
    
}
