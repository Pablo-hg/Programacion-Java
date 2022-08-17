
package bucle1;


public class Bucle1 {

    
    public static void main(String[] args) {
        
        int x = 1;
        //x = x + 1 ; //a lo que hubiera en x, sumales 6 y asignaselo a x
        
        x++; //es lo mismo que x = x +1
        
        int y = 2;
        y--; //y = y -1
        
        int z = 3;
        z = z*z;//z = z*3
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        //int 1 = 0;expresion1
        //i <= 128;expresion 2;
        //i <= 128 es equivalente a 1 <129
        //i++ ;expresion3
        /*for(int i = 0;i <=4 ; i++){
        System.out.println(i);
        }
                
         i = x +7;La variable aqu noseria visible
        
                int i;
                for(( i = 0;i <=4 ; i++){
                System.out.println(i);
        }
                i = x +7;La variable aqui si seria visible*/
        
        int j = 0;
        j +=2;
        System.out.println(j);
        for (int i = 0;i <=128; i +=2)//es lo mismo que i = i + 2
            System.out.println(i);
        for (int i = 0;i <=128; i +=2)
            System.out.println(i + i);
        //esto si se puede declarar
            
        
        
        
        /*Imprimir todos los números ascii
        for (int i = 0;i <=128; i++){
        System.out.println((char)i);
        }*/
        
        

        
    }
    
}
