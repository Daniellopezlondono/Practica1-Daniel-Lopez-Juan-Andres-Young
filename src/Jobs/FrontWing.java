package Jobs;// El package es el paquete donde estan todos los trabajos

import Tasks.PitCrewTeam;
import Tasks.TeamDriverA;

public class FrontWing extends PitCrewTeam{
    //Constructor
    public FrontWing(String name,int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //override del método de TrabajadorX
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metod
    public void job(){// Encapsulamiento de sus atributos, ademas de herencia
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en ajustar los alerones"));
    }


}