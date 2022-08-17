
public class Aleatorio {
    
   public static void main(String[] args) {
        int p1 = 0;
        int p2 = 0;
        int total1 = 0;
        int total2 = 0;
        int max = 0;
         int [] dado = new int [10];
        int i = 0;
        
        while(dado[i] < dado.length){
            dado[i] = ((int)Math.random()*5)+1;
            total1 = total1 + dado[i];
            i++;
        }
        while(dado[i] < dado.length){
            dado[i] = ((int)Math.random()*5)+1;
            total2 = total2 + dado[2];
            i++;
        }
        if (total1 > total2)
        System.out.println("El ganador es el jugador 1 con : " + total1);
        else
            System.out.println("El ganador es el jugador 1 con : " + total2);
        
    }
    
}