/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.util.List;

/**
 *
 * @author fer
 */
public class Almacen {
    
    private int id_recurso;
    List<Cita> citas;
    List<Paciente> pacientes;
    List<SalaPolivalente> salas;
    List<Recurso> recursos;
    
    

    public int getId_recurso() {
        return id_recurso;
    }

    public void setId_recurso(int id_recurso) {
        this.id_recurso = id_recurso;
    }
    
    
    
    public void estadoInicial(){
        /*
        
-       Generar 5 salas polivalentes
-	Máquina de Tomografía Axial
-	2 máquinas de Resonancia Magnética Nuclear
-	3 máquinas de Rayos X
-	4 ecógrafos
-	6 médicos
-	6 técnicos        
        */
        SalaPolivalente sp1 = new SalaPolivalente(Integer.toString(id_recurso));
        //this.salas.add(sp1);
        this.addSala(sp1);
        SalaPolivalente sp2 = new SalaPolivalente(Integer.toString(id_recurso));
        //this.salas.add(sp2);
        this.addSala(sp2);
        SalaPolivalente sp3 = new SalaPolivalente(Integer.toString(id_recurso));
        //this.salas.add(sp3);
        this.addSala(sp3);
        SalaPolivalente sp4 = new SalaPolivalente(Integer.toString(id_recurso));
        //this.salas.add(sp4);
        this.addSala(sp4);
        SalaPolivalente sp5 = new SalaPolivalente(Integer.toString(id_recurso));
        //this.salas.add(sp5);
        this.salas.add(sp5);
    }
    public void addRecurso(Recurso r){
        
        this.recursos.add(r);
        
        if ((r instanceof Medico)||(r instanceof Tecnico))
            ;
        else
            this.id_recurso++;
            
        //id_recurso para recursos materiales
        //
    }
    
    public Recurso getRecurso(String id_dni){
        boolean encontrado = false;
        Recurso raux = null;
        int i = 0;
        
        while (i < this.recursos.size()&& !encontrado){
            if ((this.recursos.get(i) instanceof Medico)){
                
          
                (Medico)this.recursos.get(i)).getDni()
                encontrado = true;
                spaux = this.salas.get(i);
                }
                
            }
                    
            if (this.recursos.get(i) instanceof Tecnico) 
            {   
                
                ((Tecnico)this.recursos.get(i)).getDni().equals(dniaux){
                encontrado = true;
                spaux = this.salas.get(i);
                }
            }
          i++;  
        }
        return spaux;
        
        
    }
    public void addSala(SalaPolivalente sp){
        
        this.salas.add(sp);        
        this.id_recurso++;
    }
    
    public SalaPolivalente getSala(String id){
        //Dado el id de un sala la busque y la devuelva
        boolean encontrado = false;
        SalaPolivalente spaux = null;
        int i = 0;
        
        while (i < this.salas.size()&& !encontrado){
            if (this.salas.get(i).identificador.equals(id)){
                encontrado = true;
                spaux = this.salas.get(i);
            }
          i++;  
        }
        return spaux;
        
        
    }
    
    public void removeSala(String id){
        //buscar la sal con ese id y si existe borrarla de la lista de salas
        //en el caso de que no tenga citas pendientes
        boolean encontrado = false;
        
        int i = 0;
        
        while (i < this.salas.size()&& !encontrado){
            if (this.salas.get(i).identificador.equals(id) && 
                    this.salas.get(i).getCitas().size() == 0){
                encontrado = true;
                this.salas.remove(i);
            }
         i++;   
        }
        if (!encontrado)
            System.out.println("Sala no encontrada");
    }
    
    public void addCitaSala(String id, Cita c){
        //Buscar id de la sala y añadir a su lista citas el parámetro c
        boolean encontrado = false;
        
        int i = 0;
        while (i < this.salas.size()&& !encontrado){
            if (this.salas.get(i).identificador.equals(id)){
                this.salas.get(i).getCitas().add(c);
                encontrado = true;
            
        }
         i++;   
        }
        
    }
    
    public void addPaciente(Paciente p){
        this.pacientes.add(p);
        
    }
    
    public Paciente getPaciente(String dni){//"12345678Z"
        boolean encontrado = false;
        Paciente paux = null;
        int i = 0;
        int numdni = Integer.parseInt(dni.substring(0, dni.length() - 1));
        //el substring irá desde 0 hasta dni.length() - 2
        char cardni = dni.charAt(dni.length() - 1);
        DNI dniaux = new DNI(numdni, cardni);
        while (i < this.pacientes.size()&& !encontrado){
            if (this.pacientes.get(i).getDni().equals(dniaux)){
                encontrado = true;
                paux = this.pacientes.get(i);
            }
                
         i++;   
        }
        
        return paux;
        
       
    }
    public void removePaciente(String dni){
        boolean encontrado = false;
        int numdni = Integer.parseInt(dni.substring(0, dni.length() - 1));
        //el substring irá desde 0 hasta dni.length() - 2
        char cardni = dni.charAt(dni.length() - 1);
        DNI dniaux = new DNI(numdni, cardni);
        int i = 0;
        while (i < this.pacientes.size()&& !encontrado){
            if (this.pacientes.get(i).getDni().equals(dniaux)){
                encontrado = true;
                this.pacientes.remove(i);
            }
         i++;   
        }
        
        if (!encontrado)
            System.out.println("Paciente no encontrado");
    }
    
     public void addCitaPaciente(String dni, Cita c){
        boolean encontrado = false;
        int numdni = Integer.parseInt(dni.substring(0, dni.length() - 1));
        //el substring irá desde 0 hasta dni.length() - 2
        char cardni = dni.charAt(dni.length() - 1);
        DNI dniaux = new DNI(numdni, cardni);
        int i = 0;
        while (i < this.pacientes.size()&& !encontrado){
            if (this.pacientes.get(i).getDni().equals(dniaux)){
                this.pacientes.get(i).getCitas().add(c);
                encontrado = true;
            
        }
         i++;   
        }
        if (!encontrado)
            System.out.println("Paciente no encontrado");
    }
     
     public Cita recorrerRecursos(Paciente paciente, Prueba prueba){
         //Le asigna a un paciente una cita para una prueba
     }    
}

