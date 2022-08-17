
package genericos;

public class Guerrero extends SerVivo{
    
    protected int blancoAAdivinar;
    protected final String soy;
    public static final int MAX_BLANCO = 10;
    
    public Guerrero(String soy) {
    blancoAAdivinar = generaBlancoAAdivinar();
    this.soy = soy;
    }
    
    public int dispara() {
        //if (super.isVivo()) {
        if (vivo){
        int disparo = ((int) (Math.random() * (MAX_BLANCO+1)));
        System.out.println(soy + " dispara n " + disparo);
        return disparo;
        } 
        else {
            return Integer.MIN_VALUE;
        }
    }
    
    public boolean recibeDisparo(int disparo) {
        // Función a programar
        boolean seMuere = false;
        
        if (vivo && (disparo == this.blancoAAdivinar)){
            vivo = false;
            seMuere = true;
            System.out.println(soy + " muerto por n " + disparo);
        }
        return seMuere;        
    }
    
    public int getBlancoAAdivinar() {
        return blancoAAdivinar;
    }
    
    private int generaBlancoAAdivinar() {
        return ((int) (Math.random() * (MAX_BLANCO+1)));
    }
    
    
}
