/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Date;

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
    
}
