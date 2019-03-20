package edu.ub.prog2.BernabePauVinyalsNil.model;

import edu.ub.prog2.BernabePauVinyalsNil.controlador.EscoltadorReproduccio;
import edu.ub.prog2.BernabePauVinyalsNil.controlador.Reproductor;
import edu.ub.prog2.utils.AplicacioException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
 import java.util.List;


public class Dades implements Serializable {
   
    BibliotecaFitxersMultimedia biblio;
   
   ArrayList <AlbumFitxersMultimedia> a;
   AlbumFitxersMultimedia album;
   EscoltadorReproduccio er;
   private boolean continua=false, aleatoria=false;
   
   public Dades(){
       this.biblio=new BibliotecaFitxersMultimedia();
       this.a=new ArrayList<>();
   }

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
    
    public List<String> imprimirBiblio() {
        
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
        for (int i=0; i<a.size();i++){
            
            if (a.get(i).conte((FitxerMultimedia) fitxer)){
                a.get(i).removeFitxer(fitxer);
            }
            
        }
       
        }catch(AplicacioException e){
            e.getMessage();
            
        }
    }
        
    
   
    public void saveData(String Desti) throws FileNotFoundException, IOException, AplicacioException{
        try{
        File f= new File(Desti);
        FileOutputStream fileStream = new FileOutputStream(f);
        ObjectOutputStream os  =new ObjectOutputStream	(fileStream);
        os.writeObject(this);	
        fileStream.close();	
        os.close();
        }catch (FileNotFoundException ex) {
            AplicacioException e = new AplicacioException("Fitxer no trobat");
            throw e;
        }catch (IOException ex) {
            AplicacioException e = new AplicacioException("Problesmes d'IO");
            throw e;
        }
    }
    public static Dades loadData(String Origen) throws FileNotFoundException, IOException, ClassNotFoundException, AplicacioException{
        try{ 
        File fitxer=new File (Origen);
        FileInputStream	fileStream=new FileInputStream(fitxer);
        ObjectInputStream ois	= new	ObjectInputStream(fileStream);
        Object oin= ois.readObject();
        if (oin instanceof Dades){
            return (Dades)oin;
        }
        ois.close();
        fileStream.close();
        
                return (Dades)oin;

        }catch(FileNotFoundException ex) {
            throw new AplicacioException("Fitxer no trobat!");
        
        }catch (IOException ex) {
            throw new AplicacioException("ERROR!!");
            
        }catch(ClassNotFoundException ex){
            throw new AplicacioException("ClassNotFoundException");
        }
        
    }
    
    
    //albums
    
    public void afegirAlbum(String titolAlbum) throws AplicacioException{
        AlbumFitxersMultimedia al= new AlbumFitxersMultimedia(titolAlbum);
        if(!existeixAlbum(titolAlbum)){
            a.add(al);
        }
        else{
            AplicacioException e = new AplicacioException("Ja existeix aquest album! ");
            throw e;
        }
        
    }
    
    public List<String> mostrarLlistatAlbums()throws AplicacioException {
        
        List<String> impalbums= new ArrayList<>();
        int i=0;
        Iterator it= a.iterator();
        while(it.hasNext()){
            i++;
            impalbums.add("["+(i)+"]"+it.next().toString()+"\n");
        }
        if(impalbums.isEmpty()){
            AplicacioException e = new AplicacioException("No hi ha cap album! ");
            throw e;
        }
            
        return impalbums;
        
        
    }
    public void esborrarAlbum(String titolAlbum){
        for (int i=0; i<a.size();i++){
        if (titolAlbum.equals(a.get(i).getTitol())){
            a.remove(a.get(i));
        }else{
            //excep
        }
        }
        
        
        
    }
    public boolean existeixAlbum(String titolAlbum){
        boolean existeix=false;
        for (int i=0; i<a.size();i++){
            if (titolAlbum.equals(a.get(i).getTitol())){
                existeix=true;
            }else{
                existeix=false;
            }
        }
        return existeix ;
           
        
        
    }
    public void afegirFitxer(String titolAlbum, int id) throws AplicacioException{ // id és la posició a llista de getBiblioteca()
        if(existeixAlbum(titolAlbum)){
            File fitxer=biblio.getAt(id);                                         //CAÇAREM L'EXCEPCIO EN EL MENÚ
            for(int i=0; i<a.size();i++){
               if (titolAlbum.equals(a.get(i).getTitol())){
                   a.get(i).addFitxer(fitxer);
                  
               }
            }
        }
    
    }
    
        
    
    public List<String> mostrarAlbum(String titolAlbum){ // mostra informació àlbum
       
        try{
            if(!existeixAlbum(titolAlbum)){
              
                
            
            throw new AplicacioException ("Contingut buit");
  
            }
        }
        catch (AplicacioException a){
            a.getMessage();
            
           
        }
        for (int i=0; i<a.size();i++){
            if (titolAlbum.equals(a.get(i).getTitol())){
                return a.get(i).showOneAlbum(titolAlbum);

            }

        }
        return album.showOneAlbum(titolAlbum);
    }
        
    
    public void esborrarFitxer(String titolAlbum, int id) throws AplicacioException{ //sobrecàrrega del mètode per esborrar un fitxer d’un àlbum. id és la posició a llista de getBiblioteca()
        if(existeixAlbum(titolAlbum)){
            for (int i=0; i<a.size();i++){
                if (titolAlbum.equals(a.get(i).getTitol())){
                    File fitxer=a.get(i).getAt(id);
                    a.get(i).removeFitxer(fitxer);
                    
                            
                    
                }
            }
            
            
        }else{
            throw new AplicacioException("Album no existent! ");
        }
    }
    
    //acces a la biblioteca
    public void setBiblio(BibliotecaFitxersMultimedia b){
       this.biblio=b; 
    }
    public BibliotecaFitxersMultimedia getBiblio(){
        return biblio;
    }
    //acces a un album
    public void setAlbum(String titolAlbum){
        if(existeixAlbum(titolAlbum)){
            for (int i=0; i<a.size();i++){
                if (titolAlbum.equals(a.get(i).getTitol())){
                    this.album=a.get(i);
                }
        
            }
        }
    }
    
    public AlbumFitxersMultimedia getAlbum(){
        return album;
    }
    
    
    
    //definim un reproductor per a dades
    public void setReproductor(Reproductor r){
        Iterator<File> it = biblio.getFolder().iterator();
        while(it.hasNext()){
            File file = it.next();
            ((FitxerReproduible) file).setReproductor(r);
        }
        Iterator<AlbumFitxersMultimedia> iter = a.iterator();
        while(iter.hasNext()){
            Iterator<File> i = iter.next().getFolder().iterator();
            while(i.hasNext()){
               File fi = i.next();
               ((FitxerReproduible) fi).setReproductor(r); 
            }
            
        }
    }

    
    
    //SET GET DELS MODES DE REPRODUCCIO
    public void setRandom(boolean random){
        this.aleatoria=random;
    }
    public boolean getRandom(){
        return aleatoria;
    }
    public void setContinua(boolean continua){
        this.continua=continua;
    }
    public boolean getContinua(){
        return continua;
    }
    
}



