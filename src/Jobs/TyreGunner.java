package Jobs;// El package es el paquete donde estan todos los trabajos

import Tasks.PitCrewTeam;
public class TyreGunner extends PitCrewTeam {
    //Constructor
    public TyreGunner(String name,int age, double yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //@override del metodo de PitCrewTeam
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metodp
    public void job(){
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en aflojar y apretar las tuercas que sostienen las llantas"));
    }
}
