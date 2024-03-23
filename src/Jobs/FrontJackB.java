package Jobs; // El package es el paquete donde estan todos los trabajos

import Tasks.TeamDriverB;

public class FrontJackB extends FrontJack implements TeamDriverB {

    //Constructor
    public FrontJackB(String name, int age, double yearsOfExperience, String jobName) {
        super(name, age, yearsOfExperience, jobName);
    }

    //@override del metodo de PitCrewTeam
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metodo
    public void job(){
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en levantar el carro por al frente para cambiar las ruedas"));
    }

    @Override
    public void trabajoEspecial(){
        System.out.println("\033[0;34m Limpio el carro B\033[0m");
    }

}
