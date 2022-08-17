
package prodescalar;

public class ProdEscalar {

    
    public static void main(String[] args) {
       int [] v1 = {1, 2, 3};
       int [] v2 = {2, 3, 4};
       //res = 1*2 + 2*3 + 3*4
       //res = V1[0]*V2[0] + V1[1]*V2[1] + V1[2]*V2[2] 
       //res representa el producto escalar
       int i = 0;
       int res = 0;
       int mult = 0;
       /////WHILE/////
       /*while(i < v1.length){// 1 < v2.lengt
           mult = v1[i]* v2[i];
           res = res + mult;
           i++;
       }*/
       ///FOR/////
       for ( i = 0; i < v2.length; i++){
           mult = v1[i]* v2[i];
           res = res + mult;
        }
        System.out.println(res);
    }
    
}
