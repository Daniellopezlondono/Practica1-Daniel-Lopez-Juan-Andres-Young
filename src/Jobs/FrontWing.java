package Jobs;// El package es el paquete donde estan todos los trabajos

import Tasks.PitCrewTeam;

public class FrontWing extends PitCrewTeam{
    //Constructor
    public FrontWing(String name,int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //@override del metodo de PitCrewTeam
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metodo
    public void job(){
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en ajustar la ala delantera"));
    }


}