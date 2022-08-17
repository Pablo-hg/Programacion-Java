
package nºapariciones;

public class Nºapariciones {

    public static void main(String[] args) {
        int num =3 ;
        int [] valores = {1,2,3,3,7};
        int apariciones = 0;
        //dejar en apariciones el numero
        //de apariciones de num en el 
        // array valores
        int i = 0;
        while (i < valores.length){
         if (num == valores[i])
         apariciones++;
         
            i++;
        }
        System.out.println(apariciones);
    }
    
}
