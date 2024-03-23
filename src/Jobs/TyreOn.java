package Jobs; // El package es el paquete donde estan todos los trabajos

import Tasks.PitCrewTeam;
import Tasks.TeamDriverA;


public class TyreOn extends PitCrewTeam implements TeamDriverA {
    //Constructor
    public TyreOn(String name,int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //@override del metodo de PitCrewTeam
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metodo
    public void job(){
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste poner las ruedas y que el tyre Gunner las apriete"));
    }

    @Override
    public void trabajoEspecial(){
        System.out.println("\033[0;31m limpio la llanta del A\033[0m");
    }
}
