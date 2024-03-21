package jobs;

import Tasks.PitCrewTeam;

public class SideJack extends PitCrewTeam {
    //Constructor
    public SideJack(String name,int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //override del método de TrabajadorX
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metod
    public void job(){
        // Encapsulamiento de sus atributos, ademas de herencia
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste estabilizar el carro lo máximo posible durante los pits"));
    }
}