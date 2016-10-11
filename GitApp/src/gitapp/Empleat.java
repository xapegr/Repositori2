/*
 * Empresa 10 empleats , volem saber no i sou.
 * el sou dependra de sou base (800) + complements,
 * Programa que guarda els empleats i el seu sou.Per donar d'alta posarem el
 * nom i els diners que rep com a complemetn, i quan ens mostra el llistat ens
 * mostra nom i sou.
 */
package gitapp;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author xavier
 */
public class Empleat {

    /**
     * @param args the command line arguments
     */
    private String nom;
    private double sou;
    
    //constructors

    public Empleat(String nom, double sou) 
    {
        this.nom = nom;
        this.sou = sou;
    }

    Empleat() {
        
    }
    
    //setters getters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }
    
    //methods
    /**
     * afegir a la arraylist emp
     */
    public void addEmp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del Empleado: ");
        this.setNom(sc.nextLine());
        System.out.println("Introduce el complemento del Empleado: ");
        this.setSou(800+sc.nextFloat());      
    }
    
    /**
     * Llista l'arraylist
     * ToDO
     * Preguntar norber com posar el em->arraylist  aqui
     */
    public void listEmp(ArrayList emp)
    {
        int i;
        for (i=0;i<emp.size();i++)
        {
            System.out.println(emp.get(i));
        }
    }
}
