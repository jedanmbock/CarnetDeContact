/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetdecontact;
import core.*;
import java.util.Date;
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
        Contact contact = new Contact("000","contact",new Date("02/09/1990"),"Yaounde","def@gmail.com","622222222");
        Etudiant etudiant = new Etudiant("001","etudiant",new Date("02/09/1990"),"Yaounde","def@gmail.com","622222222","Ingenieur");
        Enseignant enseignant = new Enseignant("002","enseignat",new Date("02/09/1990"),"Yaounde","def@gmail.com","622222222","Permanent");
        Agent agent = new Agent("003S","agent",new Date("02/09/1990"),"Yaounde","def@gmail.com","622222222",500000,12,"temporaire","A9","Professeur");
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
