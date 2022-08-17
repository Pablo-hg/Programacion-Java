package animalario;

import java.util.ArrayList;

public class Poblacion {
    
    private String nombre;
    private String responsable;
    private int num_dias;
    private ArrayList<Raton> ratones;

    public Poblacion(String nombre, String responsable, int num_dias) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.num_dias = num_dias;
        this.ratones = new ArrayList<Raton>();
    }
    
    public boolean añadirRaton (Raton r){
        //Devolvemos true si el rato no estaba en la poblacion
        //devolvemos false si si lo estaba en la poblacion
        //Usamos como auxiliar buscarRaton
            if (this.buscarRaton(r.getCod_ref()) == -1){//si no estaba en la poblacion
                this.ratones.add(r);
                return true;
            }
            else//si estaba ya en la poblacion
                return false; 
    }
    
    private int buscarRaton(String cr){
        //Devolvemos la posicion del raton en el ArrayList
        //Metodo auxiliar (se le llama solo desde otros metodos)
        //Si no coincide con niguno, devolvemos  -1
        //Si coinde devolvemos su posicion en el ArrayList
        boolean encontrado = false;
        int i = 0;
        while ((1 < this.ratones.size()) && (!encontrado)){
            if (this.ratones.get(i).getCod_ref().equals(cr))
                encontrado = true;
            else
                i++;
        }
        if (i == this.ratones.size())
            return -1;
        else
            return i;   
    }
    
    private boolean quitarRaton(String cr){
        //true si el raton está en la poblacion 
        //false si el raton no se encunetra en la poblacion
        int i = this.buscarRaton(cr);
        if (i != -1){//eliminarlo
            this.ratones.remove(i);
            return true;
        }
        else//no está
            return false;   
        }
    
    public boolean modificarRaton(String cr, Raton r){
        //machacar el raton de codigo cr con el nuevo r
        //true si existe un raton con ese cr, false e.o.c
        int i = this.buscarRaton(cr);
        if (i != -1){//estaba
            //modificamos
            this.ratones.set(i, r);//reemplaza la poscion this.buscarRaton(cr) por ñla de r
            return true;
        }
        else //no estaba
            return false;
    }
    //listar los codigos de referencia de todos los ratones de una poblacion
    public void listarcodRatones(){
        for (int i = 0; i < this.ratones.size(); i++)
            System.out.println(this.ratones.get(i).getCod_ref());      
    }
    
    public String infoRaton (String cr){
        //si existe, devuelve info detalla del raton
        //si no existe, devuelve un mensaje advistiendo
        int i = this.buscarRaton(cr);
        if (i != -1)//se encuentra
             return this.ratones.get(i).toString();
        else//no existe
            return "el raton especificado no es encuenta en la poblacion";
    }
}
            
    
    

