
package diagonal;

public class Diagonal {
    
    public static void main(String[] args) {
     
        int [][] mat = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        //1   2   3
        //4   5   6
        //7   8   9
        int suma = 0;
        /*for (int i = 0; i < mat.length; i++)//recorrer las filas
            for (int j = 0; j < mat[i].length; j++)//recorrer las columnas
                if (i == j)
                    suma = suma + mat[i][j];*/
        for (int i = 0; i < mat.length; i++)
            suma = suma + mat[i][i];
        //1º vuelta --> suma es 1 porque es 0,0
        //2º vuelta --> suma vale 6 porque suma 1 + 5 ( 5 = 1,1)
        //3º vuelta --> suma vale 15 porque suma 6 + 9 (9 = 2,2)
        
        
        System.out.println(suma);
                    
        
    }
    
}