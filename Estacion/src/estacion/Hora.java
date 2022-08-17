package estacion;
public class Hora implements Comparable<Hora>{
    
    private int hora;
    private int minutos;
    private int segundos;

    //getters
    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
    //getters
    
    //setters
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    //setters

    //Constructor genereal
    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    //Constructor por defecto
    public Hora() {
    }
    
    public String toString(){
      //HH::MM:SS
        //h < 10 m < 10 s <10
        //añadir un 0 por la izquierda
        String cero = "0";
        String hora = "" + this.hora;
        String minutos = "" + this.minutos;
        String segundos = "" + this.segundos;
        if(this.hora <10)
            hora = cero + hora;
        if (this.minutos < 10)
            minutos = cero + minutos;
        if (this.segundos < 10)
            segundos = cero + segundos;
         return hora + ":" + minutos + ":" + segundos;
    }
    @Override
    public int compareTo(Hora o) {
        /* 
        Se compara this con el objeto que tenemos como parametro (o).
        Devuelve un negativo si this es menor que o.
        Devuelve 0 si es igual.
        Devueleve un positivio si es mayor que o.
        */
        if (this.hora < o.hora)
            return -1;
        else if (this.hora == o.hora){ 
            if (this.minutos < o.minutos)
                return -1;
            else if (this.minutos == o.minutos){
                if (this.segundos < o.segundos)
                    return -1;
                else if (this.segundos == o.segundos)
                    return 0;
                else//this.segundos > o.segundos
                    return 1;
            }
            else//this.hora > o.hora
                return 1;
        }
        else//this.hora > o.hora
            return 1;
    }
    
}
