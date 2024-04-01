/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

/**
 *
 * @author JD
 */
public class Agent extends Contact{
    private double salaire;
    private int indiceSalaire;
    private String statut, categorie, occupation;

    public Agent(String code, String nom, Date dateNaissance, String address, String email, String telNumber, double salaire, int indiceSalaire, String statut, String categorie, String occupation) {
        super(code, nom, dateNaissance, address, email, telNumber);
        this.salaire = salaire;
        this.indiceSalaire = indiceSalaire;
        this.statut = statut;
        this.categorie = categorie;
        this.occupation = occupation;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int getIndiceSalaire() {
        return indiceSalaire;
    }

    public void setIndiceSalaire(int indiceSalaire) {
        this.indiceSalaire = indiceSalaire;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    @Override
    public void insertIntoBD(Connection connect){
        try{
            Statement statement = connect.createStatement();
            statement.executeUpdate("insert into Agent values ('"+super.getCode()+
                    "','"+super.getNom()+"','"+super.getDateNaissance()+
                    "','"+super.getAddress()+"','"+
                    super.getEmail()+"','"+
                    super.getTelNumber()+"','"+salaire+
                    "','"+statut+"','"+
                    categorie+"','"+
                    indiceSalaire+"','"+
                    occupation+"');");
        }catch(SQLException sqlex){
            System.out.println("Nous n'avons pas pu créer la requête.");
        }
    }
}
