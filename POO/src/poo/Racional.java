
package poo;


public class Racional {
    
    private int numerador;
    
    private int denominador;

    public Racional() {//Construcotr por defecto
        
        this.numerador = 1;
        this.denominador = 1;
                   
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
       
    }
    
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    
    //this significa el objeto actual
    public Racional multiplicar(int num, int den){   
       int num_res = this.numerador * num;
       int den_res = this.denominador * den;
       
       Racional resultado = new Racional(num_res, den_res);
       
        return resultado;
       
    }
    
    public Racional  multiplicar(Racional r1, Racional r2){     
        int num_res = r1.numerador * r2.numerador;
        
        int den_res = r1.denominador * r2.denominador;
        
        /*Racional resultado = new Racional(num_res, des_res);
        return resultado;*/
        
        return new Racional(num_res, den_res);
    }
    
    
    
    public Racional multiplicar(Racional r){     
        int num_res = this.numerador*r.numerador;
        int den_res = this.denominador*r.denominador;
        //Generar y devolver el objeto de la clase Racional 
        //que es el resultado de multiplicar los otros dos
        Racional resultado = new Racional(num_res, den_res);
        resultado.simplificar();
        return resultado;
    }
    
    public Racional sumar(Racional r){
        //(1/4) + (1/2) = 3/4
        //4*2  --> 8(denominador)
        //1*2 + 1*4 --> 6(numerador)
        //6/8 --> 3/4
          int num_res = this.numerador * r.denominador + this.denominador * r.numerador;
          int den_res = this.denominador * r.denominador;
          Racional resultado = new Racional(num_res, den_res);
          resultado.simplificar();
          return resultado;
        }
    
    public Racional restar(Racional r){
        //al this se le resta r
       int num_res = this.numerador * r.denominador - this.denominador * r.numerador;
       int den_res = this.denominador * r.denominador;
       Racional resultado = new Racional(num_res, den_res);
       resultado.simplificar();
          return resultado;
    }
    
    public Racional dividir(Racional r){
        //al this se le divide la r 
        //(1/4) / (1/2) 
        int num_res = this.numerador*r.denominador;// 1*2
        int den_res = this.numerador*r.denominador;// 1*4
        Racional resultado = new Racional(num_res, den_res);
        resultado.simplificar();
         return resultado;
          
    }
    
    private int obtener_mcd(int a, int b) {
        //halla el máximo común divisor de a y b
        if(b==0)
        return a;
        else
        return obtener_mcd(b, a % b);
    }
    
    
    private void simplificar(){
        //hay que utilizar el mcd
        int mcd = obtener_mcd(this.denominador, this.numerador);
        this.numerador = this.numerador/mcd;
        this.denominador = this.denominador/mcd;
        //simplificar, debe darnos una fraccion irreducible
    //partiendo de una que puede o no serlo
    }

    Racional restar(double real) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
        
}
