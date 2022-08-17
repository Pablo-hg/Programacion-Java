
package decimal_array;

public class Decimal_Array {

   
    public static void main(String[] args) {
       int num = 1320;
       int numaux = num;
       int num_digs = 0;
       
       //bucle para saber si el numero de digitos
       //del numero y erservar mempria para esa cantidad
       while (numaux != 0){
           numaux = numaux/10;
           num_digs++;
       }
       int [] numero = new int [num_digs];
       
       for (int i = numero.length -1 ; i >=0; i --){
           numero[i] = num % 10;
           num = num/10;
       }
        for(int i = 0; i < numero.length; i++)
            System.out.print(numero[i]);
        
        
    }
    
}
