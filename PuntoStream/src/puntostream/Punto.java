
package puntostream;

import java.io.Serializable;

public class Punto implements Serializable{
    
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    
    }
}
