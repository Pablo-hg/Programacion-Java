
package empresa;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
       /*En una empresa todos los trabajadores tienen un sueldo base de 1000 euros. Los jefes tienen
        un suplemento de 500 por cada año que hayan sido jefes de la empresa, y los viajantes
        además del sueldo cobran 300 euros por viaje realizado. Crea las clases Empleado, Jefe y
        Viajante, utilizando herencia cunado estimes que es necesario.*/
        
        //Polimorfismo Array//
        Empleado [] plantilla = new Empleado[3];
        plantilla[0] = new Empleado("Juan");
        plantilla[1] = new Jefe ("Paco", 5);
        plantilla[2] = new Viajante("Pepe", 15);
        //Polimorfismo Array//
        double s = 0;
        /*double s = plantilla[0].sueldo();
        System.out.println(s);
        
        s = plantilla[1].sueldo();
        System.out.println(s);
        
        s = plantilla[2].sueldo();
        System.out.println(s);*/
        
        //Vinculacion dinámica//
        for (int i = 0;i < plantilla.length; i++){
            s = plantilla[i].sueldo();
            System.out.println(s);  
        }
        //Vinculacion dinámica//
        
        for (int i = 0;i < plantilla.length; i++){
            System.out.println(plantilla[i]);
        }
        
        /*String s1 = plantilla[0].toString();
        System.out.println(s1);//llama implicametne al metodo toString();
        s1 = plantilla[1].toString();
        System.out.println(s1);//llama implicametne al metodo toString();
        s1 = plantilla[2].toString();
        System.out.println(s1);//llama implicametne al metodo toString();*/
        
        
        //Polimorfismo ArrayList//
        ArrayList<Empleado> personal = new ArrayList<Empleado>();
        personal.add(new Empleado("Juan"));
        personal.add(new Jefe ("Paco", 5));
        personal.add(new Viajante("Pepe", 15));
        
        for ( int i = 0; i < personal.size(); i++){
            s = personal.get(i).sueldo();
            System.out.println(s);
        }
          for ( int i = 0; i < personal.size(); i++){
            String s1 = personal.get(i).toString();
              System.out.println(s1);
          }
        //Polimorfismo ArrayList//
        
    }
    
}