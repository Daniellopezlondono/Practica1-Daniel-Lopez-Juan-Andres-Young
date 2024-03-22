package Jobs;

import Tasks.TeamDriverB;

public class FrontJackB extends FrontJack implements TeamDriverB {

    public FrontJackB(String name, int age, double yearsOfExperience, String jobName) {
        super(name, age, yearsOfExperience, jobName);
    }

    @Override // Polimorfismo y encapsulamiento, polimorfismo del metod
    public void job(){// Encapsulamiento de sus atributos, ademas de herencia
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en levantar el carro por al frente para cambiar las ruedas"));
    }

    @Override
    public void trabajoEspecial(){
        System.out.println("\033[0;34m Limpio el carro B\033[0m");
    }

}
