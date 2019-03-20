/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.CerrilloMarcBernabePau.model;

import edu.ub.prog2.utils.AplicacioException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 import java.util.List;

/**
 *
 * @author paubc
 */
public class Dades implements Serializable {
    
   
   BibliotecaFitxersMultimedia biblio = new BibliotecaFitxersMultimedia();
   
   
   public void addVideo(Video video) throws AplicacioException{
       try{  
       if (!video.exists()){
               
               throw new AplicacioException ("FILE NOT FOUND");
               
               
           }
           else if (biblio.getSize()==100){
               
               throw new AplicacioException("Carpeta plena");
           }
           
           
           else{
                biblio.addFitxer(video);
                   }
     
        
   } catch (AplicacioException e){
       e.getMessage();
   }
   }
    
    public void addAudio(Audio audio) throws AplicacioException{
        
           try{  
       if (!audio.exists()){
               
               throw new AplicacioException ("FILE NOT FOUND");
               
               
           }
           else if (biblio.getSize()==100){
               
               throw new AplicacioException("Carpeta plena");
           }
           
          
           else{
       biblio.addFitxer(audio);
           }
     
        
   } catch (AplicacioException e){
       e.getMessage();
   }
        
    }
    
    public List<String> imprimirBiblio() throws AplicacioException{
        
        try{
        
        if (biblio.getSize()==0){
            throw new AplicacioException ("BIBLIOTECA BUIDA");
        }
        }
        catch (AplicacioException a){
            a.getMessage();
            
           
        }
        
        return biblio.showBiblio();
        
    } 

    
    
    public void deleteAfile(int num)throws AplicacioException{
        int numreal=num-1;
        try{
            if (numreal<0 || numreal>=biblio.getSize()){
            throw new AplicacioException ("INDEX ERRONI");
             }
        File fitxer=biblio.getAt(numreal);
        biblio.removeFitxer((FitxerReproduible) fitxer);
       
        }catch(AplicacioException e){
            e.getMessage();
            
        }
        }
        
    
   
    public void saveData(String Desti) throws FileNotFoundException, IOException{
        
        FileOutputStream fileStream = new FileOutputStream(Desti);
        ObjectOutputStream os  =new ObjectOutputStream	(fileStream);
        os.writeObject(this.biblio);	
        fileStream.close();	
        os.close();
        
       
    }
    
    public void loadData(String Origen) throws FileNotFoundException, IOException, ClassNotFoundException, AplicacioException{
        
        File fitxer=new File (Origen);
        FileInputStream	fileStream=new FileInputStream(fitxer);
        ObjectInputStream ois	= new	ObjectInputStream(fileStream);
        this.biblio = (BibliotecaFitxersMultimedia)ois.readObject();
        
        
        
    }
    

}
