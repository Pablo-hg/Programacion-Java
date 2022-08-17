
package mattras;
public class MatTras {
    
    public static void main(String[] args) {
   
        int [][] mat = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        
        int [][] matT = new int [3][3];
        //{{1, 4, 7},{2, 5, 8},{3, 6, 9}}
        //1   4   7
        //2   5   8
        //3   6   9
        for (int i = 0; i < mat.length; i++)//recorrer las filas
            for (int j = 0; j < mat[i].length; j++)//recorrer las columnas
                matT[i][j] = mat[j][i];
        
        for (int i = 0; i < matT.length; i++){//recorrer las filas
            for (int j = 0; j < matT[i].length; j++)//recorrer las columnas
                System.out.print(matT[i][j]);
                System.out.println("");
        }
        
        
        
    }
    
}