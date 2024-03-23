package Tasks;

// Utilizaremmos interfaces para la herencia multiple,
// los trabajadores que hereden de esta interfaz van a heredar propiedades de ambos PitCrewTeam y TeamDriverA


public interface TeamDriverB {//FrontJack(1),TyereOff(4)

    // Atributos
    String color = "Azul";//Se necesita inicializar y este será también un diferenciador

    // Metodos
    public void trabajoEspecial(); // Este metodo va a sufrir un override

    private void special(){
        System.out.println("Yo trabajo especialmente con el piloto B y por eso soy color "+color);
    }
    default void accederPrivado(){
        special();
    }
}
