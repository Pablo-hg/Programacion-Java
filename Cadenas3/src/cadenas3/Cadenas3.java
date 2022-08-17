
package cadenas3;

public class Cadenas3 {

  
    public static void main(String[] args) {
        
        String cad1 = "adios";
        String cad2 = "hola";
        
        if(cad1.equals(cad2))//es igual que el == pero paa tipos no primitivos
            System.out.println("las cadenas son iguales");
        else
            System.out.println("las cadenas son diferentes");
        
        //Imprimir si tiene la misma longitud o son diferentes:
        String cade1 = "pepe";
        String cade2 = "pepos";
        
        if (cade1.length() == cade2.length())
            System.out.println("Tienen la misma longitud");
        else
            System.out.println("No tienen la misma longitud");
         
        
        
                  
                
    }
    
}
