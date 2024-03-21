import Jobs.*;
import Tasks.TeamDriverA;
import Tasks.TeamDriverB;
import jobs.SideJack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //Creamos el equipo según las reglas como dice en la página
        F1Team f1Team1 = new F1Team("Redbull",1920,3);
        F1Team f1Team2 = new F1Team("Mercedes",1970,5);
        f1Team1.accederPrivado();
        f1Team2.accederPrivado();


        //Equipo B
        ///Creación del frontJack con sus atributos y distintos métodos
        FrontJack frontJack1= new FrontJack("Julian",25,3,"FrontJack");
        System.out.println(frontJack1.getName());
        System.out.println(frontJack1.getAge());
        System.out.println(frontJack1.getJobName());
        System.out.println(frontJack1.getYearsOfExperience());
        String color = frontJack1.color;
        System.out.println(color);
        frontJack1.job(); // Metodo con Override
        frontJack1.accederPrivado();// Metodo privado proveniente de PitCrewTeam
        frontJack1.trabajoEspecial();// Metodo proveniente de la interfaz TeamDriver
        System.out.println("******************************");

        ///Creación del TyreOff con sus atributos y distintos métodos
        TyreOff TyreOff1= new TyreOff("Marcos",35,1,"TyreOff");
        System.out.println(TyreOff1.getName());
        System.out.println(TyreOff1.getAge());
        System.out.println(TyreOff1.getJobName());
        System.out.println(TyreOff1.getYearsOfExperience());
        System.out.println(color);
        TyreOff1.job(); // Metodo con Override
        TyreOff1.accederPrivado();// Metodo privado proveniente de PitCrewTeam
        TyreOff1.trabajoEspecial();// Metodo proveniente de la interfaz TeamDriver
        System.out.println("******************************");

        //Equipo A
        ///Creación del FrontWing con sus atributos y distintos métodos
        FrontWing FrontWing1= new FrontWing("Paco",25,5,"FrontWing");
        System.out.println(FrontWing1.getName());
        System.out.println(FrontWing1.getAge());
        System.out.println(FrontWing1.getJobName());
        System.out.println(FrontWing1.getYearsOfExperience());
        System.out.println(color);
        FrontWing1.job(); // Metodo con Override
        FrontWing1.accederPrivado();// Metodo privado proveniente de PitCrewTeam
        FrontWing1.trabajoEspecial();// Metodo proveniente de la interfaz TeamDriver
        System.out.println("******************************");

        TyreOn tyreOn1= new TyreOn("Paco",25,5,"FrontWing");
        System.out.println(tyreOn1.getName());
        System.out.println(tyreOn1.getAge());
        System.out.println(tyreOn1.getJobName());
        System.out.println(tyreOn1.getYearsOfExperience());
        System.out.println(color);
        tyreOn1.job(); // Metodo con Override
        tyreOn1.accederPrivado();// Metodo privado proveniente de PitCrewTeam
        tyreOn1.trabajoEspecial();// Metodo proveniente de la interfaz TeamDriver
        System.out.println("******************************");

        // Hasta acá se demuestra el polimorfirmo, Herencia multiple, encapsulamiento y Abstracción, ahora vamos a instanciar el resto y tener el mejor equipo!!!
        /*

        Hasta acá van


        FrontJack = FK      1/2
        FrontWing = FW      1/2
        LolipopMan = LP     0/1
        RearJack = RJ       0/2
        SideJack = SJ       0/2
        TyreGunner = TG     0/4
        TyreOff = TOff      1/4
        TyreON = TOn        1/4
         */

        // Demas trabajadores

        FrontJack FK2 = new FrontJack("Justin", 23, 5.5, "FrontJack"); // FK 2/2

        FrontWing FW2 = new FrontWing("Esteban",35,14.6,"FrontWing"); // FW 2/2

        LolipopMan LP1 = new LolipopMan("Mateo",20,6.7,"Lolipopman"); // LP 1/1

        RearJack RJ1 = new RearJack("Mario",27,4.8,"RearJack"); // RJ 1/2
        RearJack RJ2 = new RearJack("Sebastian",31,1.5,"RearJack"); // RJ 2/2

        SideJack SJ1 = new SideJack("Ash",40,12.2,"SideJack"); // SJ 1/2
        SideJack SJ2 = new SideJack("Matt", 24,4.8,"SideJack"); // SJ 2/2


        TyreGunner TG1 = new TyreGunner("Juan", 21,3.4,"TyreGunner"); // TG 2/2
        TyreGunner TG2 = new TyreGunner("Alejo", 25,3.6,"TyreGunner"); // TG 2/2
        TyreGunner TG3 = new TyreGunner("Salomon", 19,2.0,"TyreGunner"); // TG 2/2
        TyreGunner TG4 = new TyreGunner("Pacho", 18,1.6,"TyreGunner"); // TG 2/2

        //TO del 1 al 4
        TyreOff TOff1 = new TyreOff("David", 48,20.5,"TyreOff"); // SJ 2/2
        TyreOff TOff2 = new TyreOff("Gina", 37,9.3,"TyreOff"); // SJ 2/2
        TyreOff TOff3 = new TyreOff("Alfredo", 26,5.4,"TyreOff"); // SJ 2/2
        TyreOff TOff4 = new TyreOff("Maxwell", 33,1.1,"TyreOff"); // SJ 2/2

        TyreOn TO2 = new TyreOn("Hector", 21,1,"TyreOn"); // SJ 2/2
        TyreOn TO3 = new TyreOn("Salamanca", 19,2,"TyreOn"); // SJ 2/2
        TyreOn TO4 = new TyreOn("Vicktor", 18,3,"TyreOn"); // SJ 2/2
    }
}