package starwars;
public class Nave{
    private Guerrero[] tripulacion;//polimorfismo 
    private String somos;
    
    public Nave(String somos, int tripulantes){
        //asignarle al atributo somos el patametros somos
        this.somos = somos;
        //reservar tanta memoria para la tripulacion como nos diga 
        //el entero tripulantes
        
        this.tripulacion = new Guerrero[tripulantes];
        if (this.somos.equals("Marciano")){
            for (int i = 0; i < tripulacion.length;i++)
                tripulacion[i] = new Marciano(somos);//Constructor
        } else{//Terricolas
            for (int i = 0; i < tripulacion.length;i++)
                tripulacion[i] = new Terricola(somos);//Constructor
            }
        System.out.println("Creada nave de " + somos + " con "
            + cuantosQuedan() + " tripulantes");
        }

    public void recibeDisparo(int disparo) {
        for(int i = 0; i < tripulacion.length; i++)
        tripulacion[i].recibeDisparo(disparo);
        //vinculacion dinámica o ligadura dinámica
    }
    
    public int generaDisparo(int tripulantes) {
        return tripulacion[tripulantes].dispara();
        //vinculacion dinamica o ligadura dinámica
    }
    
    public int cuantosQuedan(){
    //no puede acceder a los hijos de Guerrero, por lo que se ponen a copon
        if (this.somos.equals("Marciano"))
            return Marciano.getTotal();
        else//Terricolas
            return Terricola.getTotal();
    }
}
