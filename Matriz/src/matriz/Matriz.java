
package matriz;

public class Matriz {

    public static void main(String[] args) {
     //ARRAY UNIDIMENSIONALES
        //int [] nombrearray = [4];
        //int [] nombrearray = [1,2,3,4];
        
        //ARRAY BIDIMENSIONAL
        int [][] matriz1 = new int [3][3]; // 3 filas y 3 columnas
        int [][] matriz2 = {{1, 0, 0},{0, 1, 0},{0, 0, 1}}; // 3 filas y 3 columnas
                                      //C1 C2 C3
                             //FILA1 -->1  0  0
                             //FILA2 -->0  1  0
                             //FILA3 -->0  0  1
        int x = 7;
      
        for(int i = 0; i < 3; i++){ // recorrer las filas
            for (int j = 0; j < 3; j++)//recorrer las columnas
                System.out.print(matriz2[i][j]);
                System.out.println("");
        }
    }
    
}
