
package poo;


public class Complejo {
    
    //numero real
    private double real;
    //unumero imaginario
    private double imaginario;

    public Complejo() {
        this.real = 1;
        this.imaginario = 1;
    }

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    
    //sumar
    //se muma la parte real de uno por la del otro
    //se suma l aparte imaginartia de uno por la del otro
    public Complejo sumar (Complejo c){
        double real_res = this.real+c.real;
        double img_res = this.imaginario+c.imaginario;
        Complejo c_res = new Complejo(real_res, img_res);
        return c_res;
    }
    //sumar
    
    
    //restar
    //se resta la parte real de uno por la del otro
    //se resta l aparte imaginartia de uno por la del otro
    public Complejo restar(Complejo c){
        double real_res = this.real-c.real;
        double img_res = this.imaginario-c.imaginario;
        Complejo c_res = new Complejo(real_res, img_res);
        return c_res;
    }
    //restar
    
    
    //multiplicar
    //se multiplica la parte real de uno por la del otro
    //se multipica l aparte imaginartia de uno por la del otro
    public Complejo multiplicar(Complejo c){
        
        double real_res = this.real*c.imaginario;
        double img_res = this.imaginario*c.imaginario;
        Complejo c_res = new Complejo(real_res, img_res);
        return c_res;
    }
    //multiplicar
    
   
    //dividir
    //se msuma la parte real de uno por la del otro
    //se suma l aparte imaginartia de uno por la del otro
    public Complejo dividir(Complejo c){
        double real_res = this.real/c.imaginario;
        double img_res = this.imaginario/c.imaginario;
        Complejo c_res = new Complejo(real_res, img_res);
        return c_res; 
    }
    //dividir
    
}
