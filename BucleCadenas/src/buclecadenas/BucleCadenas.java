
package buclecadenas;

public class BucleCadenas {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
        String cadena1 = "ana";
        String cadena2 = "";
        char c = ' ';
        /*for (int i = cadena1.length() -1; i >=0 ; i--){
            c = cadena1.charAt(i);
            cadena2 = cadena2 + c;
        }*/
        int i = cadena1.length() -1;
        while (i >=0){
            c = cadena1.charAt(i);
            cadena2 = cadena2 + c;
            i--;
        }
        
        System.out.println(cadena1);
        System.out.println(cadena2);
        
        if (cadena1.equals(cadena2))
            System.out.println(cadena1 + " es una palabra palindroma");
        else
            System.out.println(cadena2 + " no es una palabra palindroma");
        
        
    }
    
}
