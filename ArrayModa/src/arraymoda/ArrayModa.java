package arraymoda;


public class ArrayModa {

    public static void main(String[] args) {
        
        int [] edades = new int[10];
        
        edades[0] = 19;
        edades[1] = 18;
        edades[2] = 18;
        edades[3] = 17;
        edades[4] = 20;
        edades[5] = 18;
        edades[6] = 19;
        edades[7] = 20;
        edades[8] = 21;
        edades[9] = 17;
        
        int longitud = edades.length;
        int i = 0;
        int p = 19;
        int d = 18;
        int j = 17;
        int h = 20;
        int m = 21;
        int x = 0;
        int q = 0;
        int s = 0;
        int z = 0;
        int r = 0;
        
        while (i < edades.length){
            if(edades[i] == p){
            x++;}
            else if(edades[i] == d)
            q++;
            else if(edades[i] == j)
            s++;
            else if(edades[i] == h)
            z++;
            else if(edades[i] == m)
            r++;
            
            i++;   
        }
         System.out.println(x);
         System.out.println(q);
         System.out.println(s);
         System.out.println(z);
         System.out.println(r);
         
    }
    
}
