package maxcol;
public class MaxCol {
    public static void main(String[] args) {
       
        int columna = 1 ;
        int max = 0;
        int [][] mat = {{1, 5, 8},{2, 4, 7},{3, 6, 9}};
                   //c0  c1  c2
                   //1   5   8
                   //2   4   7
                   //3   6   9
        
         for (int i = 0; i < 3; i++)
            if(mat[i][columna] > max)
                max = mat[i][columna];
            System.out.println(max);
        
    }
    
}

   