package Tasks;

// Utilizaremmos interfaces para la herencia multiple, los trabajadores que hereden de esta interfaz van a tener herencia multiple y van a heredar propiedades de ambos PitCrewTeam y TeamDriverA
//TyreOn(4),FrontJack(1)
public interface TeamDriverA {

    // Atributos

    String color = "Rojo";//Se necesita inicializar y este será también un diferenciador

    // Metodos

    public void trabajoEspecial(); // Este metodo va a sufrir un override

    private void special(){
        System.out.println("Yo trabajo especialmente con el piloto A y por eso soy color "+color);
    }
    default void accederPrivado(){
        special();
    }
}
