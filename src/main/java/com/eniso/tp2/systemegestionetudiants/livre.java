/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author Hatto
 */
public class livre {
    private String titre ;
    private String auteur ;
    public  int annee ;
    public int isbn ;
    
    public livre (String titre , String auteur , int annee, int isbn){
    this.titre= titre;
    this.auteur= auteur ;
    this.annee=annee;
    this.isbn= isbn ;
    
    }
    public String gettitre (){
        return(titre);
    }
    public void settitre(String titre){
        this.titre= titre;
       
    }
    public String getauteur (){
        return(auteur);
    }
    public void setauteur( String auteur){
        this.auteur= auteur ;
    }
    
   public livre (String titre , String auteur){
    this.titre= titre  ;
    this.auteur= auteur;
    this.annee=1956;
    this.isbn= 20 ;
   
    } 
    public livre (String titre , String auteur , int annee){
    this.titre= titre;
    this.auteur= auteur ;
    this.annee= annee;
   
    this.isbn= 56 ;
   
    
   }
    public livre (){
    this.titre= "fleur rouge";
    this.auteur= " ali";
    this.annee= 1236;
    this.isbn= 56;
     }

    
}
