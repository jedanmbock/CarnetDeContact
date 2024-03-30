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
    
}
