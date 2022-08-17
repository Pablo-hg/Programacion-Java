
package encontrar;

public class Encontrar {

    public static void main(String[] args) {
        int num = 3;
        int [] valores = {1, 2, 3, 4, 7};
        /*///////BOLEANO//////
        //boolean encontrado = false; //--> hay almenos un i para el que valores[i] = num
        //encontrado=flase --> no existe un i para el que valorees[i] = num
        //encontrado=flase --> Para todo i valores[i]!=num
        //encontrado será true si num pertenec al array
        //será false si no pertenece al array
        /*
        int i = 0;
        while ( i < valores.length){
            if (valores[i] == num)
                encontrado = true;
            i++;
        }
        System.out.println(encontrado);*/
        
        //que si encuentra el num , no se repita la secuencia
        /*int i = 0;
        
            if (valores[i] == num)
                encontrado = true;
            i++;
        }
        System.out.println(encontrado);*/
                
        
        /////SIN BOOLEANO////
        int i = 0;
        while (( i < valores.length)&&(valores[i] != num))
        i++;
        if (i == valores.length)
                System.out.println("false");
        else//valores[i] == num
                System.out.println("true");
        
        
        
        
    }
    
}
