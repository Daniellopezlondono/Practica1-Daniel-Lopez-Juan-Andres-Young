package Jobs;// El package es el paquete donde estan todos los trabajos

import Tasks.PitCrewTeam;

public class LolipopMan extends PitCrewTeam {
    //Constructor
    public LolipopMan(String name,int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //@override del metodo de PitCrewTeam
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metodo
    public void job(){
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en dar la señal para que salga"));
    }
}