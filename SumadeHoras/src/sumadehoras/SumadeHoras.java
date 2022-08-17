
package sumadehoras;
public class SumadeHoras {
    
    public static void main(String[] args) {
        //10:56:54
        //22:08:47
        //09:05:41  
        int seg1=54;
        int min1=56;
        int hor1=10;
        
        int seg2=47;
        int min2=8;
        int hor2=22;
        
        int sumas = (seg1 + seg2)%60;
        int sumam = (min1 + min2 + ((seg1 + seg2)/60))%60;
        int sumah = (hor1 + hor2+ ((min1 + min2)/60))%24;
        
        System.out.println("la suma de las horas es " + sumah + ":" + sumam + ":" + sumas);
    }
    
}
