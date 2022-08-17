package melchiformme;
public class Melchiformme {
    public static void main(String[] args) {
        /*Un array de números enteros se dice que es melchoriforme si 
        alguno de sus elementos es un centro. Un elemento es un centro si su
        valor coincide con la suma de los restantes elementos del array.
        Realiza un programa que dado un array decida si es o no melchoriforme*/
        
        int [] melchiforme = {1, 2, 6, 9};
        int i = 0;
        int num_max = 0;
        int suma = 0;
        
        
        while (i < melchiforme.length){
            if( melchiforme[i] > num_max)
               num_max = melchiforme[i];
            suma = melchiforme[i] + suma;
        i++;
        }
        /*for( i = 0;i < melchiforme.length; i++){
            centro = melchiforme[i];
            suma = melchiforme[i] + suma;
        }*/
        if (suma - num_max == num_max)
            System.out.println("el Array es Melchiforme");
        else
            System.out.println("el Array no es Melchiforme");
            
        
        
    }
    
}
