package starwars;
public class Marciano extends Guerrero{
    
    private static int totalMarcianosVivos = 0;
    private int disparosRecibidos = 0;
    public static final int DISPAROS_QUE_AGUANTA = 3;
 
    public Marciano(String soy) {
        super(soy);//llamamos al constructor del Guerrero
    totalMarcianosVivos++;
    }
    
    @Override
    public boolean recibeDisparo(int disparo) {
        boolean seMuere = false;
        if (vivo && (disparo == blancoAAdivinar)){
            disparosRecibidos++;
            if (this.disparosRecibidos == DISPAROS_QUE_AGUANTA){
                totalMarcianosVivos--;
                this.vivo=false;
                System.out.println(soy + " muerto por disparo nº " + disparo);
                seMuere=true;
            }
        }
        return seMuere;
    }
    
    public static int getTotal() {
        return totalMarcianosVivos;
    }
    
}
