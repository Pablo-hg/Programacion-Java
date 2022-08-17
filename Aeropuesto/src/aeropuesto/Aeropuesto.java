
package aeropuesto;
public class Aeropuesto {
    public static void main(String[] args) {
        
      //1. Crear una torre de control.
        Parking pk = new Parking("JFKParking");
        TorreControl tc = new TorreControl("JFK", "Parking");
        
        //2. Crear dos aviones veleros con distinta autonomía.
        Avion av1 = new AvionVelero(160.5, "AV1", 200);
        
        Avion av2 = new AvionVelero(190.2, "AV2", 250);
        
        //3. Crear dos aviones a motor con distinta cantidad de combustible y consumo.
        Avion am1 = new AvionMotor(300.7, 21.4, "AM1", 150);
                
        Avion am2 = new AvionMotor(200.9, 31.3, "AM2", 100);
        
        //4. Añadir los cuatro aviones a la torre de control
        tc.anadirAvion(av1);
        tc.anadirAvion(av2);
        tc.anadirAvion(am1);
        tc.anadirAvion(am2);
        
        //5. Intenta aterrizar cinco aviones. Imprimir si la operación ha tenido éxito.
        for (int i = 0; i < 5; i++){
        
            if (tc.aparcarSigAvion())
                System.out.println("EXITO");
            else
                System.out.println("FRACASO");
        
        }
        //6. Imprimir la información de los aviones aparcados.
        System.out.println(tc.listarAvionesParking());
        
    }
    
}   
    
    

