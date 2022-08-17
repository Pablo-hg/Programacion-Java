
package buclecadena1string;


public class BucleCadena1String {

    
    public static void main(String[] args) {
           
        String cadena1 = "dabalearrozalazorraelabad";
        
        char c = ' ';
        /*for (int i = cadena1.length() -1; i >=0 ; i--){
            c = cadena1.charAt(i);
            cadena2 = cadena2 + c;
        }*/
        int j = cadena1.length() -1;
        boolean palindromo = true;
        for (int i=0; i<j ; i++){
            if (cadena1.charAt(i) != cadena1.charAt(j));
            j--;
        }
        System.out.println(cadena1);
        
        if (palindromo == true)
            System.out.println("la palabra" + cadena1+ " es palindroma");
        else
            System.out.println("la palabra" + cadena1+ " no es palindroma");
        
        
        
        
      
        
    }
    
}
