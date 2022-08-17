
package sumatoriosi;

public class SumatorioSi {

    
    public static void main(String[] args) {
       
        int [] suma = {15, 7, 9, 2, 5, 21};
        /*
        int [] suma = new int [6];
        suma[0] = 15;
        suma[1] = 7;
        suma[2] = 9;
        suma[3] = 2;
        suma[4] = -5;
        suma[5] = 21;
        */
        
        // los elementos que son pares se acmularan en la varibale pares , y con los impares lo mismo
        int i = 0;
        int pares = 0;
        int impares = 0;
        ///////////WHILE///////////
          /*while (i < suma.length){
            /x = x + suma[i];
              if ( suma[i] % 2 == 0 ){
                  pares = pares + suma[i];
              }
                  else // i & 2 == 1
                  impares = impares + suma[i];
            i++;
        }*/
        
        ///////FOR////////
        
        for (i = 0; i < suma.length;i++){
            if((suma[i] % 2) == 0)
                pares = pares + suma[i];
            else
                impares = impares + suma [i];
        }
        
         System.out.println("total de sumar los pares " + pares);
         System.out.println("total de sumar los impares " + impares);
        
        
    }
    
}
