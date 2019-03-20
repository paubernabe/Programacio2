/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.BernabePauVinyalsNil.model;

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
    
    
    
  
    public BibliotecaFitxersMultimedia(){
        folder = new ArrayList(100);
        
    }
    
    
    @Override
    public void addFitxer (File fitxer) throws AplicacioException{
       try{
           if (!folder.contains(fitxer)){
        folder.add((FitxerReproduible) fitxer);   
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
        while(folder.contains(fitxer))
        folder.remove(fitxer);
    }
    
    
    @Override
    public int getSize(){
     return folder.size();
    }
    
    @Override
    public File getAt(int i){
       return folder.get(i);
    }
 
    public ArrayList<File> getBiblio(){
        return folder;
    }
    
    
    public List<String> showBiblio(){
    
        List<String> imp=new ArrayList<>();
        int i=0;
        Iterator it = folder.iterator();
        while(it.hasNext()){
            i++;
            imp.add("["+(i)+"]"+it.next().toString()+"\n");
            
        }    
        
        return imp;
    }
    
    
    
    
    
    
    
   
  
    
    
    
    
}
