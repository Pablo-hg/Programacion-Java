
package capicua;

public class CAPICUA {

    public static void main(String[] args) {
       int[] numero = {1, 0, 0, 0, 1};
        boolean capicua = true;
        //charArt(String) --> []
        //lenght() --> lenght
        //bucle determinar si ese array es un numero capicua o no
        
        int a = 0;
        int b = 0;
        int i = 0;
        int j = numero.length -1;
        
        //capicua --> numero[i] == numero[j]
        /*while((i < j) && (capicua == true)){
        
            a = numero[i];
            b = numero[j];
            if (a != b)
                capicua = false;
            j--;
            i++;
        }
        if (capicua == true)
            System.out.println("es capicua");
        else
            System.out.println("no es capicua");*/
        while((i < j) && (numero[i] == numero[j])){
            j--;
            i++;
        }
        if (i < j)
            System.out.println("no es capicua");
        else// i >= j
            System.out.println(" es capicua");
    }
    
}
