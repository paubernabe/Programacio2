package edu.ub.prog2.BernabePauVinyalsNilMartinezMiriam.model;

import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.InFileFolder;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class CarpetaFitxers implements Serializable,InFileFolder {
    Scanner sc;
    String des;
    int num;
    
    
    private final int mida=100;
    
    ArrayList<File> folder = new ArrayList<>(mida);
    
    
   
    
    @Override
    public int getSize(){
    
    return folder.size();
}
    @Override
    public void addFitxer(File fitxer) throws AplicacioException{
    if(!fitxer.exists()){
        AplicacioException e = new AplicacioException("Posicio incorrecte!");
        throw e;
    }
    else{
        folder.add(fitxer);
    }
    
    
}
    @Override
    public void removeFitxer(File fitxer){
    
    folder.remove(fitxer);

    
}

    @Override
    public File getAt(int position){
    
    return folder.get(position);
    
        
    
        
    }
public void removeAll(){
    folder.clear();
}

    @Override
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

    @Override
    public void clear() {
        folder.clear();
    }
    
    public ArrayList<File> getFolder(){
        return folder;
    }
}




