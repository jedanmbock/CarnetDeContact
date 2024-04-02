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
public class Enseignant extends Contact{
    private String statut;

    public Enseignant(String code, String nom, Date dateNaissance, String address, String email, String telNumber, String statut) {
        super(code, nom, dateNaissance, address, email, telNumber);
        this.statut = statut;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    @Override
    public void insertIntoBD(Connection connect){
        try{
            Statement statement = connect.createStatement();
            statement.executeUpdate("insert into Enseignant values ('"+super.getCode()+
                    "','"+super.getNom()+"','"+super.getDateNaissance()+
                    "','"+super.getAddress()+"','"+
                    super.getEmail()+"','"+
                    super.getTelNumber()+"','"+statut+"');");
        }catch(SQLException sqlex){
            System.out.println("Nous n'avons pas pu créer la requête.");
        }catch(Exception e){
            System.out.println("Problème avec la requête.");
        }
    }
}
