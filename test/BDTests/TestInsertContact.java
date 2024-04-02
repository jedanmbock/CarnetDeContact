/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BDTests;

import core.*;
import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JD
 */
public class TestInsertContact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contact contact = new Etudiant("000","contact",new Date(0),"Yaounde","def@gmail.com","622222222","Licence");
        Etudiant etudiant = new Etudiant("001","etudiant",new Date(100, 12, 01),"Yaounde","def@gmail.com","622222222","Ingenieur");
        Enseignant enseignant = new Enseignant("002","enseignat",new Date(90, 02, 02),"Yaounde","def@gmail.com","622222222","Permanent");
        Agent agent = new Agent("003","agent",new Date(0, 02, 02),"Yaounde","def@gmail.com","622222222",500000,12,"temporaire","A9","Professeur");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        }catch (Exception ex){
            System.out.println("Erreur de chargement du driver");
        }
        Connection conn = null;
        String user = "root";//Dans mon cas
        String password = "Qosascomp20?";
        String port = "8000";
        //S'assurer de mettre en route le serveur MySQL avant d'exécuter
        try{
            conn= DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/Contact?"+"user="+user+"&password="+password);
            etudiant.insertIntoBD(conn);
            enseignant.insertIntoBD(conn);
            agent.insertIntoBD(conn);
        }catch(SQLException sqlex){
            System.out.println("Un problème avec la requête est survenu!!!");
            //System.out.println(sqlex.getMessage());
            sqlex.printStackTrace();
        }catch(Exception e){
            System.out.println("Un problème est survenu!!");
            e.printStackTrace();
        }finally{
            if(conn!=null){
                try{
                    conn.close();
                }catch(SQLException sqlex){
                    System.out.println("Nous n'avons pas pu fermé la connexion!!!");
                }
            }
        }
    }
    
}
