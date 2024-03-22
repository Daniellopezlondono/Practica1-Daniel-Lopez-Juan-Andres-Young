package Jobs;

import Tasks.PitCrewTeam;
import Tasks.TeamDriverA;

public class FrontJackA extends FrontJack implements TeamDriverA{

    //override del método de TrabajadorX

    public FrontJackA(String name, int age, double yearsOfExperience, String jobName) {
        super(name, age, yearsOfExperience, jobName);
    }

    @Override // Polimorfismo y encapsulamiento, polimorfismo del metod
    public void job(){// Encapsulamiento de sus atributos, ademas de herencia
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en levantar el carro por al frente para cambiar las ruedas"));
    }

    @Override
    public void trabajoEspecial(){
        System.out.println("\033[0;31m Limpio el carro A \033[0m");
    }

}
