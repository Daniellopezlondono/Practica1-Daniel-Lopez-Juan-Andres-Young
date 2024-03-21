public class F1Team {
    // Utilizamos private para encapsular los atributos, asi blindamos nuestro codigo de posibles hackers
    // Además usando private toca colocar los setters y getters
    private   String name;
    private   int foundationYear;
    private  int championships;
    private  int num_integrantes;
    public F1Team(String name, int foundationYear, int championships){
        this.name = name;
        this.foundationYear = foundationYear;
        this.championships= championships;
        this.num_integrantes = 20;
    }
    private  void championshipStatus(){ // Metodo privado
        if(championships>=5){
            System.out.println("Equipo "+ name +" muy exitoso, cuenta con " + championships+" campeonatos ganados");
        }
        else if(championships>=1){

            System.out.println("Equipo "+ name +" bueno, cuenta con " + championships+" campeonatos ganados");

        }
        else{
            System.out.println("Equipo "+ name + " malo, cuenta con " + championships+" campeonatos ganados");
        }
    }

    // Esta es la forma que encontramos para acceder a un metodo privado, ya que es imposible acceder a el directamente, pero al incluirlo en uno publico si funciona
    public  void accederPrivado(){
        championshipStatus();
    }// Lo llamamos a partir de un metodo publico


    // Setters y Getters, son necesarios ya que blindamos nuestro codigo con private, lo que obliga a usar estos metodos para acceder a sus propiedades(atributos y metodos)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public int getChampionships() {
        return championships;
    }

    public void setChampionships(int championships) {
        this.championships = championships;
    }

    public int getNum_integrantes() {
        return num_integrantes;
    }

    public void setNum_integrantes(int num_integrantes) {
        this.num_integrantes = num_integrantes;
    }



}
