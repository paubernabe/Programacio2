package edu.ub.prog2.BernabePauVinyalsNil.vista;

import edu.ub.prog2.BernabePauVinyalsNil.controlador.Controlador;
import edu.ub.prog2.utils.AplicacioException;
import edu.ub.prog2.utils.Menu;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AplicacioUB3 {
    AplicacioUB3 aplicacio;
    Controlador controlador = new Controlador();

    
    
    static private enum OpcionsMenuPrincipal {MENU_PRINCIPAL_OPCIO1,MENU_PRINCIPAL_OPCIO2,MENU_PRINCIPAL_OPCIO3,MENU_PRINCIPAL_OPCIO4,MENU_PRINCIPAL_OPCIO5,MENU_PRINCIPAL_SORTIR};
    static private enum OpcionsSubmenu1 {MENU_S1_OPCIO1,MENU_S1_OPCIO2,MENU_S1_OPCIO3,MENU_S1_OPCIO4};
    static private enum OpcionsSubmenu1p1 {MENU_S1P1_OPCIO1,MENU_S1P1_OPCIO2,MENU_S1P1_OPCIO3};
    static private enum OpcionsSubmenu2 {MENU_S2_OPCIO1,MENU_S2_OPCIO2,MENU_S2_OPCIO3,MENU_S2_OPCIO4,MENU_S2_OPCIO5};
    static private enum OpcionsSubmenu2p4 {MENU_S2P4_OPCIO1,MENU_S2P4_OPCIO2,MENU_S2P4_OPCIO3,MENU_S2P4_OPCIO4};
    static private enum OpcionsSubmenu3 {MENU_S3_OPCIO1,MENU_S3_OPCIO2,MENU_S3_OPCIO3,MENU_S3_OPCIO4,MENU_S3_OPCIO5,MENU_S3_OPCIO6,MENU_S3_OPCIO7};
    static private enum OpcionsSubmenu3p6 {MENU_S3P6_OPCIO1,MENU_S3P6_OPCIO2,MENU_S3P6_OPCIO3,MENU_S3P6_OPCIO4,MENU_S3P6_OPCIO5};
    
    private static String[] descMenuPrincipal = {"Gestió Biblioteca","Gestió Àlbums","Control Reproducció","Guardar Dades","Recuperar Dades","Sortir"};
    private static String[] descSubmenu1 = {"Afegir fitxer multimedia a la biblioteca","Mostrar Biblioteca","Eliminar fitxer multimèdia","Menú Anterior"};
    private static String[] descSubmenu1p1 = {"Afegir vídeo","Afegir àudio","Menú anterior"};
    private static String[] descSubmenu2 = {"Afegir Àlbum","Mostrar Àlbums","Eliminar Àlbum","Gestionar Àlbum","Menú Anterior"};
    private static String[] descSubmenu2p4 = {"Afegir fitxer multimèdia","Mostrar àlbum","Eliminar fitxer multimèdia","Menú anterior"};
    private static String[] descSubmenu3 = {"Reproduir un fitxer reproduïble","Reproduir tota la biblioteca","Reproduir un àlbum","Activar/desactivar reproducció continua","Activar/desactivar reproducció aleatòria","Gestió reproducció en curs","Menú anterior"};
    private static String[] descSubmenu3p6 = {"Re-emprèn","Pausa","Atura","Salta","Sortir"};
    
    public void gestioAplicacioUB(Scanner sc) throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        
        sc = new Scanner(System.in);
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
                    gestioAlbums();
                    break;
                case MENU_PRINCIPAL_OPCIO3:
                    controlReproduccio();
                    break;
                case MENU_PRINCIPAL_OPCIO4:
                    System.out.println("Has triat guardar dades");
                    String path = sc.nextLine();                    
                    guardar(path);
                    break;
                case MENU_PRINCIPAL_OPCIO5:
                    System.out.println("Has triat recuperar dades");
                    String cami = sc.nextLine();
                    carregar(cami);
                    break;
                case MENU_PRINCIPAL_SORTIR:
                    System.out.println("Fins aviat! ");
                    //controlador.tancarFinestraReproductor();
                    System.exit(0);
            }

        }while(opcio!=OpcionsMenuPrincipal.MENU_PRINCIPAL_SORTIR);
    }
    
    private void gestioMenuBiblioteca() throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        int k;
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
                    mostrarBiblio();
                    System.out.println("Escull el nombre del element que vols eliminar: ");
                    
                    k=sc.nextInt();
                    eliminar(k);
                    break;
                case MENU_S1_OPCIO4:
                    gestioAplicacioUB(sc);
                    break;
            }

        }while(opcio!=OpcionsSubmenu1.MENU_S1_OPCIO4);
    }
    
    private void gestioAfegirFitxerMultimedia() throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        
        Scanner sc = new Scanner(System.in);
        Menu <OpcionsSubmenu1p1> menu = new Menu<>("Afegir Fitxer Multimedia",OpcionsSubmenu1p1.values());
        menu.setDescripcions(descSubmenu1p1);
        OpcionsSubmenu1p1 opcio = null;
        
        do{
            menu.mostrarMenu();

            opcio = menu.getOpcio(sc);

            switch(opcio){
                case MENU_S1P1_OPCIO1:
                    System.out.println("Has triat afegir video");
                    afegirVideoBib();
                    break;
                case MENU_S1P1_OPCIO2:
                    System.out.println("Has triat afegir audio");
                    afegirAudioBib();
                    break;
                case MENU_S1P1_OPCIO3:
                    gestioMenuBiblioteca();
                    break;
            }

        }while(opcio!=OpcionsSubmenu1p1.MENU_S1P1_OPCIO3);
    }
    
    private void gestioAlbums() throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        int k;
        Scanner sc = new Scanner(System.in);
        Menu <OpcionsSubmenu2> menu = new Menu<>("Gestió Album",OpcionsSubmenu2.values());
        menu.setDescripcions(descSubmenu2);
        OpcionsSubmenu2 opcio = null;
        
        do{
            menu.mostrarMenu();

            opcio = menu.getOpcio(sc);

            switch(opcio){
                case MENU_S2_OPCIO1:
                    addAlbum();
                    break;
                case MENU_S2_OPCIO2:
                    mostrarLlistatAlbums();
                    break;
                case MENU_S2_OPCIO3:
                    mostrarLlistatAlbums();
                    esborrarAlbum();
                    break;
                case MENU_S2_OPCIO4:
                    gestionarAlbum();
                    break;
                case MENU_S2_OPCIO5:
                    gestioAplicacioUB(sc);
                    break;
            }

        }while(opcio!=OpcionsSubmenu2.MENU_S2_OPCIO5);
    }
    
    private void gestionarAlbum() throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        int k;
        Scanner sc = new Scanner(System.in);
        Menu <OpcionsSubmenu2p4> menu = new Menu<>("Gestionar Àlbum",OpcionsSubmenu2p4.values());
        menu.setDescripcions(descSubmenu2p4);
        OpcionsSubmenu2p4 opcio = null;
        
        do{
            menu.mostrarMenu();

            opcio = menu.getOpcio(sc);

            switch(opcio){
                case MENU_S2P4_OPCIO1:
                    mostrarLlistatAlbums();
                    mostrarBiblio();
                    afegirAlAlbum();
                    break;
                case MENU_S2P4_OPCIO2:
                    mostrarLlistatAlbums();
                    mostrarInfoAlbum();
                    break;
                case MENU_S2P4_OPCIO3:
                    mostrarLlistatAlbums();
                    mostrarInfoAlbum();
                    esborrarfitxer();
                    break;
                case MENU_S2P4_OPCIO4:
                    gestioAlbums();
                    break;
            }

        }while(opcio!=OpcionsSubmenu2p4.MENU_S2P4_OPCIO4);
    }
    
    private void controlReproduccio() throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        int k;
        Scanner sc = new Scanner(System.in);
        Menu <OpcionsSubmenu3> menu = new Menu<>("Control Reproducció",OpcionsSubmenu3.values());
        menu.setDescripcions(descSubmenu3);
        OpcionsSubmenu3 opcio = null;
        
        do{
            menu.mostrarMenu();

            opcio = menu.getOpcio(sc);

            switch(opcio){
                case MENU_S3_OPCIO1:
                    System.out.println("Quin fitxer vols reproduir");
                    mostrarBiblio();
                    reprosol();
                    //reproduir un fitxer reproduible
                    break;
                case MENU_S3_OPCIO2:
                    //reproduir tota la biblio
                    
                    controlador.reproduirCarpeta();
                    break;
                case MENU_S3_OPCIO3:
                    //reproduir un album
                    mostrarLlistatAlbums();
                    System.out.println("Quin album vols reproduir?");
                    reproalbum();
                    break;
                case MENU_S3_OPCIO4:
                    controlador.setejaContinua();
                    
                    break;
                case MENU_S3_OPCIO5:
                    controlador.setejaAleatoria();
                    break;
                case MENU_S3_OPCIO6:
                    gestioReproduccio();
                    break;
                case MENU_S3_OPCIO7:
                    gestioAplicacioUB(sc);
                    break;
            }

        }while(opcio!=OpcionsSubmenu3.MENU_S3_OPCIO7);
    }
    
    private void gestioReproduccio() throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        int k;
        Scanner sc = new Scanner(System.in);
        Menu <OpcionsSubmenu3p6> menu = new Menu<>("Control Reproducció",OpcionsSubmenu3p6.values());
        menu.setDescripcions(descSubmenu3p6);
        OpcionsSubmenu3p6 opcio = null;
        
        do{
            menu.mostrarMenu();

            opcio = menu.getOpcio(sc);

            switch(opcio){
                case MENU_S3P6_OPCIO1:
                   //reempren
                    controlador.reemprenReproduccio();
                    break;
                case MENU_S3P6_OPCIO2:
                    //pausa
                    controlador.pausaReproduccio();
                    break;
                case MENU_S3P6_OPCIO3:
                    //atura
                    controlador.aturaReproduccio();
                    break;
                case MENU_S3P6_OPCIO4:
                    //salta
                    controlador.saltaReproduccio();
                    break;
                case MENU_S3P6_OPCIO5:
                    controlReproduccio();
                    break;
            }

        }while(opcio!=OpcionsSubmenu3p6.MENU_S3P6_OPCIO5);
    }

    
    public void afegirVideoBib() throws AplicacioException{
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Introdueix el cami del teu fitxer");
        String path=sc.nextLine();   
        System.out.println("Introdueix la descripció");
        String descripcio=sc.nextLine();
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
        
        try{
            controlador.afegirVideo(path, descripcio, codec, durada, alcada, amplada,fps);
        }catch(AplicacioException e){
            System.out.println(e);
        }
        
        
    }
    
    public void afegirAudioBib() throws AplicacioException{
        Scanner sc=new Scanner (System.in);
        System.out.println("Introdueix el cami del teu fitxer");
        String cami=sc.nextLine();
        System.out.println("Introdueix el cami del teu thumnail");
        String camiImatge=sc.nextLine();
        System.out.println("Introdueix la descripció");
        String descripcio=sc.nextLine();
        System.out.println("Introdueix el codec del fitxer");
        String codec=sc.nextLine();
        System.out.println("Introdueix la durada del teu audio ");
        float durada=sc.nextFloat();
        System.out.println("Introdueix els kbps del teu audio ");
        int kbps=sc.nextInt();
        
        try{
            controlador.afegirAudio(cami, camiImatge, descripcio, codec, durada, kbps);
        }catch(AplicacioException e){
            System.out.println(e);
        }
    }
    
    public void mostrarBiblio(){       
        System.out.println(controlador.mostrarBiblioteca());
    }
    
    public void eliminar(int k) throws AplicacioException{
        try{
            controlador.esborrarFitxer(k);
        }catch(AplicacioException ex){
           ex.getMessage();
        }
    }
    
    public void guardar(String path) throws AplicacioException{
        try{
            controlador.guardarDadesDisc(path);
        }catch(AplicacioException ex){
           ex.getMessage();
            
        }
            
    }
    
    public void carregar(String path) throws AplicacioException{
       try{
           controlador.carregarDadesDisc(path);
       }catch(AplicacioException ex){
           ex.getMessage();
       }       
    }
    
    //albums
    
    public void addAlbum(){
        String titol;
        Scanner sc=new Scanner (System.in);
        System.out.println("Posali un titol al teu album");
        titol=sc.nextLine();
        controlador.afegirAlbum(titol);
        
    }
    
    public void mostrarLlistatAlbums(){
        System.out.println(controlador.mostrarLlistatAlbums());
    }
    
    public void esborrarAlbum(){
       String titol;
       Scanner sc=new Scanner (System.in);
       System.out.println("Quin album vols esborrar?");
       titol=sc.nextLine();
       controlador.esborrarAlbum(titol);
    }
    
    public void afegirAlAlbum() throws AplicacioException{
        String titol;
        int id;
        Scanner sc=new Scanner (System.in);
        System.out.println("A quin album vols afegir el teu fitxer?");
        titol=sc.nextLine();
        System.out.println("Quin fitxer de la bilbioteca vols afegir?");
        id=sc.nextInt();
                
        try{
            controlador.afegirFitxer(titol, id-1);
        }catch(AplicacioException ex){
           ex.getMessage();
        }
    }
    
    public void mostrarInfoAlbum(){
        String titol;
        Scanner sc=new Scanner (System.in);
        System.out.println("Quin album vols veure el seu contingut?");
        titol=sc.nextLine();
        
        System.out.println(controlador.mostrarAlbum(titol));
        
       
        
    }
    
    public void esborrarfitxer() throws AplicacioException{
        String titol;
        int id;
        try{
        Scanner sc=new Scanner (System.in);
        System.out.println("Digues el nom de l'album");
        titol=sc.nextLine();
        System.out.println("Introdueix en num del fitxer desitjat");
        id=sc.nextInt();
        controlador.esborrarFitxer(titol, id-1);
        }catch(AplicacioException e){
            e.getMessage();
        }
    }
    
    
    //metode reproduir fitxer sol    //en cas de error tornar a incluir el AplicacioException
    public void reprosol(){
        int id;
        Scanner sc=new Scanner (System.in);
        System.out.println("Quin fitxer vols reproduir?");
        id=sc.nextInt();
        controlador.reproduirFitxer(id-1);
    }
    
    //metode reproduir un album
    public void reproalbum() throws AplicacioException{
       String titol;
       Scanner sc=new Scanner (System.in); 
      
       
       titol=sc.next();
       controlador.setejaTitol(titol);
       try{
           controlador.reproduirCarpeta(titol);
       }catch(AplicacioException e){
            e.getMessage();
       }
    }

}










