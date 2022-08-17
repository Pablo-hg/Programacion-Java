/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class Utils {

    public static int leerIntConsola() {

        int entero = 0;

        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

        try {

            String stringLeido = consola.readLine();

            entero = Integer.parseInt(stringLeido);

            return entero;

        } catch (IOException ioe) {

            System.out.println("Error, introduce un entero válido.");

            return 0;

        }

    }

 
    public static String leerStringConsola() {
        
        String stringLeido = "";
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        try {

            stringLeido = consola.readLine();

        } catch (IOException ioe) {

            System.out.println("Error. Cadena inválida.");
        }
        return stringLeido;
    }
    
     public static char leerCharConsola() {

        char letra;

        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

        try {

            String stringLeido = consola.readLine();

            letra = stringLeido.charAt(0);

            return letra;

        } 
        
           catch (IOException ioe) {

            System.out.println("Error, introduce un caracter válido.");

            return 0;

        }
     }

}


