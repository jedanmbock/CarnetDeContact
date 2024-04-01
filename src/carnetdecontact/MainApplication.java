/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetdecontact;
import core.*;
import java.sql.Date;
/**
 *
 * @author JD
 */
public class MainApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Repertoire repertoire = new Repertoire();
        Contact contact = new Etudiant("000","contact",new Date(0),"Yaounde","def@gmail.com","622222222","Licence");
        Etudiant etudiant = new Etudiant("001","etudiant",new Date(100, 12, 01),"Yaounde","def@gmail.com","622222222","Ingenieur");
        Enseignant enseignant = new Enseignant("002","enseignat",new Date(90, 02, 02),"Yaounde","def@gmail.com","622222222","Permanent");
        Agent agent = new Agent("003","agent",new Date(0, 02, 02),"Yaounde","def@gmail.com","622222222",500000,12,"temporaire","A9","Professeur");
        repertoire.ajouterContact(contact);
        repertoire.ajouterContact(etudiant);
        repertoire.ajouterContact(enseignant);
        repertoire.modifierContact(contact, agent);
        repertoire.supprimerContact(etudiant);
        contact = repertoire.rechercherContact(enseignant.getCode());
        System.out.println(contact);
        repertoire.ajouterContact(enseignant);
        repertoire.supprimerContact(etudiant);
        repertoire.modifierContact(etudiant, contact);
        contact = repertoire.rechercherContact(etudiant.getCode());
        System.out.println(contact);
        
    }
    
}