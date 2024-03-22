package Tasks;

public class PitCrewTeam { // Es la clase padre de la cual se va a heredar sus atributos y metodos a los trabajadores
    private String name; // Nombre del trabajador
    private int age; // Edad del trabajador
    private double yearsOfExperience; // Años de experiencia que tiene
    private String jobName;///Nombre del trabajo que tiene(tyregunner...etc)

    public PitCrewTeam(String name, int age, double yearsOfExperience,String jobName) { // El constructor de el trabajador general
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.jobName=jobName;
    }

    // Metodo #1
    public void job(){//El método básico al cual se le hará override(dependiendo del trabajo)
        System.out.println("Por Definir");
    }
    // Metodo #2
    private void qualityOfWorker(){///Metodo para obtener que tan apto es segun sus años de experiencia
        if(yearsOfExperience>=5){
            System.out.println("\033[0;34mTrabajador "+ name +" veterano, cuenta con " + yearsOfExperience+" años de experiencia \033[0m");
        }
        else if(yearsOfExperience>=2){

            System.out.println("\033[0;33m Trabajador "+ name +" bueno, cuenta con " + yearsOfExperience+" años de experiencia \033[0m");

        }
        else{
            System.out.println("\033[0;31m Trabajador "+ name + " novato, cuenta con " + yearsOfExperience+" experiencia \033[0m");
        }
    }

    public void accederPrivado(){ // Forma para acceder al metodo privado
        qualityOfWorker();
    }

    // Setters y Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}