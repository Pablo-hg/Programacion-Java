
package suma100;
public class Suma100 {
    public static void main(String[] args) {
      //sumar +1+2+3+4+5+6+.......+100 = 5050
      int i = 1;
      int suma = 0;
      while (i <= 100){
          suma = suma + i;
          i++;
      }
          System.out.println(suma);
    }
    
}
