
package swicht1;

public class Swicht1 {

    
    public static void main(String[] args) {
      
      char c = '*';
      int op1 = 7;
      int op2 = 2;
      int res = 0;
        switch (c) {
            case '+':
                res = op1 + op2;
                break;
            case '-':
                res = op1 - op2;
                break;    
            case '/':
                res = op1 / op2;
                break;
            case '*':
                res = op1 * op2;
                break;    
            default:
                System.out.println("Operador incorrecto");
        }
        
        System.out.println(res);
        
        
    }
    
}
