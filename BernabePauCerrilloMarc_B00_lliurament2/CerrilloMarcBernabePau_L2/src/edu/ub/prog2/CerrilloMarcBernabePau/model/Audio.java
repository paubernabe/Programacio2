/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.CerrilloMarcBernabePau.model;

import edu.ub.prog2.CerrilloMarcBernabePau.controlador.Reproductor;
import java.io.File;

/**
 *
 * @author paubc
 */

public class Audio extends FitxerReproduible   {
    File fitxerImatge;
    int kbps;
    
    public Audio(String pathname,File fitxerImatge, String nom, String codec, float durada, int kbps, Reproductor r) {
        super(pathname, nom, codec, durada, r);
        this.fitxerImatge=fitxerImatge;
        this.kbps=kbps;
         this.codec=codec;
        this.durada=durada;
    }

    public int getKBPS(){
        return this.kbps;
    }
    

    @Override
    protected void reproduir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       public String toString(){
        String f="";
       f+=     "Cami " +"'"+ this.getPathTotal()+
               "Cami Miniatura: " + fitxerImatge.getAbsolutePath() +
               " Nom: " + "'"+ this.getNom()+"'" +
               "Codec: "+"'"+this.codec+
               "Durada: " + "'" + this.durada + "'"+
               "kbps: " + "'" + this.getKBPS() + "'";
       return f;
               
    }
    
    
    
 
    
}
