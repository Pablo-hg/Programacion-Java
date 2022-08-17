
package cadenas2;


public class Cadenas2 {

    
    public static void main(String[] args) {
                 // hola = 0123
     String cad = "hola";
     
     char c = cad.charAt(cad.length() - 1); // coge el caracter 4 - 1 (osea la h)
     char d = cad.charAt(1); // coge el caracter numº x ( en este caso la o)
     
     System.out.println(c);
     System.out.println(d);
     
     int longitud = cad.length(); //nos devuelve la longitud de caracteres
        System.out.println(longitud);
        
    //averiguar la letra de nuestro dni ( el 7 representa la F) 
     int dni = 53478135;
     int resto = dni % 23;
     
     System.out.println(resto);
     
    //Calcular la letra asociada a un número de dni
     String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
     char f = letras.charAt(resto); 
     //en la varibale letras cojo el caracter 7 ( que es la solcion del resto)
     System.out.println(f);
    }
    
}
