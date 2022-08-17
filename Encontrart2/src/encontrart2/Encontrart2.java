
package encontrart2;


public class Encontrart2 {

    
    public static void main(String[] args) {
        int num = 3;
        int [] valores = {1, 2, 3, 3, 7};
        int posicion = -1;
        //dejar en variable posicion la posicion de la 1º aparicion de num
        int i = 0;
        //encontrado = false --> valores [i] != num
        while ((i< valores.length)&&(valores[i] !=num)) {
            
            
            i++;
        }
        if ( i == valores.length) //no lo he encontrado
            posicion= -1;
        else  //lo encontré
            posicion = i;
            
        System.out.println(posicion);
    }
    
}
