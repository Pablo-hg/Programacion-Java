package Basket;


public class Basket {
    
    static double div_dec (int a, int b){
        return ((double)a)/b;
    }
    
    static int intervalo (int a, int b){
        //esta función devolverá un número que esté entre a y b;
        //int num_tiros = (int)(Math.random()*41) + 80;//[80-120] = [0-40] + 80
        //int num_tiros = (int)(Math.random()*41)
        int mul = (int)(Math.random()*(b - a + 1));
        //+ 80;
        int r = mul + a;
        return r;
    }
    
    static int max (int [] v){//esta función nos devolvería la máxima anotación
        //devolver el máximo del array v
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < v.length; i++)
            if (v[i] > max)
                max = v[i];
        return max;
    }
    
    
     //esta función nos devolvería el máximo anotador
    static int max2 (int [] v){
        //devolver la posición en la que se encuentra
        //el máximo de v
        int max = Integer.MIN_VALUE;
        int pos_max = 0;
        for (int i = 0; i < v.length; i++)
            if (v[i] > max){
                max = v[i];
                pos_max = i;
            }
        return pos_max;
    }
    
    
    
    static int equipo (Jugador [] plantilla){
        //Representar el partido en sí
        //Declarar un arrai de 12 posiciones
        //compuesto por objetos de la clase Jugador
        
        //int [] enteros = new int [12];        
        int num_aciertos1 = 0;        
        int max_anotador1 = 0;
        int [] anotadores = new int [12];
        /*
        Calcular también la tasa de aciertos 
        y la tasa de fallos para imprimirlas
        */        
        int num_tiros1 = intervalo(80, 120);
        System.out.println("Tiros lanzados: " + num_tiros1);
        int aux = num_tiros1;       
        int tipo_tiro = 0;        
        int num_jugador = 0;        
        int scoreA = 0;
        int acierto_fallo = 0;
        //int scoreB = 0;        
        //int num_aciertos = 0;        
        //int max_anotador = 0;  
        //int [] anotadores = new int [15];
        
        while (num_tiros1 > 0){//bucle equipo1
            //generar aleatorio [0-11]->número de jugador
            //num_jugador = (int)(Math.random()*12);
            num_jugador = intervalo(0, 11);            
            //una variable aleatoria determina el tipo de lanzamiento
            tipo_tiro = intervalo (1, 3);
            //una variable aleatoria que se parametro del metodo tirar
            acierto_fallo = intervalo(1, 100);    
            //actualizar score;
            if ((tipo_tiro == 3) &&(plantilla[num_jugador].tirar3(acierto_fallo))){
                scoreA = scoreA + 3;
                num_aciertos1++;
                anotadores[num_jugador] = anotadores[num_jugador] + 3;
            }
            if ((tipo_tiro == 2) &&(plantilla[num_jugador].tirar2(acierto_fallo))){
                scoreA = scoreA + 2;
                num_aciertos1++;
                anotadores[num_jugador] = anotadores[num_jugador] + 2;
            }
            if ((tipo_tiro == 1) &&(plantilla[num_jugador].tirar1(acierto_fallo))){
                scoreA = scoreA + 1;
                num_aciertos1++;
                anotadores[num_jugador] = anotadores[num_jugador] + 1;
            }
             num_tiros1--;
            }
           //System.out.println("Marcador: " + scoreA);
           System.out.println("Aciertos " + num_aciertos1);
           //tasa de aciertos 
           System.out.println("Fallos " + (aux - num_aciertos1));
           System.out.println("Tasa de aciertos " + (div_dec(num_aciertos1, aux))*100);
           //y la tasa de fallos
           double fallos = 100 - (div_dec(num_aciertos1, aux))*100;
           System.out.println("Tasa de fallos " + fallos);
           max_anotador1 = max2(anotadores);
           int max_anotacion = max(anotadores);
           System.out.println("el max anotador es el dorsal " + max_anotador1 + " con " + max_anotacion
           + " puntos anotados");
           return scoreA;
        
    }
    
    
    public static void main(String[] args) {
        //Representa el partido en sí        
        //Declarar un arrai de 12 posiciones
        //compuesto por objetos de la clase Jugador        
        //int [] enteros = new int [12];        
        
        /*
        Calcular también la tasa de aciertos 
        y la tasa de fallos para imprimirlas
        */
        
        
        Jugador [] plantilla1 = new Jugador[12];
        
        plantilla1[0] = new Jugador(36,54,83);        
        plantilla1[1] = new Jugador(33,55,90);
        plantilla1[2] = new Jugador(21,63,60);
        plantilla1[3] = new Jugador(26,59,72);
        plantilla1[4] = new Jugador(43,44,76);
        plantilla1[5] = new Jugador(35,50,73);
        plantilla1[6] = new Jugador(24,53,86);
        plantilla1[7] = new Jugador(31,48,100);
        plantilla1[8] = new Jugador(38,47,75);
        plantilla1[9] = new Jugador(38,58,93);
        plantilla1[10] = new Jugador(47,37,77);
        plantilla1[11] = new Jugador(99,99,99);
        
        //llamada a función equipo: parámetro y return
        
        int scoreA = equipo(plantilla1);
        
        Jugador [] plantilla2 = new Jugador[12];
        
        plantilla2[0] = new Jugador(36,54,83);        
        plantilla2[1] = new Jugador(33,55,90);
        plantilla2[2] = new Jugador(21,63,60);
        plantilla2[3] = new Jugador(26,59,72);
        plantilla2[4] = new Jugador(43,44,76);
        plantilla2[5] = new Jugador(35,50,73);
        plantilla2[6] = new Jugador(24,53,86);
        plantilla2[7] = new Jugador(31,48,100);
        plantilla2[8] = new Jugador(38,47,75);
        plantilla2[9] = new Jugador(38,58,93);
        plantilla2[10] = new Jugador(47,37,77);
        plantilla2[11] = new Jugador(99,99,99);
        
        //int x = 0; 
        
        
          int scoreB = equipo(plantilla2);
          System.out.println("el resultado ha sido: " + scoreA + " - " + scoreB);
           
           
          /*int num_aciertos2 = 0;        
          int max_anotador2 = 0; 
          int num_tiros2 = intervalo(80, 120);
        
          System.out.println("Tiros lanzados: " + num_tiros2);
          aux = num_tiros2;       
          int tipo_tiro2 = 0;        
          int num_jugador2 = 0;        
          int scoreB = 0;
          int acierto_fallo2 = 0;       
          anotadores = new int [12];  
            //bucle equipo2
           
           while (num_tiros2 > 0){//bucle equipo1
            //generar aleatorio [0-11]->número de jugador
            //num_jugador = (int)(Math.random()*12);
            num_jugador2 = intervalo(0, 11);            
            //una variable aleatoria determina el tipo de lanzamiento
            tipo_tiro2 = intervalo (1, 3);
            //una variable aleatoria que se parametro del metodo tirar
            acierto_fallo2 = intervalo(1, 100);    
            //actualizar score;
            if ((tipo_tiro2 == 3) &&(plantilla2[num_jugador2].tirar3(acierto_fallo2))){
                scoreB = scoreB + 3;
                num_aciertos2++;
                anotadores[num_jugador2] = anotadores[num_jugador2] + 3;
            }
            if ((tipo_tiro2 == 2) &&(plantilla2[num_jugador2].tirar2(acierto_fallo2))){
                scoreB = scoreB + 2;
                num_aciertos2++;
                anotadores[num_jugador2] = anotadores[num_jugador2] + 2;
            }
            if ((tipo_tiro2 == 1) &&(plantilla2[num_jugador2].tirar1(acierto_fallo2))){
                scoreB = scoreB + 1;
                num_aciertos2++;
                anotadores[num_jugador2] = anotadores[num_jugador2] + 1;
            }
             num_tiros2--;
            }
           
           System.out.println("Aciertos " + num_aciertos2);
           //tasa de aciertos 
           System.out.println("Fallos " + (aux - num_aciertos2));
           System.out.println("Tasa de aciertos " + (div_dec(num_aciertos2, aux))*100);
           //y la tasa de fallos
           fallos = 100 - (div_dec(num_aciertos2, aux))*100;
           System.out.println("Tasa de fallos " + fallos);
           max_anotador2 = max2(anotadores);
           int max_anotacion2 = max(anotadores);
           
           int max_total = 0;
           
           int max_dorsal = 0;
           
           if (max_anotacion2 > max_anotacion){
               max_total = max_anotacion2;
               max_dorsal = max_anotador2;
           }    
           else{
               max_total = max_anotacion;
               max_dorsal = max_anotador1;
           }
           System.out.println("El máximo anotador del partido ha sido el dorsal: " 
                   + max_dorsal + " con " + max_total + " puntos");
            System.out.println("Marcador: " + scoreA + "-" + scoreB);*/
        }

    }