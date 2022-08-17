
package pceubasket3;

import java.util.ArrayList;

public class PceuBasket3{

    static double div_dec (int a, int b){
        return ((double)a)/b;
    }
    
    static int intervalo (int a, int b){
        //esta funcion devolvere un numero que esté entre a y b
        /*a = 1;
        b = 5;
        int num1 =((int)Math.random()*(b-1))+a;
        return num1;*/
       
        int num1 = (int)(Math.random()*(b-a+1));
        int r = num1 + a;
        return r; 
    }
    
    static int max (int [] v){
        //devolver el maximo del array v
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < v.length; i++)
            if(v[i] > max)
                max = v[i];
        return max;
        /*for (int i = 0; i < anotadores.length; i++)
            if (anotadores[i] > max_anotador)
                max_anotador = anotadores[i]; */
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int [] arrai = new int[15];
        char [] arraiC = new char[15];
        double [] arraiD = new double[15];
        */
        ArrayList[] matrizA = new ArrayList[15];                
        //arriL es un Array que guarda ArrayList
        //en cada una de sus posiciones      
        for (int i = 0; i < matrizA.length; i++)
            matrizA[i] = new ArrayList();        
        //int num_tiros = (int)(Math.random()*41) + 80;//[80-120] = [0-40] + 80
        int num_tiros = intervalo(80, 120);
        System.out.println("Tiros lanzadosA: " + num_tiros);
        int aux = num_tiros;       
        int tiro = 0;        
        int num_jugador = 0;        
        int scoreA = 0;        
        int scoreB = 0;        
        int num_aciertos = 0;        
        int max_anotador = 0;  
        int [] anotadores = new int [15];
        while (num_tiros > 0){
            //generar aleatorio [0-14]->número de jugador
            num_jugador = intervalo(0, 14);
            //generar aleatorio [1-7]-> tiro
            tiro = intervalo(1,7);
            //actualizar el array de ArrayList
            matrizA[num_jugador].add(tiro);
            //actualizar score;
            if (tiro < 4){//acierto {1, 2 o 3}
              scoreA = scoreA + tiro;
              anotadores[num_jugador] = anotadores[num_jugador] + tiro;
              num_aciertos++;
            }
            num_tiros--;
        }
        
        /*for (int i = 0; i < anotadores.length; i++)
            if (anotadores[i] > max_anotador)
                max_anotador = anotadores[i];*/
        max_anotador = max(anotadores);
        System.out.println("Maximo anotadorA: " + max_anotador);
        System.out.println("MarcadorA: " + scoreA);
        System.out.println("Número de aciertosA: " + num_aciertos);
        //tasa de aciertos
        //System.out.println("Tasa de aciertosA: " + (((double)num_aciertos/aux))*100);
        System.out.println("Tasa de aciertosA: " + div_dec(num_aciertos,aux)*100);
        //tasa de fallos
        //System.out.println("Tasa de fallosA: " + (((double)(aux - num_aciertos)/aux))*100);
        System.out.println("Tasa de fallosA: " + div_dec(aux - num_aciertos, aux)*100);
        
    
    }
    
}