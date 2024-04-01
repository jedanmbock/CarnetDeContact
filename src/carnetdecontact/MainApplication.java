/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnetdecontact;
import core.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
        Enseignant enseignant = new Enseignant("002","enseignat",new Date(1990, 02, 02),"Yaounde","def@gmail.com","622222222","Permanent");
        Agent agent = new Agent("003","agent",new Date(1990, 02, 02),"Yaounde","def@gmail.com","622222222",500000,12,"temporaire","A9","Professeur");
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
        System.out.println(etudiant.getDateNaissance());
        /*try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch (Exception ex){
            System.out.println("Erreur de chargement du driver");
        }
        Connection conn=null;
        try{
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Contact?"+"user=root&password=Qosascomp20?");
            etudiant.insertIntoBD(conn);
            enseignant.insertIntoBD(conn);
            agent.insertIntoBD(conn);
        }catch(SQLException sqlex){
            //System.out.println("Un problème est survenu!!!");
            //System.out.println(sqlex.getMessage());
            sqlex.printStackTrace();
        }finally{
            if(conn!=null){
                try{
                    conn.close();
                }catch(SQLException sqlex){
                    System.out.println("Nous n'avons pas pu ffermé la connexion!!!");
                }
            }
        }*/
    }
    
}
