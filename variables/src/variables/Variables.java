
package variables;

public class Variables {

    public static void main(String[] args) {
        //double<float<long<int<short<byte
        
        int x; //admite valores entre -263 a 263-1
        
        x = 3;
        
        System.out.println(x);
        
        //x = (int) 3.7; //aunque tambien puede fijarse solo en la parte entera
        
        //System.out.println(x);
        
        float y = 2; //admite vlores decimales
        //daria igual usar en este caso float que double para usar el decimal
        
        System.out.println(y);
        
        double z= x/y; //admite hacer calculos(+,-,/,*,..)
        
        int resto = (int) (x % y); // el % nos da el resto de una division
        
        System.out.println(z);
        
        System.out.println("resto");
        
        System.out.println(resto);
        
        double a = 3./2; //igual que antes con la varibale pero con numeros
                
        System.out.println(a);
        
        
    }
    
}
