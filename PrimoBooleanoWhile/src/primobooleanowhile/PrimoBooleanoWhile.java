
package primobooleanowhile;

public class PrimoBooleanoWhile {

    
    public static void main(String[] args) {
        
        int x = 18;
        boolean primo = true;
        int divisor = 2;
        
        
        while ((divisor < x )){ //Si no queremos que pase tpor todos los nuemros,
                                //si ya sabemos que no es primo pues ponemos esto  
                                // --> && (primo == true))
            if(x%divisor == 0)
            primo = false;
            divisor++;
            
        }
        
        if (primo)//primo == true
            System.out.println("El número es primo");
        else //primo == false --> !primo
            System.out.println("El número no es primo");
            
        }
    }
    

