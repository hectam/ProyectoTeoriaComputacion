/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author darkz
 */
public class Vector {
    String name;
    int number;
    public List<String> aristas ;
    public List<String> aristasCiclo ;
    
    public Vector(String nam,int numero){
        name = nam;
        this.number = numero;
        aristas = new ArrayList<String>();
        aristasCiclo = new ArrayList<String>();
        
    }
    
    public void SetName(String nam){
        this.name = nam;
    }
    
    public int getNumber(){
        return number;
    }
    
    public void anadirArista(String nam){
        this.aristas.add(nam);
    }
    public void anadirAristaCiclo(String nam){
        this.aristasCiclo.add(nam);
    }
    public int cantidadAristas(){
       return  this.aristas.size();
    }
    
    public boolean checkArista(String nam){
       
         for(String busco:aristas){
             if(busco.equals(nam)){
                 return true;
             }
         }
        return false;
    }

    
    
}
