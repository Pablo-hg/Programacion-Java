package arrayabinario;

public class ArrayaBinario {

    public static void main(String[] args) {
   
        int[] numero = {1, 1, 1, 1};//representa el numerro 11 en binario
        int binario = 0;
        int i = numero.length -1;
        int multiplicador = 1;
        while ( i>=0){
            //1*1(1) + 1*2(2) + 0*4(0) + 1*8(8) == 11
            binario = binario + numero[i]*multiplicador;
            multiplicador = multiplicador * 2;
            i--;
        }
        System.out.println(binario);
    }
    
}

