package Jobs;// El package es el paquete donde estan todos los trabajos

import Tasks.PitCrewTeam;
public class RearJack extends PitCrewTeam {
    //Constructor
    public RearJack(String name, int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //@override del metodo de PitCrewTeam
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metodo
    public void job(){
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en levantar el carro por detras para cambiar las ruedas"));
    }
}