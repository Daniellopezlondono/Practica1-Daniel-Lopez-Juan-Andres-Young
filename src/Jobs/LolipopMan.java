package Jobs;

import Tasks.PitCrewTeam;

public class LolipopMan extends PitCrewTeam {
    //Constructor
    public LolipopMan(String name,int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //override del método de TrabajadorX
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metod
    public void job(){// Encapsulamiento de sus atributos, ademas de herencia
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en dar la señal para que salga"));
    }
}