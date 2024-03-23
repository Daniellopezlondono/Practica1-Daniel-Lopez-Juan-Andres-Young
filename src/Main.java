import Jobs.*;
import Tasks.TeamDriverA;
import Tasks.TeamDriverB;
import Jobs.SideJack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void line(){System.out.println("\033[0;32m*****************************\033[0m");}
    public static void main(String[] args) {

        //Creamos el equipo según las reglas como dice en la página
        F1Team f1Team1 = new F1Team("Redbull",1920,3);
        F1Team f1Team2 = new F1Team("Mercedes",1970,5);
        f1Team1.accederPrivado();
        f1Team2.accederPrivado();
        line();

        //Equipo B
        ///Creación del frontJackB con sus atributos y distintos métodos
        FrontJackB FK1B= new FrontJackB("Julian",25,3,"FrontJack");
        System.out.println(FK1B.getName());
        System.out.println(FK1B.getAge());
        System.out.println(FK1B.getJobName());
        System.out.println(FK1B.getYearsOfExperience());
        String color = FK1B.color;
        System.out.println(color);
        FK1B.job(); // Metodo con Override
        FK1B.accederPrivado();// Metodo privado proveniente de PitCrewTeam
        FK1B.trabajoEspecial();// Metodo proveniente de la interfaz TeamDriver
        line();

        ///Creación del TyreOff con sus atributos y distintos métodos
        TyreOff TOff1= new TyreOff("Marcos",35,1,"TyreOff");
        System.out.println(TOff1.getName());
        System.out.println(TOff1.getAge());
        System.out.println(TOff1.getJobName());
        System.out.println(TOff1.getYearsOfExperience());
        System.out.println(color);
        TOff1.job(); // Metodo con Override
        TOff1.accederPrivado();// Metodo privado proveniente de PitCrewTeam
        TOff1.trabajoEspecial();// Metodo proveniente de la interfaz TeamDriver
        line();

        //Equipo A
        ///Creación del FrontWing con sus atributos y distintos métodos
        FrontJackA FK2A= new FrontJackA("Paco",25,5,"FrontJack");
        System.out.println(FK2A.getName());
        System.out.println(FK2A.getAge());
        System.out.println(FK2A.getJobName());
        System.out.println(FK2A.getYearsOfExperience());
        System.out.println(color);
        FK2A.job(); // Metodo con Override
        FK2A.accederPrivado();// Metodo privado proveniente de PitCrewTeam
        FK2A.trabajoEspecial();// Metodo proveniente de la interfaz TeamDriver
        line();

        TyreOn TOn= new TyreOn("Paco",25,5,"TyreOn");
        System.out.println(TOn.getName());
        System.out.println(TOn.getAge());
        System.out.println(TOn.getJobName());
        System.out.println(TOn.getYearsOfExperience());
        System.out.println(color);
        TOn.job(); // Metodo con Override
        TOn.accederPrivado();// Metodo privado proveniente de PitCrewTeam
        TOn.trabajoEspecial();// Metodo proveniente de la interfaz TeamDriver
        line();

        // Hasta acá se demuestra el polimorfirmo, Herencia multiple, encapsulamiento y Abstracción, ahora vamos a instanciar el resto y tener el mejor equipo!!!
        /*
        Hasta acá van:
        FrontJack = FK      2/2
        FrontWing = FW      0/2
        LolipopMan = LP     0/1
        RearJack = RJ       0/2
        SideJack = SJ       0/2
        TyreGunner = TG     0/4
        TyreOff = TOff      1/4
        TyreON = TOn        1/4
         */

        // Demas trabajadores
        FrontWing FW1= new FrontWing("Paco",25,5,"FrontWing"); //FW 1/2
        FrontWing FW2 = new FrontWing("Esteban",35,14.6,"FrontWing"); // FW 2/2

        LolipopMan LP1 = new LolipopMan("Mateo",20,6.7,"Lolipopman"); // LP 1/1

        RearJack RJ1 = new RearJack("Mario",27,4.8,"RearJack"); // RJ 1/2
        RearJack RJ2 = new RearJack("Sebastian",31,1.5,"RearJack"); // RJ 2/2

        SideJack SJ1 = new SideJack("Ash",40,12.2,"SideJack"); // SJ 1/2
        SideJack SJ2 = new SideJack("Matt", 24,4.8,"SideJack"); // SJ 2/2

        TyreGunner TG1 = new TyreGunner("Juan", 21,3.4,"TyreGunner"); // TG 1/4
        TyreGunner TG2 = new TyreGunner("Alejo", 25,3.6,"TyreGunner"); // TG 2/4
        TyreGunner TG3 = new TyreGunner("Salomon", 19,2.0,"TyreGunner"); // TG 3/4
        TyreGunner TG4 = new TyreGunner("Pacho", 18,1.6,"TyreGunner"); // TG 4/4

        TyreOff TOff2 = new TyreOff("Gina", 37,9.3,"TyreOff"); // TOff 2/4
        TyreOff TOff3 = new TyreOff("Alfredo", 26,5.4,"TyreOff"); // TOff 3/4
        TyreOff TOff4 = new TyreOff("Maxwell", 33,1.1,"TyreOff"); // TOff 4/4

        TyreOn TOn2= new TyreOn("Hector", 21,1,"TyreOn"); //Ton 2/4
        TyreOn TOn3=new TyreOn("Salamanca", 19,2,"TyreOn"); //Ton 3/4
        TyreOn TOn4=new TyreOn("Vicktor", 18,3,"TyreOn"); //Ton 4/4
    }
}