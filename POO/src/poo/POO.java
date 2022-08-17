
package poo;

public class POO {

    public static void main(String[] args) {
        
    String s = "prueba";
       
    
    String s1 = "prueba";
        String s2 = " de conocimiento";
        String s3 = s1 + s2;
        System.out.println(s3);
        String s4 = s1.concat(s2);
        
    //fecha 
    Fecha f = new Fecha(29, 2, 2020);
    //f es un objetoo instancia  de la clase Fecha
     
    boolean b2 = f.validarFecha();
     
    boolean b = f.esBisiesto();
    //fecha
     
    //punto
     
     Punto p1 = new Punto();//(0, 0, 0)
     
     Punto p2 = new Punto(1, 2, 3);
     
        System.out.println("(" +p1.getX() + "," + p1.getY() + "," + p1.getZ()+ ")");
        
        System.out.println("(" +p2.getX() + "," + p2.getY() + "," + p2.getZ()+ ")");
        
       //punto
     
       //Racional multiplicar
        Racional r1 = new Racional(1, 2);//1/2
        System.out.println(r1.getNumerador() + "/" + r1.getDenominador());
        
        Racional r2 = new Racional(1, 2);//1/2
        System.out.println(r2.getNumerador() + "/" + r2.getDenominador());
        
        Racional r3 = r1.multiplicar(r1, r2);
        
        int num = 1;
        int den = 4;
        
        Racional r4 = r3.multiplicar(num, den);// 1/4 * 1/4 --> 1/16
        
        Racional r5 = r4.multiplicar(r2);// r2 --> 1/2 //r4 es this
        //(1/16)*(1/2)
        //Racional multiplicar
        
        //Racional sumar
        Racional r6 = r3.sumar(r1);
        System.out.println(r6.getNumerador() + "/" + r6.getDenominador());
        //Racional sumar
        
        //Racional restar
        Racional r7 = r3.restar(r1);
        System.out.println(r7.getNumerador() + "/" + r7.getDenominador());
        //Racional restar
        
        //Racional dividir
        Racional r8 = r3.dividir(r1);
        System.out.println(r8.getNumerador() + "/" + r8.getDenominador());
        //Racional dividir
        
        //Racional simplificado
        //r8.obtener_mcd(2, 4); -> no lo permite por acceso privado(private)
        //Racional simplificado
        
        //Número Complejo
        Complejo c1 = new Complejo(1, 2);
        
        Complejo c2 = new Complejo();
        
        Complejo c3 = c1.multiplicar(c2);
        
        Complejo c4 = c1.sumar(c2);
        
        Complejo c5 = c1.restar(c2);
        
        Complejo c6 = c1.dividir(c2);
        //Número Complejo
        
        
        
        //Numero ComplejoR
        ComplejoR c7 = new ComplejoR();
        //Numero ComplejoR
        
        //Sumar ComplejoR
        ComplejoR c8 = new ComplejoR();
        ComplejoR c9 = c7.sumar(c8);
        //Sumar ComplejoR
        
        //Restar ComplejoR
        ComplejoR c10 = c7.restar(c8);
        //Restar ComplejoR
        
        //Multiplicacion ComplejoR
        ComplejoR c11 = c7.multiplicar(c8);
        //Multiplicacion ComplejoR
        
        //Dividir ComplejoR
        ComplejoR c12 = c7.dividir(c8);
        //Dividir ComplejoR
    }
    
    
}
