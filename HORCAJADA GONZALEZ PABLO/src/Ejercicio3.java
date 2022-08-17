
public class Ejercicio3 {

    public static void main(String[] args) {
        
        int [] ejercicio3 = {111, 222, 333, 444, 555, 666, 777, 888, 999};
        int i = 0;
        int igual = 0;
        while (i < ejercicio3.length){
            int j = 0;
            int [] tresc = new int [3];
            while (ejercicio3[i] != 0){
                tresc[j] = ejercicio3[i]%10;
                ejercicio3[i] = ejercicio3[i]/10;
                j++;
            }
            if ((tresc[0]==tresc[1])&&(tresc[1]==tresc[2]))
            igual++;
            i++;
        }
        System.out.println(igual);
    }
}