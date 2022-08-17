
package primobooleano;


public class PrimoBooleano {

    
    public static void main(String[] args) {
        int x = 16;
        boolean primo = true;
        
        for (int divisor = 1; divisor < x; divisor++){//divisor <= x -1
            if(x%divisor == 0)
                primo = false;
        }
        
        if (primo = true)//primo == true
            System.out.println("El número es primo");
        else //primo == false --> !primo
            System.out.println("El número no es primo");
        
        
        
    }
    
}
