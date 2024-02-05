/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2.systemegestionetudiants;
import java.util.ArrayList;

/**
 *
 * @author Hatto
 */
public class TP2SystemeGestionEtudiants {
    
    public ArrayList <Etudiant> liste;
     public TP2SystemeGestionEtudiants(ArrayList liste){
    this.liste= liste;
     }
    public ArrayList getliste(){
        return ( this.liste);
    }
     public void setliste(ArrayList liste){
        this.liste=liste;
    }
     
    public void ajouterEtudiant(String Name,String Prénom, int numero,String Email) {
        Etudiant e = new Etudiant(Name, Prénom, numero, Email);
        liste.add(e);
       
    }
     public void affichageEtudiants() {
       for ( Etudiant e : liste){
           System.out.println( e.toString());
       }
     }
     
     public void modifierEmailEtudiant(int numero, string nouvelEmail) {
        for ( Etudiant e : liste){
          if (e.getnumero()==numero){ 
              e.setEmail(nouvelEmail);
          }
              
          } 
       }
     public void supprimerEtudiant(int numero) {
         int i=0;
        for ( Etudiant e : liste){
          if (e.getnumero()==numero){ 
              liste.remove(i);
              break;
       
          }
          i++;
        }
     }
}
        
     
        

