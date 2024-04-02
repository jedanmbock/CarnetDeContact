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
public class Etudiant extends Contact{
    private String cycle;

    public Etudiant(String code, String nom, Date dateNaissance, String address, String email, String telNumber, String cycle) {
        super(code, nom, dateNaissance, address, email, telNumber);
        this.cycle = cycle;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }
    
    @Override
    public void insertIntoBD(Connection connect){
        try{
            Statement statement = connect.createStatement();
            statement.executeUpdate("insert into Etudiant values ('"+super.getCode()+
                    "','"+super.getNom()+"','"+super.getDateNaissance()+
                    "','"+super.getAddress()+"','"+
                    super.getEmail()+"','"+
                    super.getTelNumber()+"','"+cycle+"');");
        }catch(SQLException sqlex){
            System.out.println("Nous n'avons pas pu créer la requête.");
            sqlex.printStackTrace();
        }catch(Exception e){
            System.out.println("Problème avec la requête.");
        }
    }
}
