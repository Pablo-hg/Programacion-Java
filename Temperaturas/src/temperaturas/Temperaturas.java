
package temperaturas;

public class Temperaturas {
    
    public static void main(String[] args) {
        
        int [] temperaturas = {4, -1, 5, 3, 7, 7, 6, 8};
        int num_picos = 0;
        int num_valles = 0;
        
        //Recorreindo el array se modifiquen
        //convenientemente num_picos y num_valles
        
        int i = 1;
         
        while (i < temperaturas.length -1){
            /*pico
            tempperaturas[i] actual
            temperaturas [i] - 1 anterior
            temperaturas [i] + 1 posteror*/
            if ((temperaturas[i] > temperaturas[i - 1])
                && (temperaturas[i] > temperaturas[i + 1]))
                num_picos++;
            //valle
            if ((temperaturas[i] < temperaturas[i - 1])
                && (temperaturas[i] < temperaturas[i + 1]))
                num_valles++;
            
            i++;
        }
        System.out.print("Picos ");
        System.out.println("Valles");
        System.out.print(num_picos + "     ");
        System.out.println(num_valles);
    }
    
}
