
package poobasquetpro;

public class JugadorPro extends Jugador{
    //tiene estos atributosy los que hereda de la clase Jugador
    static int num_jug = 0;
    
    private String nombre;
    
    private int dorsal;
    
    private int defensa;
    
    private int ataque;
    
    public JugadorPro(int porc3, int porc2, int porc1) {
        super(porc3, porc2, porc1);//constructor del padre (Jugador)
    }
    
    public JugadorPro(int porc3, int porc2, int porc1, String nombre, int dorsal,
    int ataque, int defensa){
        super(porc3, porc2, porc1);
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.ataque = ataque;
        this.defensa = defensa;
        JugadorPro.num_jug++;
    }
    
    public boolean tirar2(JugadorPro jp,int num){
        //calidad en ataque de this vs calidad en defensa de jp
        if (this.ataque >= jp.defensa)
            return super.tirar2(num);
            //llamamos a tirar2 de la clase Jugador
        
            //tengo en cuenta solo num
            /*if (num <= this.getPorc2())
                return true;
            else
                return false;*/
            
        else//this.ataque < jp.defensa
            return super.tirar2(num + 10);
            /*if (num + 10 <= this.getPorc2())
                return true;
            else
                return false;*/
            
            //tener en cuenta num + 10
    }
    
    public boolean tirar3 (JugadorPro jp,int num){
        if (this.ataque >= jp.defensa)
            return this.tirar3(num);
        else
            return this.tirar3(num + 10);
    }
    
    /*public boolean tirar1 (int num){
        return super.tirar1(num);
      
    }*/
    
    @Override
    public boolean equals(Object anObject){
    //recibiremos un JugadorPro como parámetro
    //Recordad s1.equals(s2) de Strings
    /*un jugador se computa como la suma de    
      su ataque, su defensa y sus porcentajes*/
      //total1 es el computo de this 
  
      int total1 = this.ataque + this.defensa +
      super.getPorc1() + this.getPorc2() + this.getPorc3();
      //total2 es el computo del parámetro recibido
      int total2 = ((JugadorPro)anObject).ataque +
      ((JugadorPro)anObject).defensa + ((JugadorPro)anObject).getPorc1()
      + ((JugadorPro)anObject).getPorc2() + ((JugadorPro)anObject).getPorc3();
      
       return (total1 == total2);
       /*if (total1 == total2)
            return true;
       else 
            return false;
       */
    }
    
    
}