
import java.util.ArrayList;
import java.util.List;


public class Ticket {
    
    private boolean descSobre;
    private boolean descPort;
    public static double desc_port = 5;
    public static double desc_sobre = 10;
    public List<PC> ticket;

    public Ticket(boolean descSobre, boolean descPort) {
        this.descSobre = descSobre;
        this.descPort = descPort;
        this.ticket = new ArrayList<PC>();
    }
    
    public void añadirProducto(PC pc){
        this.ticket.add(pc);
    }
    
    public String imprimirTicket(){
        int i = 0;
        double total = 0;
        String cad = "";
        
        while (i < this.ticket.size()){
            total = total + this.ticket.get(i).getPrecio();
            i++;
            return this.ticket.get(i).descripcion();
        }
        
        if ((this.descPort = false) || (this.descPort = false))
            cad =  "TOTAL : " + total + 
                " CON DESCUENTO : " + 0;
        else if (this.descPort = true)
            cad = "TOTAL : " + total + 
                " CON DESCUENTO : " + (total-this.desc_port);
        else if (this.descSobre = true)
            cad =  "TOTAL : " + total +
                " CON DESCUENTO: " + (total-this.desc_sobre);
        return cad;
               
    }
}
