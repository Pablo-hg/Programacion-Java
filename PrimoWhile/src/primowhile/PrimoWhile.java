
package primowhile;


public class PrimoWhile {

    
    public static void main(String[] args) {
        int x = 18;
        int num_div = 0;
        int divisor = 2;
        
        while ((divisor < x)) //Si no queremos que pase por todos los nuemros,
                              //si ya sabemos que no es primo pues ponemos esto  
                              //&& (num_div != 0))
        { 
            if (x % divisor == 0)
                num_div++;
                divisor++;
            
        }
        
        if (num_div == 0)
            System.out.println("El número es primo");
        else //num_div > 0
            System.out.println("El número no es primo");
    }
    
}
