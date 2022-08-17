
package arrays1;

public class Arrays1 {

    
    public static void main(String[] args) {
        
        int [] edades = new int[10];
        
        edades[0] = 19;
        edades[1] = 18;
        edades[2] = 18;
        edades[3] = 17;
        edades[4] = 20;
        edades[5] = 18;
        edades[6] = 19;
        edades[7] = 20;
        edades[8] = 21;
        edades[9] = 17;
        
        int longitud = edades.length;
        int i = 0;// el indice comienza en 0
        double x = 0;
        while (i < edades.length){
            x = x + edades[i];
            i++;
        }
        
        System.out.println(x/edades.length);
        
    }
    
}
