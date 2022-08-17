
package suma;

public class Suma {

    public static void main(String[] args) {
      int [] numeros = {1, 3, 5, 7};
      int [] numeros2 = {2, 4, 6, 8}; 
      int [] resultado = new int [numeros2.length];//tambien se podria poner numeros1.lenght
        //array resultado
        //{1+2,3+4,5+6,7+8}
        //{3,7,11,15}
      
      /////////WHILE/////////
       /*int i = 0;
       while (( i < numeros.length) && ( i < numeros2.length)){
            resultado[i] = numeros[i] + numeros2[i];
            System.out.println(resultado[i]);
           i++;
       }*/
       /////////WHILE/////////
       
       /////////FOR/////////
       int i = 0;
       for ( i = 0;(( i < numeros.length) && ( i < numeros2.length)); i++){
           resultado[i] = numeros[i] + numeros2[i];
           System.out.println(resultado[i]);
           }
            
       /////////FOR/////////
        
      
    }
    
}
