package aleatoriolista;
public class AleatorioLista {
     public static void main(String[] args) {
        int p1 = 0;
        int p2 = 0;
        int total1 = 0;
        int total2 = 0;
        int max1 = 0;
        int numx = 0;
        int max2 = 0;
        int numx2 = 0;;
        int [] dado = new int [10];
        int [] dado2 = new int [10];
        int i = 0;
        
        while(i < dado.length){
            p1 = (int)(Math.random()*6)+1;
            dado[i] = p1;
            total1 = total1 + dado[i];
            if ( dado[i] > max1)
                max1 = dado[i];
            i++;
        }
        i = 0;
        while( i < dado.length){
            if (dado[i] == max1){
                numx++;
            }  
            i++;
        }
        i = 0;
        while(i < dado2.length){
            p2 = (int)(Math.random()*6)+1;
            dado2[i] = p2;
            total2 = total2 + dado2[i];
            if ( dado2[i] > max2)
                max2 = dado2[i];
            i++;
        }
        i = 0;
        while( i < dado2.length){
            if (dado2[i] == max2){
                numx2++;
            }  
            i++;
        }
        if (total1 > total2)
        System.out.println("El ganador es el jugador 1 con : " + total1);
        else if ( total1 == total2)
             System.out.println("han quedado empate con: " + total1);
        else
            System.out.println("El ganador es el jugador 2 con : " + total2);
        
        
        if (numx > numx2)
             System.out.println("El ganador es el jugador 1 repitiendo el " + max1 +" "+ numx + " veces");
        else if ( total1 == total2)
             System.out.println("han quedado empate repitiendo el : " + max1 + numx2 + " veces");
        else
            System.out.println("El ganador es el jugador 2 repitiendo el " + max2 + numx2 + " veces");
    }
    
}
