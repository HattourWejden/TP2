/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author Hatto
 */
public class Etudiant {
    private String Name ;
    private String Prénom ;
    private int numero ;
    private String Email ;
    int getnumero;
    public Etudiant(String Name , String Prénom , int numero,String Email){
    this.Name= Name ;
    this.Prénom= Prénom ;
    this.numero=numero;
    this.Email= Email ;
    
    }
    public String getName (){
        return(Name);
    }
    public void setName(String Name){
        this.Name= Name;
       
    }
    public String getPrénom (){
        return(Prénom);
    }
    public void setPrénom( String Prénom){
        this.Prénom= Prénom;
    }
    public int getnumero (){
        return(numero);
    }
    public void setnumero(int numero){
        this.numero= numero;
    }
    public String getEmail (){
        return(Email);
    }
    public void setEamil( String Email){
        this.Email= Email;
    }
    public String tostring (){
        return("Etudiant"+"name="+ getName()+"Prénom="+ getPrénom()+"email="+ getEmail()+ "numero="+getnumero());
    }

   
}
