
package abadias;

public class Abadias {

  
    public static void main(String[] args) {
        
        int [] Pirineos = {4000, 3500, 3500 ,3200};
        int num_abadias = 0; 
        int i = Pirineos.length -1;
        int maximo = 0;
        while (i >= 0){
            if(maximo < Pirineos[i]){
               maximo = Pirineos[i];
               num_abadias++;
            }
            i--;
        }
        System.out.println(num_abadias);
    }
    
}
