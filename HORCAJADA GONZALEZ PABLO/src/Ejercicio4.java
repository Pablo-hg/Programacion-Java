
public class Ejercicio4 {

    
    public static void main(String[] args) {
       
        //APARTADO A//
        int num1 = 1;
        int num2 = 100;
        int suma1 = 0;
        while (num1 <= num2){
            if(num1 == 1)
                num1 = num1 + 4;
            if((num1)%5 ==0)
                suma1 = num1 + suma1;
            num1 = num1 + 5;
        }
       System.out.println(suma1); 
       //APARTADO A//
       
        //APARTADO B//
       int num3 = 5;
       int num4 = 100;
       int suma2 = (num3 + num4)*((num4 +5)/10);
        System.out.println(suma2);
        //APARTADO B//
       
    }
   
}