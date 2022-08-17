
package encontrar3;


public class Encontrar3 {

    public static void main(String[] args) {
        int num = 4;
        int [] valores = {1,2,3,3,7};
        int posicion = -1;
        //dejar en apariciones el numero
        //de apariciones de num en el 
        // array valores
        int i = valores.length -1;
        while ((i >= 0)&&(valores[i] != num)){
            i--;
        }
        /*if(i == -1) // no lo encuentra --> i < 0
            posicion = -1;
        else
            posicion = 1;*/
        if ( i <=0)
            posicion = i;
        
        System.out.println(posicion);
    }
   }
    

