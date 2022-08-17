
package condicional1;

public class Condicional1 {

    
    public static void main(String[] args) {
        int num = 2100;
        
        //if (si es bisiesto) //año bileano con if y else
            //imprima el numero si e sbisiesto
        //else
            //imprima  el numero si no es bisiesto
        if (((num % 4) == 0) && (((num % 100) !=0) || ((num % 400) ==0))){
            System.out.println("el año" + num + " es bisiesto");
        }
        else
            System.out.println("el año" + num + "no es bisiesto");
        
        
        
        /* año binario pero con booleanos
        boolean p = ((num % 4) == 0); //2020 es multiplo de 4 y no el resto es 0
        
        boolean q = ((num % 100) !=0); //2020 entre 100 no es exacto
        
        boolean r = ((num % 400) ==0); 
        
        boolean bis = (p && q) || r; //si la p q y r se cunple pues...
        
        System.out.println(p);
        
        System.out.println(q);
        
        System.out.println(r);
        
        System.out.println(bis);
        **/
        
        
        
    }
}
    

