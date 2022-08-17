package poobasket2;

/**
 *
 * @author auladam1
 */
public class Aleatorio {
    
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
    
}