package Jobs;

import Tasks.PitCrewTeam;
import Tasks.TeamDriverA;


public class TyreOn extends PitCrewTeam implements TeamDriverA {
    //Constructor
    public TyreOn(String name,int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //override del método de TrabajadorX
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metod
    public void job(){// Encapsulamiento de sus atributos, ademas de herencia
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en ajustar los alerones"));
    }

    @Override
    public void trabajoEspecial(){
        System.out.println("limpio la llanta del A");
    }
}
