
package coincide;


public class Coincide {

  
    public static void main(String[] args) {
      int [] numeros = {1, 3, 2, 7};
      
      ///////////CON BOLEANOS/////////
      //numeros[i] != i
      //boolean coincide = false;
        //coincide evaluara a cierto si el valor de 
        //la posicion de algun elemento coincide con el propio el2mento*/
      
        //numeros[i] == i-> coincide es true
         /*int i = 0;
         while ((i < numeros.length)&&(coincide == false)){ // es lo mismo que poner lo mismo que && (!coincide))
             if(numeros[i] == i)
                 coincide = true;
             i++;
         }
         System.out.println(coincide);*/
      ///////////CON BOLEANOS/////////
      
      //////////SIN BOLEANOS/////
      /*int i = 0;
      while ((i < numeros.length)&&(numeros[i] != i)){
          i++;
      }
        if(numeros.length == i)
            System.out.println("no coincide");
       else
            System.out.println("coincide");*/
      
      //////////SIN BOLEANOS/////
        
        ////////FOR/////
      int i = 0;
        for (i = 0;(i < numeros.length )&&(numeros[i]!= i);i++);
        
        if(numeros.length == i)
            System.out.println("no coincide");
       else
            System.out.println("coincide");
        ////////FOR/////
      
    }
    
}
