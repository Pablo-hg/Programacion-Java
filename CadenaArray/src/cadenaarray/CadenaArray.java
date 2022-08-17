
package cadenaarray;


public class CadenaArray {

 
    public static void main(String[] args) {
        
        String cadena1 = "ISEP CEU";
        
        char[] cadena2 = new char [cadena1.length()];
        int i = 0;
        char c = ' ';
        ///////bucle
        while (i < cadena1.length()){// i < cadena2.length
            cadena2[i] = cadena1.charAt(i);
            i++;
        }
        /////////WHILE///////////
        i = 0;
        while (i < cadena2.length){
            System.out.print(cadena2[i]);
            i++;
        }
        System.out.println("");
        /////////WHILE///////////
        
        /////////FOR///////////
        /*for (i = 0; i < cadena2.length; i++)
            System.out.print(cadena2[i]);
         System.out.println("");*/
         /////////FOR///////////
}
}