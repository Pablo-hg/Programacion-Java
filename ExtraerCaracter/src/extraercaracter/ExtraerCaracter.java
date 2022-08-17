
package extraercaracter;
public class ExtraerCaracter {
    public static void main(String[] args) {
       /*Dado una palabra de longitud impar representada mediante un String,
        extraer de ella su carácter central y dejar en otros dos String las cadenas 
        de caracteres a la derecha e izquierda de dicho carácter. Por ejemplo, 
        si tenemos la siguiente cadena: String original = “aprobados”;
        Nuestro programa debería extraer como carácter central la ‘b’ y 
        las dos cadenas a generar a partir de la original serían “apro” y “ados”.*/
       
       String palabra = "aprobados";
       String izquierda = "";
       String derecha = "";
       String central = "";
       char c = ' ';
       char b = ' ';
       char a = ' ';
       int i = 0;
       int j = palabra.length()-1;
       
       while (i != j){
           //derecha
           c = palabra.charAt(j);
           derecha = derecha + c;
           //izquierda
           b = palabra.charAt(i);
            izquierda = izquierda + b; 
           i++;
           j--;
        }  
       
        if (palabra.charAt(i) == palabra.charAt(j)){
           a = palabra.charAt(i);
           central = central + a ;
        }
        System.out.print(izquierda);
        System.out.println(central);
        System.out.println(derecha);
            
       
    }
    
}
