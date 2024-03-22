package Jobs;// El package es el paquete donde estan todos los trabajos

import Tasks.PitCrewTeam;
import Tasks.TeamDriverB;

public class TyreOff extends PitCrewTeam implements TeamDriverB{

    //Constructor
    public TyreOff(String name,int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //override del método de TrabajadorX
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metod
    public void job(){// Encapsulamiento de sus atributos, ademas de herencia
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en romover las ruedas"));
    }

    @Override
    public void trabajoEspecial(){
        System.out.println("\033[0;34mDoy agua en el equipo B \033[0m");
    }
}