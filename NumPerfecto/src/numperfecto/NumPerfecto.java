
package numperfecto;

public class NumPerfecto {

    public static void main(String[] args) {
        //Numero perfecto = la suma de sus divisores da dicho numero
        int num = 496;
        int sumadivs = 0; 
        int divisores = 1;
        //bucle para determinar sus divisores e 
        // irlos acumulando mediante sumas en una variable
        /*
        while (divisores < num){
            if ((num % divisores) == 0)// i es divisor de num
                sumadivs = divisores + sumadivs;
            divisores++;
        }
        //compararemos sumdivs con dicho numero
         if (sumadivs == num)
        System.out.println("es perfecto");
        else
            System.out.println("no es perfecto");
         System.out.println(divisores -1);*/
        while (sumadivs < num){
            if ((num % divisores) == 0)// i es divisor de num
                sumadivs = divisores + sumadivs;
            divisores++;
        }
        //compararemos sumdivs con dicho numero
         if (sumadivs == num)
        System.out.println("es perfecto");
        else
            System.out.println("no es perfecto");
         System.out.println(divisores -1);
    }
    
}
