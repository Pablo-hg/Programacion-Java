
package poo;


public class Punto {

    
    //atributos
        
        private int x;
        
        private int y;
        
        private int z;
        
        //metodos
        
    //1. Constructores    
    public Punto() {
        this.x = 0;
        this.y = 0;
        this.z = 0; 
    }

    public Punto(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    //2. Accesores(getter)
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    //3. Modificadores(setter)
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    
}
    

