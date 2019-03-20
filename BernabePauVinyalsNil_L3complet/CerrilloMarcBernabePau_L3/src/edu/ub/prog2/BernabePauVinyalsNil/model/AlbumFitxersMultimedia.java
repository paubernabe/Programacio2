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
 * @author paubc
 */
public class AlbumFitxersMultimedia extends CarpetaFitxers {
    private String titol;
    
    
    public AlbumFitxersMultimedia(String titol){
        this.titol=titol;
        folder = new ArrayList<>(10);
        
    }
    
    public void addFitxer(File fitxer) throws AplicacioException{
        
        folder.add((FitxerMultimedia) fitxer);   
    }
    
    public void removeFitxer(File fitxer){
        
        folder.remove(fitxer);
    }
    
    public void setTitol(String titol){
        this.titol=titol;
    }
    
    public String getTitol(){
        return titol;
    }
    
    //Metode que ens permetra eliminar fitxers que ja no hi seran a la biblioteca
    public boolean conte(FitxerMultimedia f){
        return folder.contains(f);
    }
    @Override
    public int getSize(){
     return folder.size();
    }
    
    public File getAt(int i){
       return folder.get(i);
    }
    
    public List<String> showOneAlbum(String t){
         
        List<String> imp=new ArrayList<>();
        int i=0;
        Iterator it = folder.iterator();
        while(it.hasNext()){
            i++;
            imp.add("["+(i)+"]"+it.next().toString()+"\n");
            
        } 
        
        return imp;
    }
    
    public String toString(){
        String s="";
        s+= this.getTitol();
        return s;
    }
     
    
     
    @Override
   public boolean equals(Object album){
       boolean esIgual=false;
       if (album instanceof AlbumFitxersMultimedia){
            AlbumFitxersMultimedia altre = (AlbumFitxersMultimedia)album;
            esIgual=this.getTitol().equals(altre.getTitol());
        }
    return esIgual;
   }
        
}
    

