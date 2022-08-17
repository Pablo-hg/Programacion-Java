
package medianaparyimpar;
public class MedianaParyImpar {
    public static void main(String[] args) {
        
        int [] arrai1 ={ 4, 2, 32, 74};
        //int [] arrai2 ={ 4, 1, 32, 74, };
        double mediana = 0;
        //es impar
        if((arrai1.length %2) == 1){
            mediana = arrai1[arrai1.length /2];
        System.out.println(mediana);
        }
        //es par
        else {
        mediana = (arrai1[arrai1.length/2] + arrai1[arrai1.length/2 - 1])/2;
        //posiciones : 0,1,2,3 --> 3/2 = 1.5 ; 1.5 = posicion2 = 32; posicion2(32)-1 = posicion1(2)
            System.out.println(mediana);
        }
    }
    
}
