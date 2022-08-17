package animalario;
public class Animalario {
    public static void main(String[] args) {
        
        //no ponemos el new poque es un enumerado
        //asigamos a la variable sexo1 que es una hembra
        Sexo sexo1 = Sexo.HEMBRA;
        
        //asigamos a la variable sexo2 que es una macho
        Sexo sexo2 = Sexo.MACHO; 
        
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha(6, 3, 2020);
        
        //imprimimos las fechas para comprobar que las fecha se imprimen bien
        System.out.println(f1);
        System.out.println(f2);
        
        Raton r = new Raton("111", f2, 10, sexo2, 25, "anotaciones");
        System.out.println(r);
        
        //ejemplo para ver los atributos y para añadir un raton
        Poblacion p = new Poblacion ("pixie","dixie",10);
        p.añadirRaton(r);
        
    }
    
}
