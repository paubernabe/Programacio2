/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.CerrilloMarcBernabePau.controlador;

import edu.ub.prog2.CerrilloMarcBernabePau.model.*;
import edu.ub.prog2.utils.AplicacioException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author paubc
 */
public class Controlador {
    Dades dades;
    Reproductor r;
    
    public Controlador(){
        dades=new Dades();
        this.r=new Reproductor("C:\\Program Files\\VideoLAN\\VLC");
    }
   
   
public void afegirVideo(String path, String nomVideo, String codec, float durada,  int alcada, int amplada, float fps) throws AplicacioException{
    Video video= new Video(path,nomVideo,codec,durada,alcada,amplada,fps,r);
    dades.addVideo(video);
}
public void afegirAudio(String cami, String camiImatge, String nomAudio, String codec, float durada, int kbps) throws AplicacioException{
    File fitxerImatge=new File(camiImatge);
    Audio audio=new Audio(cami,fitxerImatge,nomAudio,codec,durada,kbps,r);
    dades.addAudio(audio);
}
public List<String> mostrarBiblioteca() throws AplicacioException{
    return dades.imprimirBiblio();
}
public void esborrarFitxer(int id) throws AplicacioException{
    dades.deleteAfile(id);
}

public void guardarDadesDisc(String camiDesti) throws AplicacioException, IOException{
    dades.saveData(camiDesti);
}
public void carregarDadesDisc(String camiOrigen) throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
    dades.loadData(camiOrigen);
}

    

   



}
