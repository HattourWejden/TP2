/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;
import java.util.ArrayList;
/**
 *
 * @author Hatto
 */
public class TP2 {
    public static void main (String[] args){
        Etudiant e1= new Etudiant("wejden", "hattour",123456,"wejdenhattour@gmail.com");
        ArrayList<Etudiant> listEtudiant = new ArrayList<>();
        listEtudiant.add(e1);
        TP2SystemeGestionEtudiants s =new  TP2SystemeGestionEtudiants(listEtudiant);
        s.ajouterEtudiant("ali", "azerty", 1230, "ali@gmail.com");
        s.affichageEtudiants();
        s.modifierEmailEtudiant(1230, "sa@gmail.com");
        s.affichageEtudiants();
        s.supprimerEtudiant(1230);
        s.affichageEtudiants();
        livre livreEmpty = new livre();
        livre livreahmed = new livre ( "azerty","ahmed");
        livre livreahmed2 = new livre ( "azerty","ahmed",123);
        livre livreahmed3 = new livre ( "azerty","ahmed",123,569);
        
    }
    
}
