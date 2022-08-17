
package primowhileasecas;

public class PrimoWhileAsecas {

    public static void main(String[] args) {
       int x = 11;
       int divisor = 2;
       while ((divisor < x) && (x%divisor) !=0){
           divisor++;
       }
       
       if (divisor == x)
            System.out.println("El número es primo");
        else //num_div > 0
            System.out.println("El número no es primo");
        
    }
    
}
