
   package poobasket2;

/**
 *
 * @author auladam1
 */
public class Jugador {
    
    private int porc1;
    
    private int porc2;
    
    private int porc3;

    public int getPorc1() {
        return porc1;
    }

    public int getPorc2() {
        return porc2;
    }

    public int getPorc3() {
        return porc3;
    }

    public void setPorc1(int porc1) {
        this.porc1 = porc1;
    }

    public void setPorc2(int porc2) {
        this.porc2 = porc2;
    }

    public void setPorc3(int porc3) {
        this.porc3 = porc3;
    }

    public Jugador(int porc3, int porc2, int porc1) {
        this.porc1 = porc1;
        this.porc2 = porc2;
        this.porc3 = porc3;
    }
    /*devolverán cierto si el parámetro num 
    es menor o igual porcentaje de tiro correspondiente
    del jugador, en otro caso se devuelve false.
    */
    public boolean tirar1(int num){
        //porcentaje de tiro de uno
        //boolean b = false
        if (num <= this.porc1)
            //b = true
            return true;
        //return b;
        else
            return false;
    }
    
     public boolean tirar2(int num){
        if (num <= this.porc2)
            return true;        
        else
            return false;
        
    }
     
      public boolean tirar3(int num){
          if (num <= this.porc3)
            return true;        
        else
            return false;
        
    }
    
}