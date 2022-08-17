package starwars;

import java.util.Arrays;

public class Terricola extends Guerrero{
    
    private static int totalTerricolas = 0;
    private static int[] disparosHechos = new int[Guerrero.MAX_BLANCO+1];
    
    Terricola(String soy){
        super(soy);//LLama al constructor de Guerrero
        totalTerricolas++;
        Arrays.fill(disparosHechos, 0);//Rellena disparosHechos con ceros
    }
    
    @Override
    public boolean recibeDisparo(int disparo){
        boolean seMuere = super.recibeDisparo(disparo);//llama al recibe disparo del padre(Guerrero)
        if (seMuere) {//diferencia con el sobre el recibeDisparo de Guerrero
        totalTerricolas--;
        }
    return seMuere;
    }
    
    @Override
    public int dispara(){
        int disparo = 0;
        if (vivo){
            do{
            disparo = (int) (Math.random() * (MAX_BLANCO+1));// generar un num entre 0 y MAX_BLANCO
            }
            while(disparosHechos[disparo] == Marciano.DISPAROS_QUE_AGUANTA);
            disparosHechos[disparo]++;
        return disparo;
        } 
        else {
            return MAX_BLANCO+1;//el Terrcicola muerto no puede disparar
        }
    }
    public static int getTotal() {
        return totalTerricolas;
    }
}
