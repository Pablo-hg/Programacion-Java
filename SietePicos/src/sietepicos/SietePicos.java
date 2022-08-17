package sietepicos;


public class SietePicos {
    public static void main(String[] args) {
                     
        int alturas = 0;
        int pico = 0;
        int i = 0;
        int num_picos = 0;
        //aleatorio entre 2 y 30 parta saber las alturas que tiene
        alturas = (int)(Math.random()*29)+2 ;
        int []  montañaR = new int[alturas];
        while(i < alturas){
            //averigua la distancia de todqas las montañas
            //aleatorio entre 0 y 100  para saber la distancia de las alturas
            montañaR[i] = ((int)(Math.random()*99));
            i++;
        }
        //calcula los picos
         for (i = 1; i < montañaR.length - 1; i++){
            if (montañaR[i] > montañaR[i]+1 && montañaR[i] > montañaR[i]-1)
                num_picos++;
            //inicio de la montaña rusa
            if ((montañaR[0] > montañaR[montañaR.length - 1]) && (montañaR[0] > montañaR[1]))
	    	num_picos++;
            //final dela monataña rusa
            if ((montañaR[0] < montañaR[montañaR.length - 1]) && (montañaR[montañaR.length - 1] > montañaR[montañaR.length - 2]))
	    	num_picos++;
            
          }
        System.out.println(num_picos);
        
    }
    
}
