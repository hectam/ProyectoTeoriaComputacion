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
    List<String> aristas ;
    
    public Vector(String nam){
        name = nam;
        aristas = new ArrayList<String>();
    }
    
    public void SetName(String nam){
        this.name = nam;
    }
    
    public void anadirArista(String nam){
        this.aristas.add(nam);
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
