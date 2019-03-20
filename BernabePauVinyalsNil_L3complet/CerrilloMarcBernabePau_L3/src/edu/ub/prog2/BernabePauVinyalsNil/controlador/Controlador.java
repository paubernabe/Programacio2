package edu.ub.prog2.BernabePauVinyalsNil.controlador;

import edu.ub.prog2.BernabePauVinyalsNil.model.Dades;
import edu.ub.prog2.BernabePauVinyalsNil.model.Video;
import edu.ub.prog2.BernabePauVinyalsNil.model.AlbumFitxersMultimedia;
import edu.ub.prog2.BernabePauVinyalsNil.model.CarpetaFitxers;
import edu.ub.prog2.BernabePauVinyalsNil.model.Audio;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.EscoltadorReproduccioBasic;
import edu.ub.prog2.utils.InControlador;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controlador implements InControlador {
    public Dades dades;
    public  Reproductor r;
    public  EscoltadorReproduccio er;
    public Controlador(){
        dades=new Dades();
        er=new EscoltadorReproduccio();
        this.r=new Reproductor(er); 
    }
   
   
    @Override
    public void afegirVideo(String path, String nomVideo, String codec, float durada,  int alcada, int amplada, float fps) throws AplicacioException{
    Video video= new Video(path,nomVideo,codec,durada,alcada,amplada,fps,r);
    dades.addVideo(video);
}
    @Override
    public void afegirAudio(String cami, String camiImatge, String nomAudio, String codec, float durada, int kbps) throws AplicacioException{
    File fitxerImatge=new File(camiImatge);
    Audio audio=new Audio(cami,fitxerImatge,nomAudio,codec,durada,kbps,r);
    dades.addAudio(audio);
}
    @Override
    public List<String> mostrarBiblioteca() {
        return dades.imprimirBiblio();
    
}
    @Override
    public void esborrarFitxer(int id) throws AplicacioException{
    dades.deleteAfile(id);
}

    @Override
    public void guardarDadesDisc(String camiDesti) throws AplicacioException{
        try {
            dades.saveData(camiDesti);
        } catch (IOException ex) {
            ex.getMessage();
        }
}
    @Override
    public void carregarDadesDisc(String camiOrigen) throws AplicacioException{
        try {
            this.dades=Dades.loadData(camiOrigen);
            dades.setReproductor(r);
        } catch (IOException ex) {
            ex.getMessage();
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        }
}


    @Override
    public void afegirAlbum(String titolAlbum){
        try{
        AlbumFitxersMultimedia album= new AlbumFitxersMultimedia(titolAlbum);
        dades.afegirAlbum(titolAlbum);
        }catch(AplicacioException e){
            e.getMessage();
        }
}
    @Override
    public List<String> mostrarLlistatAlbums(){
        try{
            return dades.mostrarLlistatAlbums();
        }catch(AplicacioException e){
            e.getMessage();
        }
        return null;
       
    }
    @Override
    public void esborrarAlbum(String titolAlbum){
    dades.esborrarAlbum(titolAlbum);
    
}
    @Override
    public boolean existeixAlbum(String titolAlbum){
    return dades.existeixAlbum(titolAlbum);
}
    @Override
    public void afegirFitxer(String titolAlbum, int id) throws AplicacioException{ // id és la posició a llista de getBiblioteca()
    dades.afegirFitxer(titolAlbum, id);

    
}
    @Override
    public List<String> mostrarAlbum(String titolAlbum){ // mostra informació àlbum
       
        return dades.mostrarAlbum(titolAlbum);
       
        
    
}
    @Override
    public void esborrarFitxer(String titolAlbum, int id) throws AplicacioException{ //sobrecàrrega del mètode per esborrar un fitxer d’un àlbum. id és la posició a llista de getBiblioteca()
    dades.esborrarFitxer(titolAlbum, id);
    
}

    @Override
    //un sol fitxer de la biblio
    public void reproduirFitxer(int i) {
        CarpetaFitxers unic=new CarpetaFitxers();
        try{
            unic.addFitxer(dades.getBiblio().getAt(i));
            this.obrirFinestraReproductor();
            this.er.iniciarReproduccio(unic, dades.getContinua(), dades.getRandom());
        }catch(AplicacioException e){
            e.getMessage();
        }
        
        
    }

    @Override
    public void obrirFinestraReproductor() {
        this.r.open();
    }

    @Override
    public void tancarFinestraReproductor() throws AplicacioException {
        this.r.close();
    }

    @Override
    //biblio
    public void reproduirCarpeta() throws AplicacioException {
        obrirFinestraReproductor();
        this.er.iniciarReproduccio(dades.getBiblio(), dades.getContinua(), dades.getRandom());
    }

    @Override
    //album
    public void reproduirCarpeta(String string) throws AplicacioException {
        obrirFinestraReproductor();
        dades.setAlbum(string);
        this.er.iniciarReproduccio(dades.getAlbum(), dades.getContinua(), dades.getRandom());
        
    }
    public void setejaTitol(String titolAlbum){
        dades.setAlbum(titolAlbum);
    }

    @Override
    public void reemprenReproduccio() throws AplicacioException {
        this.r.resume();
    }

    @Override
    public void pausaReproduccio() throws AplicacioException {
        this.r.pause();
    }

    @Override
    public void aturaReproduccio() throws AplicacioException {
        this.r.stop();
    }

    @Override
    public void saltaReproduccio() throws AplicacioException {
        this.er.next();
       
    }
    public void setejaContinua(){
        dades.setContinua(!dades.getContinua());
    }
    public void setejaAleatoria(){
        dades.setRandom(!dades.getRandom());
    }
    public boolean getContinua(){
        return dades.getContinua();
    }
    public boolean getRandom(){
        return dades.getRandom();
    }
   
}



