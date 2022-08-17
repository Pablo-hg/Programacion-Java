/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 *
 * @author fer
 */
public class InterfazTexto {
    //generar almacen
    
    public void Interfaz (){
        System.out.println("Introduzca una opción");
        System.out.println("1. - Asignar Cita");
        
        
        
        
        System.out.println("11. - Borrar un paciente");
        
        System.out.println("0 para salir");
        
        int opcion = Utils.leerIntConsola();
        boolean valido = false;
        switch (opcion){
            case 1:
            
            do{
                System.out.println("Introduzca el dni un paciente");
                String dni = Utils.leerStringConsola();
                int numdni = Integer.parseInt(dni.substring(0, dni.length() - 1));
        //el substring irá desde 0 hasta dni.length() - 2
                char cardni = dni.charAt(dni.length() - 1);
                DNI dniaux = new DNI(numdni, cardni);
                valido = dniaux.comprobarDNI(dniaux);
            while(!valido);
            
            //Paciente p =metodo getPaciente de almacen
                    
                System.out.println("Introduzca la Prueba"); 
            //generar objeto
            
            //utilizar método recorrerRecursos
        }
    }
    
}
