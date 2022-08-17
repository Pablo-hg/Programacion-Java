
package iguales37;

public class Iguales37 {
    
    public static void main(String[] args) {
        //la suma de 3 cifras iguales por 37 es igual al numero de 3 cifras iguales
        //111  1 + 1 + 1 = 3  3 * 37 = 111
        int num = 757;
        int cifra1 = num % 10;
        int cifra2 = cifra1 % 100;
        int cifra3 = cifra2 / 1;
        int suma = (cifra1 + cifra2 + cifra3)*37;
        
        if(suma == num)
            System.out.println("cierto");
        else
            System.out.println("falso");
    }
    
}
