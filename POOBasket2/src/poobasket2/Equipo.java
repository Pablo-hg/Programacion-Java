package poobasket2;

public class Equipo {
    
    private int num_jugadores;    
    private Jugador [] plantilla;
    /*public Equipo(Jugador[] plantilla) {
        this.num_jugadores = 12;
        this.plantilla = plantilla;
    } */
    public Equipo(int num_jugadores) {
        this.num_jugadores = num_jugadores;
        this.plantilla = new Jugador[num_jugadores];
        //for desde 0 hasta num_jugadores - 1
        //le pido 3 porcentajes por vuelta del bucle 
        
    }
    
    public int partido(){
        
        //Representa el partido en sí        
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
        int num_tiros1 = Aleatorio.intervalo(80, 120);
     
        System.out.println("Tiros lanzados: " + num_tiros1);
        int aux = num_tiros1;       
        int tipo_tiro = 0;        
        int num_jugador = 0;        
        int scoreA = 0;
        int acierto_fallo = 0;
        
        
        while (num_tiros1 > 0){//bucle equipo1
            //generar aleatorio [0-11]->número de jugador
            //num_jugador = (int)(Math.random()*12);
            num_jugador = Aleatorio.intervalo(0, num_jugadores - 1);            
            //una variable aleatoria determina el tipo de lanzamiento
            tipo_tiro = Aleatorio.intervalo (1, 3);
            //una variable aleatoria que se parametro del metodo tirar
            acierto_fallo = Aleatorio.intervalo(1, 100);    
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
           System.out.println("Tasa de aciertos " + (Aleatorio.div_dec(num_aciertos1, aux))*100);
           //y la tasa de fallos
           double fallos = 100 - (Aleatorio.div_dec(num_aciertos1, aux))*100;
           System.out.println("Tasa de fallos " + fallos);
           max_anotador1 = Aleatorio.max2(anotadores);
           int max_anotacion = Aleatorio.max(anotadores);
           System.out.println("El máximo anotador es el dorsal: " + 
           max_anotador1 + " con " + max_anotacion + " puntos anotados");
           
           return scoreA;
        
        
    
    }
    
    
    
    
}