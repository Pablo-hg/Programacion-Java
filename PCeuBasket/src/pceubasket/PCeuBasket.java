
package pceubasket;

public class PCeuBasket {
    public static void main(String[] args) {
        
        
        int [][] matriz_resultadoA = new int [15][8];
        int [][] matriz_resultadoB = new int [15][8];
        
        int num_tirosA = 0;
        int num_jugadorA = 0;
        int tiro_cfA = 0;
        int scoreA = 0;
        int num_aciertoA = 0;
        int max_anotadorA = 0;
        
        int num_tirosB = 0;
        int num_jugadorB = 0;
        int tiro_cfB = 0;
        int scoreB = 0;
        int num_aciertoB = 0;
        int max_anotadorB = 0;
        
        /////////////EQUIPO A/////////////////////////////////////////
         // numeros entre el 80 y el 120
        num_tirosA = (int)(Math.random()*41) + 80; 
        int auxA = num_tirosA;
        System.out.println("tiros lanzados EquipoA:" + num_tirosA);
        
        while(num_tirosA > 0){
            //generar aleatorio [0-14] para nº jugador
            num_jugadorA = (int)(Math.random()*15);
            //generar aleatorio [1-7] para el tiro
            tiro_cfA = (int)(Math.random()*6)+1;
            //actualizar matriz
            matriz_resultadoA[num_jugadorA][tiro_cfA]++;
            //actualizar score
            if (tiro_cfA < 4){//acierto {1, 2 o 3}
                scoreA = scoreA + tiro_cfA;
                matriz_resultadoA[num_jugadorA][0] = matriz_resultadoA[num_jugadorA][0] + tiro_cfA;
                num_aciertoA++;
            }
            num_tirosA--;
        }
        for (int i = 0; i < matriz_resultadoA.length;i++){
            for(int j = 0; j < matriz_resultadoA[i].length; j++)
                System.out.print(matriz_resultadoA[i][j]);
            System.out.println();
        }
        for (int i = 0; i < matriz_resultadoA.length;i++)
            if(max_anotadorA < matriz_resultadoA[i][0])
                max_anotadorA = matriz_resultadoA[i][0];
        
        System.out.println("Score equipoA :" + scoreA);
        System.out.println("Max anotador equipoA :" + max_anotadorA);
        System.out.println("Numero de aciertos :" + num_aciertoA);
        
        //Tasa de aciertos A
        System.out.println("Tasa de aciertos: " + (((double)num_aciertoA/auxA)*100));
        //Tasa de fallos A
        System.out.println("Tasa de fallos: " + ((double)(auxA - num_aciertoA)/auxA)*100);
        /////////////EQUIPO A/////////////////////////////////////
        
        
        
        
        System.out.println("");
        System.out.println("");
       
        
        
        
        
        /////////////EQUIPO B//////////////////////////////////////
        // numeros entre el 80 y el 120
        num_tirosB = (int)(Math.random()*41) + 80; 
        int auxB = num_tirosB;
        System.out.println("tiros lanzados EquipoB:" + num_tirosB);
       
        
        while(num_tirosB > 0){
            //generar aleatorio [0-14] para nº jugador
            num_jugadorB = (int)(Math.random()*15);
            //generar aleatorio [1-7] para el tiro
            tiro_cfB = (int)(Math.random()*6)+1;
            //actualizar matriz
            matriz_resultadoB[num_jugadorB][tiro_cfB]++;
            //actualizar score
            if (tiro_cfB < 4){//acierto {1, 2 o 3}
                scoreB = scoreB + tiro_cfB;
                matriz_resultadoB[num_jugadorB][0] = matriz_resultadoB[num_jugadorB][0] + tiro_cfB;
                num_aciertoB++;
            }
            num_tirosB--;
        }
        for (int i = 0; i < matriz_resultadoB.length;i++){
            for(int j = 0; j < matriz_resultadoB[i].length; j++)
                System.out.print(matriz_resultadoB[i][j]);
            System.out.println();
        }
        for (int i = 0; i < matriz_resultadoB.length;i++)
            if(max_anotadorB < matriz_resultadoB[i][0])
                max_anotadorB = matriz_resultadoB[i][0];
        
        System.out.println("Score equipoB :" + scoreB);
        System.out.println("Max anotador equipoB :" + max_anotadorB);
        System.out.println("Numero de aciertos :" + num_aciertoB);
        
        //Tasa de aciertos B
        System.out.println("Tasa de aciertos: " + (((double)num_aciertoB/auxB)*100));
        //Tasa de fallos B
        System.out.println("Tasa de fallos: " + ((double)(auxB - num_aciertoB)/auxB)*100);
        /////////////EQUIPO B/////////////////////////////////////////
        
        
       System.out.println("");
       System.out.println("Marcador Global " +scoreA+"-"+scoreB);
       
       
        
       
       
    }
    
}
