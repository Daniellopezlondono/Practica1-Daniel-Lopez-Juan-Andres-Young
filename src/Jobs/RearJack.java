package Jobs;

import Tasks.PitCrewTeam;

public class RearJack extends PitCrewTeam {
    //Constructor
    public RearJack(String name, int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //override del método de TrabajadorX
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metod
    public void job(){// Encapsulamiento de sus atributos, ademas de herencia
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en levantar el carro por detras para cambiar las ruedas"));
    }
}