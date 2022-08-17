
package poo;
    
public class ComplejoR {
    /*Ua clase para representar cComplejos con una limitación
    /la parte real y la paete iaginaria ya no van a poder ser 
    cualquier decilam, si on una fraccion estricta,
    o lo que es lo mismo, numeros racionales*/
    
    private Racional real;
    private Racional imaginario;

    public ComplejoR() {// constructor por defecto (no recibe parámetros)
        //asignar 1/1 a this.real
        //asignar 1/1 a this.imaginario
        //necesitamos crear 2 objetos de la clase relacional
        //uno para this.real y otro para this.imaginario
        Racional r1 = new Racional();//(1/1)
        //Racional r1 = new Racional(1, 1);        
        this.real = r1;
        
        Racional r2 = new Racional(1, 1);
        //Racional r2 = new Racional();
        this.imaginario = r2;
    }

    public ComplejoR(Racional real, Racional imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    /*primer componente del this se suma
    con el primer componente del parametro cr*/
    /*segundo componente del this se suma 
    con el segundo componente del parametro cr*/
    
    
    
    public ComplejoR sumar(ComplejoR cr){
        //sumar this.real y cr.real
        //sumar this.imaginario y cr.imaginario
        Racional res1 = this.real.sumar(cr.real);
        //this.imaginario + cr.imaginario;
        Racional res2 = this.imaginario.sumar(cr.imaginario);
        ComplejoR comr = new ComplejoR(res1, res2);
        return comr;
    }
    
    
    
    //a this le vamos a restar cr
    public ComplejoR restar(ComplejoR cr){
        //A this.real se le resta cr.real
        Racional res1 = this.real.restar(cr.real);
        //A this.imaginario se le resta cr.imaginario
        Racional res2 = this.imaginario.restar(cr.imaginario);
        ComplejoR comr = new ComplejoR(res1, res2);
        return comr;
    }
    
    
    
    public ComplejoR multiplicar(ComplejoR cr){
        //multiplicar this.real * cr.real
        //multiplicar this.imaginario * cr.imaginario
        Racional res1 = this.real.multiplicar(cr.real);
        Racional res2 = this.imaginario.multiplicar(cr.imaginario);
        ComplejoR comr = new ComplejoR(res1, res2);
        return comr;
    }
    
    
    public ComplejoR dividir(ComplejoR cr){
        //dividimos this.real / cr.real
        //dividimos this.imaginario / cr.imaginario
        Racional res1 = this.real.dividir(cr.real);
        Racional res2 = this.imaginario.dividir(cr.imaginario);
        ComplejoR comr = new ComplejoR(res1, res2);
        return comr;
    }
    
    
    
}
