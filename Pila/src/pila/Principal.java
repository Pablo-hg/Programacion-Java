package pila;
public class Principal {
    public static void main(String[] args) {
        Pila p = new Pila();
        
        p.push(1);//añade uno a la pila
        p.push(2);
        p.push(3);
        p.push(4);
        
        System.out.println(p.cima());
        System.out.println(p);
        
        p.pop();//elimina el num que está en la cima
        p.pop();
        System.out.println(p.cima());
        System.out.println(p);
        
        p.pop();
        p.pop();
        System.out.println(p.cima());
        
        System.out.println(p); // no imprime nada, porque la pila está vacia
    }
}
