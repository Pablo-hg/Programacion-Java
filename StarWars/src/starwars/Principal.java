package starwars;
public class Principal {
    
    private Nave naveTerricolas, naveMarcianos;
    private int numeroDeTerricolas, numeroDeMarcianos;
    //constructor
    public Principal(int numeroDeTerricolas, int numeroDeMarcianos) {
        
        this.numeroDeMarcianos = numeroDeMarcianos;
        this.numeroDeTerricolas = numeroDeTerricolas;
        this.naveMarcianos = new Nave("Marciano", numeroDeMarcianos);
        this.naveTerricolas = new Nave("Terricola", numeroDeTerricolas);
    }
    
    public void empiezaGuerra() {
    do {
        //bucle en el que un bando dispara al otro y viceversa
        //metodos --> recibeDisparo y generaDisparo de nave de la clase nave
        for (int i = 0; i < Math.max(this.numeroDeMarcianos, this.numeroDeTerricolas)
                && quedanVivosEnAmbasNaves();i++){
            if (i < this.numeroDeTerricolas)
            naveMarcianos.recibeDisparo(naveTerricolas.generaDisparo(i));
            if (i < this.numeroDeMarcianos)
            naveTerricolas.recibeDisparo(naveMarcianos.generaDisparo(i));
        } 
    } while (quedanVivosEnAmbasNaves());
        if (naveTerricolas.cuantosQuedan() > 0) {
        System.out.println("GANARON LOS TERRICOLAS!!!!!");
        } else if (naveMarcianos.cuantosQuedan() > 0) {
    System.out.println("GANARON LOS MARCIANOS");
        }
    }
    private boolean quedanVivosEnAmbasNaves() {
        return  ((this.naveMarcianos.cuantosQuedan() > 0) && 
        (this.naveTerricolas.cuantosQuedan() > 0));
            
    }
    
    //el main es lo 1º que se ejecuta del programa
    public static void main(String[] args) {
            Principal p = new Principal(20, 10);
            p.empiezaGuerra();      
    }
    
}
