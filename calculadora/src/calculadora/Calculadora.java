
package calculadora;

public class Calculadora {

    public static void main(String[] args) {
      char c = '+'; // igual a uno de los siguiente operadores : +,-,*,/
      //String cad = "";  una cadena puede estar vacia, un char no
      int op1 = 7;
      int op2 = 2;
      int res = 0;
      
      
      if ((char) c == '+')
            res = op1 + op2;
      else if ((char) c == '-')
            res = op1 - op2;
      else if ((char) c == '/')
            res = op1 / op2;
      else if (c == '*')
            res = op1 * op2;
      else
            System.out.println("Operacion invalida");
      
        System.out.println("El resultado de la operacion es " + res);
      
      
      
    }
    
}
