
package codigodebarras;

public class CodigodeBarras {

    public static void main(String[] args) {
       int [] codb = {6,5,8,3,9,5,2};
       int suma = 0;
       int i = codb.length-1;
       int par = 0;
       int impar = 0;
       int j = 0;
       int db=0;
      
       
       while(j < codb.length){
          //par
           if (j %2 ==0)
               par = codb[i]*3 + par;
           //impar
           else
               impar = codb[i] + impar;
          i--;
          j++;
          suma = par + impar;
       }
       
       db = 10 -(suma%10);
        System.out.println(db);
    }
    
}
