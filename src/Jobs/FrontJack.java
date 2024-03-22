package Jobs;// El package es el paquete donde estan todos los trabajos

import Tasks.PitCrewTeam;
import Tasks.TeamDriverB;

public class FrontJack extends PitCrewTeam{

    //Constructor
    public FrontJack(String name,int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

}