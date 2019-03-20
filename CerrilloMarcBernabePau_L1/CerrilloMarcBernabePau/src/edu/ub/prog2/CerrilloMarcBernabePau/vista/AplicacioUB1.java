/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.CerrilloMarcBernabePau.vista;

import edu.ub.prog2.CerrilloMarcBernabePau.model.CarpetaFitxers;
import edu.ub.prog2.CerrilloMarcBernabePau.model.FitxerMultimedia;
import edu.ub.prog2.utils.Menu;
import java.util.Scanner;



/**
 *
 * @author paubc
 */
public class AplicacioUB1 {
    AplicacioUB1 aplicacio;
    CarpetaFitxers folder;
    
    static private enum OpcionsMenuPrincipal {MENU_PRINCIPAL_OPCIO1,MENU_PRINCIPAL_OPCIO2,MENU_PRINCIPAL_OPCIO3,MENU_PRINCIPAL_SORTIR};
    private static String[] descMenuPrincipal ={"Afegir Fitxer Multimedia","Eliminar Fitxer Multimedia"
            ,"Mostrar Carpeta","Sortir"};
    
    
    public AplicacioUB1(){
        folder=new CarpetaFitxers();
    }
   
    
    public void gestioAplicacioUB(Scanner sc){
        
  
        Menu<OpcionsMenuPrincipal> menu=new Menu<>("Menu Principal",OpcionsMenuPrincipal.values());
        menu.setDescripcions(descMenuPrincipal);
        
        OpcionsMenuPrincipal opcio=null;
        

       
        do{
            menu.mostrarMenu();
            opcio=menu.getOpcio(sc);
            
            switch(opcio){
                
                case MENU_PRINCIPAL_OPCIO1:
                    System.out.println ("Has escollit l'opció "+ descMenuPrincipal[0] );
                    afegirFitxer();
                    break;
                    
                case MENU_PRINCIPAL_OPCIO2:
                    System.out.println ("Has escollit l'opció " + descMenuPrincipal[1] );
                    borrarFitxer();
                    break;
                case MENU_PRINCIPAL_OPCIO3:
                    System.out.println ("Has escollit l'opció "+descMenuPrincipal[2]);
                    mostrarCarpeta();
                    break;
                    
                case MENU_PRINCIPAL_SORTIR:
                    sortir();
                    System.out.println (descMenuPrincipal[3]);
                    
                    break;
                    
                
            
            
            
            }
            
            
        }while(opcio!=OpcionsMenuPrincipal.MENU_PRINCIPAL_SORTIR);
        
        
        
        
        
    }
    public void afegirFitxer(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Quina es la ruta del teu fitxer?");
        String path=sc.nextLine();
        FitxerMultimedia fitxer=new FitxerMultimedia(path);
        fitxer.introDesc(sc);
        try{
            if (folder.isFull()){
                System.out.println("EXCEPTION: Carpeta plena");
                
            }else{
            folder.addFitxer(fitxer);
            
        }
        }
        catch (NullPointerException e){
            System.out.println("EXCEPTION: FITXER NO TROBAT O NO EXISTENT");
        }
        
            
        }
        
    
    
    public void borrarFitxer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Quina es la ruta del teu fitxer?");
        String path=sc.nextLine();
        FitxerMultimedia fitxer=new FitxerMultimedia(path);
      
         folder.removeFitxer(fitxer)  ;
            
            
        
        
        
    
    }
    
    public void mostrarCarpeta(){
        try{
        System.out.println(folder);
        }
        catch (StringIndexOutOfBoundsException e){
           
           System.out.println("EXCEPTION: Carpeta buida o error al mostrar contingut carpeta");
        }
    }
    
    public void sortir(){
        System.out.println("Fins aviat!");
    }
    
    
    
}
