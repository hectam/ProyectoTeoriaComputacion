/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 *
 * @author darkz
 */
public class Grafo {
     List<Vector> gra;
     List<Vector> graCiclo;
    
     
    public Grafo(){
        gra = new ArrayList<Vector>();
        graCiclo = new ArrayList<Vector>();
    }
   
    public void anadirVector(String name,int numero){
       gra.add(new Vector(name,numero));
       
    }
     public void anadirVectorCiclo(String name,int numero){
       graCiclo.add(new Vector(name,numero));
       
    }
    
    public List<Vector> getLista(){
       return gra;
    }
    public List<Vector> getListaCiclo(){
       return graCiclo;
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
    
    public int getVectornu(String name){
         Vector salvar = null;
         for(Vector busco:gra){
             if(busco.name.equals(name)){
                 salvar = busco;
             }
         }
        return  salvar.getNumber();
    }
    
    public Boolean encontrarVector(String name){
         boolean salvar = false;
         for(Vector busco:gra){
             if(busco.name.equals(name)){
                 salvar = true;
             }
         }
        return  salvar;
        
        
    }
    
 public void addEdge(ArrayList<Integer> adj[], int u, int v)
  {
    adj[u].add(v);
    adj[v].add(u);
  }
  
  public boolean CiclosConectados(ArrayList<Integer> adj[], int s,int V, boolean[] Visitados)
  {
     int[] padre = new int[V];
    Arrays.fill(padre, -1);
 
    Queue<Integer> q = new LinkedList<>();
 
    Visitados[s] = true;
    q.add(s);
 
    while (!q.isEmpty())
    {
 
      int u = q.poll();
 
 
      
      for (int i = 0; i < adj[u].size(); i++)
      {
        int v = adj[u].get(i);
        if (!Visitados[v])
        {
          Visitados[v] = true;
          q.add(v);
          padre[v] = u;
        }
        else if (padre[u] != v)
          return true;
      }
    }
    return false;
  }
 
 
  public boolean CiclosDesconectados(ArrayList<Integer> adj[], int V)
  {
 
   
    boolean[] Visitados = new boolean[V];
    Arrays.fill(Visitados,false);
 
    for (int i = 0; i < V; i++)
      if (!Visitados[i] &&
          CiclosConectados(adj, i, V, Visitados))
        return true;
    return false;
  }


    public boolean isEmpty(){
    
        return gra.isEmpty();
    }
    
    
}
