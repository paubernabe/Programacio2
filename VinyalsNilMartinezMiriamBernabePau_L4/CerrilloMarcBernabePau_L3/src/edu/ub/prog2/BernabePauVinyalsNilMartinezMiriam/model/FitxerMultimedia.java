package edu.ub.prog2.BernabePauVinyalsNilMartinezMiriam.model;


import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class FitxerMultimedia  extends File {
    
    
    private String descripcio;
    
    
    
    
    
public FitxerMultimedia(String pathname,String descripcio) {
        super(pathname);
        this.descripcio=descripcio;
}

public void setDescripcio(String descripcio){
    
    this.descripcio=descripcio;
}
public String getDescripcio(){
    return descripcio;
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
    f+=  
         "Cami: "+"'"+this.getPathTotal()+"'" + "Descripció " + "'" + this.getDescripcio() + "'";
    return f;
}

  
    @Override
   public boolean equals(Object fitxerMultimedia){
       boolean esIgual=false;
       if (fitxerMultimedia instanceof FitxerMultimedia){
            FitxerMultimedia altre = (FitxerMultimedia)fitxerMultimedia;
            esIgual=this.getAbsolutePath().equals(altre.getAbsolutePath());
        }
    return esIgual;
   }
    





    

    
}


