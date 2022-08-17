
package maxfila;

public class Maxfila {

    public static void main(String[] args) {
       
        int fila = 1;
        int max = 0;
        int [][] mat = {{1, 2, 3},{6, 5, 4},{8, 7, 9}};
        //fila 0 --> 1  2  3
        //fila 1 --> 6  5  4
        //fila 2 --> 8  7  9
        for (int i = 0; i < 3; i++)
            if(mat[fila][i] > max)
                max = mat[fila][i];
            System.out.println(max);
        
    }
    
}
