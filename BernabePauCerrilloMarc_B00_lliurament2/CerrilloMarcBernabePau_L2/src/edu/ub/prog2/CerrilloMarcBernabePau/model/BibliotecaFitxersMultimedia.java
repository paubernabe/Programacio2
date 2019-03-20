/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.CerrilloMarcBernabePau.model;

import edu.ub.prog2.utils.AplicacioException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pau bernabe
 * 
 */
public class BibliotecaFitxersMultimedia extends CarpetaFitxers {
    
    
    
    ArrayList <FitxerReproduible> biblio;
    public BibliotecaFitxersMultimedia(){
        biblio = new ArrayList(100);
        
    }
    
    
    @Override
    public void addFitxer (File fitxer) throws AplicacioException{
       try{
           if (!biblio.contains(fitxer)){
        biblio.add((FitxerReproduible) fitxer);   
       }
           else{
               throw new AplicacioException("FITXER JA EXISTENT");
           }
       }catch(AplicacioException e){
                e.getMessage();
                }
    }
           
           
    
    
    @Override
    public void removeFitxer(File fitxer){
        while(biblio.contains(fitxer))
        biblio.remove(fitxer);
    }
    
    
    @Override
    public int getSize(){
     return biblio.size();
    }
    
    @Override
    public File getAt(int i){
       return biblio.get(i);
    }
 
    
    
    
    public List<String> showBiblio(){
    
        List<String> imp=new ArrayList<>();
        int i=0;
        Iterator it = biblio.iterator();
        while(it.hasNext()){
            i++;
            imp.add("["+(i)+"]"+it.next().toString()+"\n");
            
        }    
        
        return imp;
    }
    
    
    
    
    
    
    
   
  
    
    
    
    
}
