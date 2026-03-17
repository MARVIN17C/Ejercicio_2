import java.util.Scanner;
public class Videojuegos {
    private String nombre, plataforma;
    private int cantjugadore;

    public Videojuegos(){
        this.nombre="";
        this.plataforma="";
        this.cantjugadore=0;
    }
    public Videojuegos(String nombre, String plataforma, int cantjugadore) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantjugadore = cantjugadore;
    }
    public void agregarJugadores(String nombreJuego, String plataforma) {
        this.nombre = nombreJuego;
        this.plataforma = plataforma;
        this.cantjugadore=1;
    }
    public void agregarJugadores() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos juegos quiere: ");
        int cant = sc.nextInt();
        sc.nextLine();
        this.cantjugadore = cant;
        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese nombre: "+(i+1)+":");
            String nom = sc.nextLine();
            System.out.println(nom+" En sistema");
        }

    }
    @Override
    public String toString() {
        return "Videojuegos{" +
                "nombre=" + nombre +
                ", plataforma=" + plataforma+
                ", cantjugadore=" + cantjugadore +
                '}';
    }

    public static void main(String[] args){
        Videojuegos gam1 = new Videojuegos();
        Videojuegos game2 = new Videojuegos();
        gam1.agregarJugadores("CUPHEAD","NINTENDO SWITCH");
        System.out.println(gam1+" juego registrados");
        game2.agregarJugadores();
    }
}
