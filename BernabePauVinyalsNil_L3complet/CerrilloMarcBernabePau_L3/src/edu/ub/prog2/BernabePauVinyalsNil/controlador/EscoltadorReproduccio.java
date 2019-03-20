/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.BernabePauVinyalsNil.controlador;

import edu.ub.prog2.BernabePauVinyalsNil.model.CarpetaFitxers;
import edu.ub.prog2.BernabePauVinyalsNil.model.FitxerReproduible;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.EscoltadorReproduccioBasic;
import java.io.File;
import java.util.Arrays;

/**
 *
 * @author paubc
 */
public class EscoltadorReproduccio extends EscoltadorReproduccioBasic {
    private CarpetaFitxers llistaReproduint;
    private boolean [ ] llistaCtrl;
    private boolean reproduccioCiclica=false, reproduccioAleatoria=false;
    
    private int pos;
    private int index=0;
       
    
   public void iniciarReproduccio(CarpetaFitxers llistaReproduint, boolean continua, boolean random){
        this.llistaReproduint=llistaReproduint;
        this.reproduccioCiclica=continua;
        this.reproduccioAleatoria=random;
        int tamany=llistaReproduint.getSize();
        try{
            if(tamany== 0){
                throw new AplicacioException ("Esta buida!!");
            }
            llistaCtrl=new boolean[tamany];
            Arrays.fill(llistaCtrl,Boolean.FALSE);
        }catch(AplicacioException ex ){
            ex.getMessage();
        }
            
        next();
       
    }


    @Override
    protected void onEndFile() {
        System.out.println("S’ha acabat de reproduir el fitxer \n");
        next();
    }

    @Override
    protected void next() {
        pos = (int) Math.round(Math.random()*(llistaCtrl.length-1));
        
        if(hasNext() && reproduccioCiclica){
           
            File fitxer=llistaReproduint.getAt(index);
            if(llistaCtrl[index]!=false){
                ++index;
                next();
            }else{
                ((FitxerReproduible)fitxer).reproduir();
                llistaCtrl[index]=true;
                
                
            }
            
        }else if(!hasNext()&& reproduccioCiclica){
                index=0;
                Arrays.fill(llistaCtrl,Boolean.FALSE);
                next();
                
        //reproduccio aleatoria    
        }else if(hasNext() && reproduccioAleatoria){
            File fitxer=llistaReproduint.getAt(pos);
            if(llistaCtrl[pos]!=false){
                next();
            }else{
                ((FitxerReproduible)fitxer).reproduir();
                llistaCtrl[pos]=true;

            }
        
        }
    }

    @Override
     protected boolean hasNext() {
        boolean trobat=false;
        for (int i=0; i<llistaCtrl.length;i++){
            trobat = llistaCtrl[i]==false;
        }
       return trobat; 
        
    }
    
    public void setContinua(boolean cont){
        this.reproduccioCiclica=cont;
    }
    public boolean getContinua(){
        return reproduccioCiclica;
    }
    public void setAleatoria(boolean random){
        this.reproduccioAleatoria=random;
    }
    public boolean getAleatoria(){
        return reproduccioAleatoria;
    }
    
}
