package gaspariforme;
public class Gaspariforme {
    public static void main(String[] args) {
       /*Se dice que un array (a) es gaspariforme si todas sus sumas parciales
        son no negativas y su suma total es igual a cero. Se llama suma parcial a toda suma
        a[0] + · · · + a[i], con 0 <= i < a.length - 1.
        Escribir un programa que dado un array decida si a es o no gaspariforme */
                                
        int [] gaspariforme = {-32, 33, -1};
        int i = gaspariforme.length -1;
        int suma = 0;
        
        while (i < gaspariforme.length){
            if (gaspariforme.length -1 + gaspariforme.length -2 >= 0 )//cuando llegamos a que al -32 valga array.lenght -1, el programa entiende que el -2 es el valor contrario(32)
                suma = gaspariforme[i] + suma;
            if (gaspariforme[i] == gaspariforme[0])
                i =  i + gaspariforme.length+1;
            i--;
        }
        if (suma == 0)
            System.out.println("el array es gaspariforme");
        else
            System.out.println("el array no es gaspariforme");
    }
    
}
