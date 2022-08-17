import java.util.ArrayList;
import java.util.List;


public class Tren {

    
    
    private String identificador;
	
    private List<Vagon> vagones;

    public Tren(String identificador) {
        this.vagones = new ArrayList<Vagon>();
    }    
    
    public String listarVagones(){
        int i = 0;
        String cad = "";
        while (i < this.vagones.size()){
            cad = cad + this.vagones.get(i).getNumeracion() + " ; ";
            i++;
        }
            return cad;
    }
            
    
	
    public boolean desacoplar(String numeracion){
        boolean b = false;
        int i = 0;
        while (i < this.vagones.size()){
            if (this.vagones.get(i).getNumeracion() == numeracion)
                    this.vagones.remove(i);
                b = true;
            i++;
        }
	return b;
    }
	
    public void acoplar (Vagon v){
	this.vagones.add(v);
    }
    
    public static void main(String[] args) {
        
        Vagon v1 = new VagonMercancias (1,50.20,40.50,"hola");
        Vagon v2 = new VagonMercancias (2,60.20,50.50,"adios");
        Vagon v3 = new VagonMercancias (3,70.20,60.50,"quetal");
        
        Vagon v4 = new VagonViajeros (50,4,3,150,"muy");
        Vagon v5 = new VagonViajeros (60,5,2,250,"buenas");
        
        Tren t1 = new Tren ("Tren");
        
        t1.acoplar(v1);
        t1.acoplar(v2);
        t1.acoplar(v3);
        t1.acoplar(v4);
        t1.acoplar(v5);
        
        
        t1.desacoplar("hola");
        t1.desacoplar("buenas");
        
        System.out.println(t1.listarVagones());
        
       
        
    }
    
}
