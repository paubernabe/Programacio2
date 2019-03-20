/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.CerrilloMarcBernabePau.vista;

import edu.ub.prog2.utils.AplicacioException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author paubc
 */
public class IniciadorAplicacioUB {
    
    public static void main(String [] args) throws AplicacioException, IOException, FileNotFoundException, ClassNotFoundException{
        
    Scanner sc=new Scanner(System.in);
    
    AplicacioUB2 aplicacio = new AplicacioUB2();
    
    aplicacio.gestioAplicacioUB(sc);
        
    }
    
}
    