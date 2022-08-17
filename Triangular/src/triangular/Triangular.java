
package triangular;
public class Triangular {
    public static void main(String[] args) {
       /*Se dice que un número entero es triangular cuando éste es igual a la suma
        de varios números enteros consecutivos (menores que él lógicamente).
        Por ejemplo los número 3, 6 y 10 son triangulares.*/
       
       int acumulador =0;
       int i = 1;
       int z = 21;
       
       while (acumulador < z){
           acumulador =   i + acumulador;
           i++;
       }
       if (acumulador == z)
               System.out.println(z + " es un numero triángulo");
       else
            System.out.println(z + " no es un numero triángulo");
    }
    
}
