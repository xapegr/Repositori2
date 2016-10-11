/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Seria el main
 * @author xavier
 */
public class EmployeeApp {
   static ArrayList emp = new ArrayList();
   static Empleat e = new Empleat();
   
   public static void main(String[] args) {
        // TODO code application logic here
        int opcion=-1;
        do{
        switch (opcion)
        {
            case 1: e.addEmp();
                    //s'afegeig el empleat 'e' al Arraylist
                    emp.add(e);
                break;
            case 2: e.listEmp(emp);
                break;
            case 3: opcion=0;
            default: System.out.println("Numero no reconocido!");
        }
        }while(opcion != 0);
    
    
    
}



}
