package poobasket2;

import java.util.Scanner;

public class POOBasket2 {

    public static void main(String[] args) {
       
        //Aleatorio.intervalo(a, b);
        
        
        System.out.println("Introduce los jugadores del EquipoA");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Introduce los jugadores del EquipoB");
        int j = sc.nextInt();
        Equipo eq1 = new Equipo(i);        
        Equipo eq2 = new Equipo (j);
        
        int scoreA = eq1.partido();
        
        int scoreB = eq2.partido();
        
        System.out.println("El resultado ha sido: " + scoreA + " - " + scoreB);
        
        
    }
    
}