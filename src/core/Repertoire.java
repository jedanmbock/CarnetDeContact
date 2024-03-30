/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author JD
 */
public class Repertoire {
    private ArrayList<Contact> repertoire;

    public Repertoire(ArrayList<Contact> repertoire) {
        this.repertoire = repertoire;
    }

    public Repertoire() {
        this.repertoire = new ArrayList();
    }

    public ArrayList<Contact> getRepertoire() {
        return repertoire;
    }

    public void setRepertoire(ArrayList<Contact> repertoire) {
        this.repertoire = repertoire;
    }
    
    public void ajouterContact(Contact contact){
        if(!repertoire.contains(contact)){
            repertoire.add(contact);
            System.out.println("Nouveau contact ajouté.");
        }else{
            System.out.println("Contact existant!!");
        }
    }
    
    public void supprimerContact(Contact contact){
        if(repertoire.contains(contact)){
            repertoire.remove(contact);
            System.out.println("Contact supprimé.");
        }else{
            System.out.println("Contact inexistant!!");
        }
    }
    
    public void modifierContact(Contact ancien, Contact nouveau){
        if(repertoire.contains(ancien)){
            repertoire.set(repertoire.indexOf(ancien), nouveau);
            System.out.println("Contact modifié");
        }else{
            System.out.println("Le contact que vous essayez de modifier n'existe pas!!");
        }
    }
    
    public Contact rechercherContact(String code){
        for(int indice = 0; indice<repertoire.size();indice++){
            if(repertoire.get(indice).getCode().equals(code))
                return repertoire.get(indice);
        }
        System.out.println("Aucun contact ne possède ce code.");
        return null;
    }
}
