
package caracter;


public class Caracter {

   
    public static void main(String[] args) {
        char c;// permite que las varibales representan un caracter
        
        c = 'A';//
        
        int num = c; //nos indica el numero ASCII de la letra (y que la variable sea numero)
        
        System.out.println(c);
        
        System.out.println(num);
        
        boolean b1 = true;
        
        boolean b2 = false;
        // en general true representa al 1 y false al 0
        
        boolean b3 = b1 && b2;// && es como si fuera una multiplicacion
        
        boolean b4 = b1 || b2;// || es como si fuera una suma 
        
        System.out.println(b1);
        
        System.out.println(b2);
        
        System.out.println(b3);
        
        System.out.println(b4);
        
        boolean b5 = (5 < 3); 
        
        System.out.println(b5);
        
        boolean b6 = !b5;// ! representa lo contrario de algo
        
        System.out.println(b6);
    }
    
}
