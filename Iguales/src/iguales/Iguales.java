
package iguales;
public class Iguales {
    public static void main(String[] args) {
     //Numero que verifique las 3 cifras de un numero son iguales
     //111  1 -> 1 ->1
     int num = 121;
     int [] arrai = new int [3];
     int i = 0;
     while ( i < 3){
         arrai[i] = num % 10;
         num = num/10;
        i++; 
     }
     if (arrai[0] == arrai[1] && arrai[0] == arrai[2]) 
            System.out.println("cierto");
       else
            System.out.println("falso");
    }
    
}
