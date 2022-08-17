
package numeroarray;

public class NumeroArray {

    
    public static void main(String[] args) {
       int num = 5121;//constuir el array{5, 1, 2, 1}
       //bucle para calcular el numero de cifras que tiene num
       int [] numero = new int[4];
       int i = numero.length -1;
       while ( i>=0){
           numero[i]= num%10;
           num = num/10;
           i--;
       }
       i = 0;
       while (i < numero.length){
           
           System.out.print(numero[i]);
           i++;
       }
       
    }
    
}
