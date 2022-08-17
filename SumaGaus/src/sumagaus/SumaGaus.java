
package sumagaus;

public class SumaGaus {

    public static void main(String[] args) {
      //1+2+3+4+5+6+...+100 = 5050
      //1+100 = 101; 2+99=101; 3+98=101;
      //sumando todos los 101 = 5050
      int num = 1;
      int num2 = 100;
      int multi = 0;
      
       while ( num < num2){
           if(num + num2 == num + num2)
               multi++;
           num++;
           num2--;
       }
        System.out.println(multi * (num + num2));
    }
    
}
