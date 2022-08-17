package estacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Estacion {
    
    public static void main(String[] args) {
        
    Hora h1 = new Hora(11, 15, 0);
    System.out.println(h1);
    
    Hora h2 = new Hora(10, 30, 0);
    System.out.println(h2);
        
    if (h1.compareTo(h2) < 0)
        System.out.println("h1 es menor que h2");
    else if (h1.compareTo(h2) == 0)
        System.out.println("h1 es igual que h2");
    else//(h1.compareTo(h2) > 0)
        System.out.println("h1 es mayor que h2");
    
    //Declarar un ArrayList y añadir horas
    //Ordenar el Array utilizando la clase Collections
    
    List<Hora> horarios = new ArrayList();//new ArrayList<Hora>();
    horarios.add(h1);
    horarios.add(h2);
    horarios.add(new Hora (16, 15, 0));
    horarios.add(new Hora (13, 45, 0));
    
    //collections.sort(horarios)
    Comparador c = new Comparador();
    Collections.sort(horarios, c);//ordena la lista horarios de menor a mayor gracias al compareTo
    
    System.out.println(horarios);
    
    for(int i = 0; i < horarios.size(); i++)
            System.out.println(horarios.get(i));
    
    Hora hora_llegada = new Hora(16, 15, 0);
    /*obtener horario del proximo tren o esperar al dia siguiente
    Realizar una busqueda en el ArrayList
    Con dos condiciones de vuelta
    (reccorerlo entero o encontrar una hora mayor que mi hora de llegada)
    */
    int j = 0;
        System.out.println("He llegado a  las " + hora_llegada);
    while ((j < horarios.size())&&((hora_llegada.compareTo(horarios.get(j))) > 0 ))
            j++;
    if (j == horarios.size())
        System.out.println("Tiene que esperar a mañana");
    else //j < horarios.size() --> hay un ahora en hrarios mayor que la de la llegada
        System.out.println(horarios.get(j) + " es el proximo tren");
        
    } 
     
}
