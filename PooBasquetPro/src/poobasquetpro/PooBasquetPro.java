
package poobasquetpro;

public class PooBasquetPro {
    
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
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        JugadorPro jp1 = new JugadorPro(33, 56, 79,"Juan", 10, 60, 65);
        
        JugadorPro jp2 = new JugadorPro(33, 56, 78, "Juan", 10, 60, 65);
        
        JugadorPro jp3 = new JugadorPro(33, 56, 78, "Juan", 10, 60, 65);
        
        //jp2.tirar2(jp3, 54);//jp2 es defendido por jp3
        /*String s1 = "hola";
        
        String s2 = "hola";
        
        s1.equals(s2);*/
        
        if (jp2.equals(jp3))
            System.out.println("Los jugadores tienen la misma calidad");
        else
            System.out.println("Los jugadores no tienen la misma calidad");
        String s1 = "hola";
        
        String s2 = "hola";
        
        //if(s1 == s2) tipos primitivas
        if (s1.equals(s2))
            System.out.println("Son iguales");
        
        JugadorPro [] plantilla1 = new JugadorPro [11];
		
		plantilla1[0] = new JugadorPro(36,54,83, "Juan",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla1[1] = new JugadorPro (33, 55, 90, "Pedro",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla1[2] = new JugadorPro (21, 63, 60,"Paco",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla1[3] = new JugadorPro (26, 59, 72, "Jesús",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla1[4] = new JugadorPro (43, 44, 76, "Javier",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla1[5] = new JugadorPro (35, 50, 73,"Antonio",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla1[6] = new JugadorPro (24, 53, 86,"Carlos",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla1[7] = new JugadorPro (31, 48, 100,"Miguel",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla1[8] = new JugadorPro (38, 47, 75,"Marcos",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla1[9] = new JugadorPro (38, 58, 93, "Santiago",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla1[10] = new JugadorPro (47, 37, 77, "Lucas",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		JugadorPro [] plantilla2 = new JugadorPro [11];
		
		plantilla2[0] = new JugadorPro(36,	54,	83, "Juan",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla2[1] = new JugadorPro (33, 55, 90, "Pedro",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla2[2] = new JugadorPro (21, 63, 60,"Paco",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla2[3] = new JugadorPro (26, 59, 72, "Jesús",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla2[4] = new JugadorPro (43, 44, 76, "Javier",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla2[5] = new JugadorPro (35, 50, 73,"Antonio",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla2[6] = new JugadorPro (24, 53, 86,"Carlos",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla2[7] = new JugadorPro (31, 48, 100,"Miguel",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla2[8] = new JugadorPro (38, 47, 75,"Marcos",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla2[9] = new JugadorPro (38, 58, 93, "Santiago",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
		
		plantilla2[10] = new JugadorPro (47, 37, 77, "Lucas",intervalo (1 , 100), intervalo (1 , 100), intervalo (1 , 100));
        
        int num_tiros = intervalo (160, 240);
        //número de tiros para los dos equipos
        int turno = intervalo(1, 2);        
        int tipo_tiro = 0; //1, 2 o 3 puntos        
        int num_jugador = 0;//dorsal del jugador que lanza        
        int acierto_fallo = 0;
        //número de puntos anotados por cada equipo
        int score1 = 0;        
        int score2 = 0;        
        int i = 0;        
        while (i < num_tiros){
            num_jugador = intervalo(0, 10);
            tipo_tiro = intervalo(1, 3);
            acierto_fallo = intervalo (1, 100);
            if (turno == 1){
                //posesión de plantilla1
                if ((tipo_tiro == 3) && 
        (plantilla1[num_jugador].tirar3(plantilla2[num_jugador], acierto_fallo)))
                    score1 = score1 + 3;
                if ((tipo_tiro == 2) && 
        (plantilla1[num_jugador].tirar2(plantilla2[num_jugador], acierto_fallo)))
                    score1 = score1 + 2;
                if ((tipo_tiro == 1) && 
        (plantilla1[num_jugador].tirar1(acierto_fallo)))
                    score1 = score1 + 1;            
                
            }
            
            else {//turno == 2 
                //posesión de plantilla2
                if ((tipo_tiro == 3) && 
        (plantilla2[num_jugador].tirar3(plantilla1[num_jugador], acierto_fallo)))
                    score2 = score2 + 3;
                if ((tipo_tiro == 2) && 
        (plantilla2[num_jugador].tirar2(plantilla1[num_jugador], acierto_fallo)))
                    score2 = score2 + 2;
                if ((tipo_tiro == 1) && 
        (plantilla2[num_jugador].tirar1(acierto_fallo)))
                    score2 = score2 + 1;
                
            }
            
            i++;
            turno = intervalo(1, 2);
             
        }//cierra el while
        
        System.out.println(score1 + " - " + score2);
        
        System.out.println(JugadorPro.num_jug);
        
        
        
        
        
    }
    
}