/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.CerrilloMarcBernabePau.vista;

import edu.ub.prog2.CerrilloMarcBernabePau.controlador.Controlador;
import edu.ub.prog2.CerrilloMarcBernabePau.controlador.Reproductor;
import edu.ub.prog2.utils.AplicacioException;
import java.util.Scanner;
import edu.ub.prog2.utils.Menu;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author paubc
 */
public class AplicacioUB2 {
    AplicacioUB2 aplicacio;
    Controlador controlador=new Controlador();
    
    static private enum OpcionsMenuPrincipal {MENU_PRINCIPAL_OPCIO1,MENU_PRINCIPAL_OPCIO2,MENU_PRINCIPAL_OPCIO3,MENU_PRINCIPAL_SORTIR};
    static private enum OpcionsSubmenu1 {MENU_S1_OPCIO1,MENU_S1_OPCIO2,MENU_S1_OPCIO3,MENU_S1_OPCIO4};
    static private enum OpcionsSubmenu2 {MENU_S2_OPCIO1,MENU_S2_OPCIO2,MENU_S2_OPCIO3};
    
    private static String[] descMenuPrincipal = {"Gestió Biblioteca","Guardar Dades","Recuperar Dades","Sortir"};
    private static String[] descSubmenu1 = {"Afegir fitxer multimedia a la biblioteca","Mostrar Biblioteca","Eliminar fitxer multimèdia","Menú Anterior"};
    private static String[] descSubmenu2 = {"Afegir vídeo","Afegir àudio","Menú anterior"};

    
    public void gestioAplicacioUB(Scanner sc) throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        
        Menu <OpcionsMenuPrincipal> menu = new Menu<>("Menu Principal",OpcionsMenuPrincipal.values());
        menu.setDescripcions(descMenuPrincipal);
        OpcionsMenuPrincipal opcio = null;

        
        do{
            menu.mostrarMenu();

            opcio = menu.getOpcio(sc);

            switch(opcio){
                case MENU_PRINCIPAL_OPCIO1:
                    gestioMenuBiblioteca();
                    break;
                case MENU_PRINCIPAL_OPCIO2:
                    System.out.println("Has triat guardar dades");
                    System.out.println("Digues el cami on vulguis guardar-les");
                    String path=sc.nextLine();
                    guardar(path);
                    System.out.println("Dades guardades");
                    break;
                case MENU_PRINCIPAL_OPCIO3:
                    System.out.println("Has triat recuperar dades");
                    System.out.println("Digues el cami des d'on vulguis carregar-les ");
                    String cami=sc.nextLine();
                    carregar(cami);
                    System.out.println("Dades carregades");
                    break;
                case MENU_PRINCIPAL_SORTIR:
                    System.out.println("Fins aviat! ");
                    System.exit(0);
            }

        }while(opcio!=OpcionsMenuPrincipal.MENU_PRINCIPAL_SORTIR);
    }
    
    private void gestioMenuBiblioteca() throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        int n;
        Scanner sc = new Scanner(System.in);
        Menu <OpcionsSubmenu1> menu = new Menu<>("Gestió Biblioteca",OpcionsSubmenu1.values());
        menu.setDescripcions(descSubmenu1);
        OpcionsSubmenu1 opcio = null;
        
        do{
            menu.mostrarMenu();

            opcio = menu.getOpcio(sc);

            switch(opcio){
                case MENU_S1_OPCIO1:
                    gestioAfegirFitxerMultimedia();
                    break;
                case MENU_S1_OPCIO2:
                    System.out.println("Has triat mostrar biblioteca");
                    mostrarBiblio();
                    break;
                case MENU_S1_OPCIO3:
                    System.out.println("Has triat eliminar fitxer multimedia");
                    System.out.println("Escull el nombre del element que vols eliminar: ");
                    controlador.mostrarBiblioteca();
                    n=sc.nextInt();
                    eliminar(n);
                    break;
                case MENU_S1_OPCIO4:
                    gestioAplicacioUB(sc);
                    break;
            }

        }while(opcio!=OpcionsSubmenu1.MENU_S1_OPCIO4);
    }
    
    private void gestioAfegirFitxerMultimedia() throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        
        Scanner sc = new Scanner(System.in);
        Menu <OpcionsSubmenu2> menu = new Menu<>("Afegir Fitxer Multimedia",OpcionsSubmenu2.values());
        menu.setDescripcions(descSubmenu2);
        OpcionsSubmenu2 opcio = null;
        
        do{
            menu.mostrarMenu();

            opcio = menu.getOpcio(sc);

            switch(opcio){
                case MENU_S2_OPCIO1:
                    System.out.println("Afegir video");
                    afegirVideoBib();
                    break;
                case MENU_S2_OPCIO2:
                    System.out.println("afegir audio");
                    afegirAudioBib();
                    break;
                case MENU_S2_OPCIO3:
                    gestioMenuBiblioteca();
                    break;
            }

        }while(opcio!=OpcionsSubmenu2.MENU_S2_OPCIO3);
        
       }
    
    public void afegirVideoBib() throws AplicacioException{
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Introdueix el cami del teu fitxer");
        String path=sc.nextLine();
        
        System.out.println("Introdueix el codec del fitxer");
        String codec=sc.nextLine();
        System.out.println("Introdueix la durada del video " );
        float durada=sc.nextFloat();
        
        System.out.println("Afegeix l'alçada del teu video " );
        int alcada=sc.nextInt();
        System.out.println("Afegeix l'amplada del teu video ");
        int amplada=sc.nextInt();
        System.out.println("Afegeix els FPS del teu video " );
        float fps =sc.nextFloat();
        controlador.afegirVideo(path, "", codec, durada, alcada, amplada,fps);
        
        
    }
    
    public void afegirAudioBib() throws AplicacioException{
        Scanner sc=new Scanner (System.in);
        System.out.println("Introdueix el cami del teu fitxer");
        String cami=sc.nextLine();
        System.out.println("Introdueix el cami del teu thumnail");
        String camiImatge=sc.nextLine();
        System.out.println("Introdueix el codec del fitxer");
        String codec=sc.nextLine();
        System.out.println("Introdueix la durada del teu audio ");
        float durada=sc.nextFloat();
        System.out.println("Introdueix els kbps del teu audio ");
        int kbps=sc.nextInt();
        
        controlador.afegirAudio(cami, camiImatge, "", codec, durada, kbps);
    
    }
    
    public void mostrarBiblio() throws AplicacioException{
        
        
        System.out.println(controlador.mostrarBiblioteca());
    }
    
    public void eliminar(int k) throws AplicacioException{
        
        controlador.esborrarFitxer(k);
        System.out.println("Fitxer Esborrat");
    }
    
    public void guardar(String path) throws AplicacioException, IOException{
       controlador.guardarDadesDisc(path);
        
    }
    public void carregar(String path) throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        controlador.carregarDadesDisc(path);
    }
    
}