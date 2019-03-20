/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.CerrilloMarcBernabePau.model;

/**
 *
 * @author paubc
 */

import edu.ub.prog2.utils.AplicacioException;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class CarpetaFitxers implements Serializable {
    Scanner sc;
    String des;
    int num;
    
    
    private final int mida=100;
    
    ArrayList<File> folder = new ArrayList<>(mida);
    
    
   
    
public int getSize(){
    
    return folder.size();
}
public void addFitxer(File fitxer) throws AplicacioException{
    
    folder.add(fitxer);
    
}
public void removeFitxer(File fitxer){
    
    folder.remove(fitxer);

    
}

public File getAt(int position){
    
    return folder.get(position);
    
        
    
        
    }
public void removeAll(){
    folder.clear();
}

public boolean isFull(){
   return folder.size()>=mida;
    
}

    @Override
    public String toString(){
    
    String imp="";
    if (folder.size()>=0){
    for (int i=0;i<folder.size();i++){
        imp+= "["+(i+1)+"]"+folder.get(i).toString()+"\n";
        
    }
    }
    else
    imp= "EXCEPTION: carpeta buida";
    
        return imp;
    
    
  }
}
