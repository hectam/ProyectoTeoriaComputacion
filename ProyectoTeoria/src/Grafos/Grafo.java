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
public class Grafo {
    List<Vector> gra;
    public Grafo(){
        gra = new ArrayList<Vector>();
    }
    
    public void anadirVector(String name){
       gra.add(new Vector(name));
    }
    
    public List<Vector> getLista(){
       return gra;
    }
    
    public Vector getVector(String name){
         Vector salvar = null;
         for(Vector busco:gra){
             if(busco.name.equals(name)){
                 salvar = busco;
             }
         }
        return  salvar;
    }
}
