
package maxmat;

public class MaxMat {

    public static void main(String[] args) {
      
        int max = 0;
        int [][] mat = {{1, 2, 3},{4, 5, 6},{7, 12, 9},{10, 11, 5}};
        int x = mat.length;
                                       //C1  C2  C3
                              //FILA1 -->1   2   3
                              //FILA2 -->4   5   6
                              //FILA3 -->7   12   9
                              //FILA3 -->10  11  5
                              
        
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                if (mat[i][j] > max)
                    max = mat[i][j];
            System.out.println(max);
        
    }
    
}
