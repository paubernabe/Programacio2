/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.CerrilloMarcBernabePau.model;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class FitxerMultimedia  extends File {
    
    
    private String descripcio;
    
    
    
    
    
public FitxerMultimedia(String pathname) {
        super(pathname);
}

public void setDescripcio(String descripcio){
    
    this.descripcio=descripcio;
}
public String getDescripcio(){
    return descripcio;
}

public void introDesc(Scanner sc){
    System.out.println("Introdueix la descripció:");
    setDescripcio(sc.nextLine());
}


public Date ultimaModificacio(){
   Calendar cal =Calendar.getInstance();
   cal.setTimeInMillis(lastModified());
   Date data=cal.getTime();
   return data;
    
    
}

public String getThePath(){
    String pth=getPath();
    return pth.substring(0,pth.lastIndexOf("/")+1);
}

public String getPathTotal(){
    return getAbsolutePath();
}

public String getNom(){
    String nom=getName();
    return nom.substring(0,nom.lastIndexOf("."));
    
}
public String getExtensio(){
    String ext=getName();
    return ext.substring(ext.lastIndexOf(".")+1);
}

    @Override
    public String toString(){
    String f="";
    f+= "Descripció " + "'" + this.getDescripcio() + "'" +
            " Data: " + "'" + this.ultimaModificacio() +
            " Nom: " + "'"+ this.getNom()+"'"+
            " Extensió "+"'"+this.getExtensio()+"'"+
            "Cami: "+"'"+this.getPathTotal()+"'";
    return f;
}

  /*
    @Override
   public boolean equals(Object fitxerMultimedia){
       
       if (fitxerMultimedia instanceof FitxerMultimedia){
            FitxerMultimedia altre = (FitxerMultimedia)fitxerMultimedia;
            return(this.getDescripcio().equals(altre.getDescripcio()));
        }
        return false;
   }
*/
/*
El mètode equals l'hem implementat, però intentant de totes formes per
    a que no dongues els errors de StackOverflow i excepcions varies que 
    al sobreescriure el mètode feia que el programa funcionés de forma incorrecta.
    Al lliurament 2 solucionarem aquest aspecte.
  
*/



    

    
}

