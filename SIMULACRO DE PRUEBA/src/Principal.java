
public class Principal {

   
    public static void main(String[] args) {
       
        
        PC pc1= new Sobremesa(300.20,80,4,"ATX");
        
        PC pc2= new Sobremesa(500.20,120,6,"ITX");
        
        PC pc3 = new Portatil(400.30,40,3,17);
        
        PC pc4 = new Portatil(600.50,80,4,15);
        
        Ticket t1 = new Ticket (false,true);
        
        t1.añadirProducto(pc3);
        t1.añadirProducto(pc4);
        
        System.out.println(t1.imprimirTicket());
        
        
    }
    
}
