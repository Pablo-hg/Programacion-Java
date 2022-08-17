
package sumamatrices;
public class SumaMatrices {
    public static void main(String[] args) {
        
        int [][] matriz1 = {{6, 1, 0},{0, 1, 0},{0, 9, 1}};
        int [][] matriz2 = {{5, 6, 0},{0, 1, 0},{0, 5, 1}};
        int [][] matRes = new int [3][3];
        
        for(int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matRes [i][j]= matriz1[i][j] + matriz2[i][j];
                
            for(int i = 0; i < 3; i++){
                 for (int j = 0; j < 3; j++)
                     System.out.print(matRes[i][j]);
                     System.out.println("");
                     
        }
    }
}
               
                 