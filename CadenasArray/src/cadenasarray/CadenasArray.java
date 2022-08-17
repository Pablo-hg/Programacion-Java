
package cadenasarray;


public class CadenasArray {

    public static void main(String[] args) {
        
        String cadena1 = "ISEP CEU";
        char[] cadena2 = new char [cadena1.length()];
        int i = 0;
        char c = ' ';
        while (i < cadena1.length()){
            //c = cadena1.charAt(i);
            //cadena2[i] = c;
            cadena2[i] = cadena1.charAt(i);
            i++;
        }
        
        
        
    }
    
}
