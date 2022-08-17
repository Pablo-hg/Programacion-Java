package pceubasket2;

import java.util.ArrayList;

public class PCeuBasket2 {
    public static void main(String[] args) {
       
        //int [] arrai = new int [15];
        //char [] arraiC = new char[15];
        //double [] arraiD = new double[15]
        
        
       ///////////////////////EQUIPO A//////////////////////////
        ArrayList[] matrizA = new ArrayList[15];                
        //arriL es un Array que guarda ArrayList
        //en cada una de sus posiciones      
        for (int i = 0; i < matrizA.length; i++)
            matrizA[i] = new ArrayList();        
        int num_tirosA = (int)(Math.random()*41) + 80;//[80-120] = [0-40] + 80
        System.out.println("Tiros lanzadosA: " + num_tirosA);
        int auxA = num_tirosA;       
        int tiroA = 0;        
        int num_jugadorA = 0;        
        int scoreA = 0;    
        int num_aciertosA = 0;        
        int max_anotadorA = 0;  
        int [] anotadoresA = new int [15];
        while (num_tirosA > 0){
            //generar aleatorio [0-14]->número de jugador
            num_jugadorA = (int)(Math.random()*15);
            //generar aleatorio [1-7]-> tiro
            tiroA = (int)(Math.random()*7) + 1;
            //actualizar el array de ArrayList
            //en la posicion num(lo que valga num_jugadorA)x de la matrizA,
            //añadele el num que valga tiro
            matrizA[num_jugadorA].add(tiroA);
            //actualizar score;
            if (tiroA < 4){//acierto {1, 2 o 3}
              scoreA = scoreA + tiroA;
            //en la posicion num(lo que valga num_jugadorA)x del array anotadoresA,
            //sumale el tiro
              anotadoresA[num_jugadorA] = anotadoresA[num_jugadorA] + tiroA;
              num_aciertosA++;
            }
            num_tirosA--;
        }
        for (int i = 0; i < anotadoresA.length; i++)
            if (anotadoresA[i] > max_anotadorA)
                max_anotadorA = anotadoresA[i];               
        System.out.println("Maximo anotadorA: " + max_anotadorA);
        System.out.println("MarcadorA: " + scoreA);
        System.out.println("Número de aciertosA: " + num_aciertosA);
        //tasa de aciertos
        System.out.println("Tasa de aciertosA: " + (((double)num_aciertosA/auxA))*100);
        //tasa de fallos
        System.out.println("Tasa de fallosA: " +
        (((double)(auxA - num_aciertosA)/auxA))*100);
        ///////////////////////EQUIPO A//////////////////////////
        System.out.println("");
        System.out.println("");
        
        
        ///////////////////////EQUIPO B//////////////////////////
        ArrayList[] matrizB = new ArrayList[15];                
        //arriL es un Array que guarda ArrayList
        //en cada una de sus posiciones      
        for (int i = 0; i < matrizB.length; i++)
            matrizB[i] = new ArrayList();        
        int num_tirosB = (int)(Math.random()*41) + 80;//[80-120] = [0-40] + 80
        System.out.println("Tiros lanzadosB: " + num_tirosB);
        int auxB = num_tirosB;       
        int tiroB = 0;        
        int num_jugadorB = 0;        
        int scoreB = 0;       
        int num_aciertosB = 0;        
        int max_anotadorB = 0;  
        int [] anotadoresB = new int [15];
        while (num_tirosB > 0){
            //generar aleatorio [0-14]->número de jugador
            num_jugadorB = (int)(Math.random()*15);
            //generar aleatorio [1-7]-> tiro
            tiroB = (int)(Math.random()*7) + 1;
            //actualizar el array de ArrayList
            //en la posicion num(lo que valga num_jugadorA)x de la matrizA,
            //añadele el num que valga tiro
            matrizB[num_jugadorB].add(tiroB);
            //actualizar score;
            if (tiroB < 4){//acierto {1, 2 o 3}
              scoreB = scoreB + tiroB;
            //en la posicion num(lo que valga num_jugadorA)x del array anotadoresA,
            //sumale el tiro
              anotadoresB[num_jugadorB] = anotadoresB[num_jugadorB] + tiroB;
              num_aciertosB++;
            }
            num_tirosB--;
        }
        for (int i = 0; i < anotadoresB.length; i++)
            if (anotadoresB[i] > max_anotadorB)
                max_anotadorB = anotadoresB[i];               
        System.out.println("Maximo anotadorB: " + max_anotadorB);
        System.out.println("MarcadorB: " + scoreA);
        System.out.println("Número de aciertosB: " + num_aciertosB);
        //tasa de aciertos
        System.out.println("Tasa de aciertosB: " + (((double)num_aciertosB/auxB))*100);
        //tasa de fallos
        System.out.println("Tasa de fallosB: " +
        (((double)(auxB - num_aciertosB)/auxB))*100);
        ///////////////////////EQUIPO B//////////////////////////
       
    }
    
}
