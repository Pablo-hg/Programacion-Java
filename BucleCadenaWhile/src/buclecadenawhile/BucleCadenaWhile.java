
package buclecadenawhile;


public class BucleCadenaWhile {

  
    public static void main(String[] args) {
               
        String cadena1 = "dabalearrozalazorraelabad";
        
        char c = ' ';
        int j = cadena1.length() -1;
        boolean palindromo = true;
        int i = 0;
        while(i< j){
            if(cadena1.charAt(i)!= cadena1.charAt(j))
                palindromo = false;
            j--;
            i++;
        }
        System.out.println(cadena1);
            
        if (palindromo == true)
            System.out.println("la palabra" + cadena1+ " es palindroma");
        else
            System.out.println("la palabra" + cadena1+ " no es palindroma");
        
    }
    
}
