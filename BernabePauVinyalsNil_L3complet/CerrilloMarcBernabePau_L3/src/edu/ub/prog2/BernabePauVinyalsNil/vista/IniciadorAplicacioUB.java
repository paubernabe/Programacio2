/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.BernabePauVinyalsNil.vista;

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
    
    AplicacioUB3 aplicacio = new AplicacioUB3();
    
    aplicacio.gestioAplicacioUB(sc);
        
    }
    
}