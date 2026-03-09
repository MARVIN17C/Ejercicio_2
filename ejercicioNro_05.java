public class Minecraft {
    private String dificultad;
    private int contador;
    private String[] jugadores = new String[10];
    private int[] diamantes = new int[10];

    public Minecraft(String dificultad) {
        this.dificultad = dificultad;
        this.contador = 0;
    }

    public void agregarJugador(String nombre, int cantDiamantes) {
        if (contador < 10) {
            this.jugadores[contador] = nombre;
            this.diamantes[contador] = cantDiamantes;
            contador=contador+1;
            System.out.println("Jugador " + nombre);
        } else {
            System.out.println("Servidor lleno");
        }
    }

    public void verificarStacks() {
        for (int i = 0; i < contador; i++) {
            int stacks = diamantes[i] / 64;
            System.out.println(jugadores[i] + " tiene " + stacks + " stacks");
        }
    }

    public void jugadorMasPro() {
        if (contador > 0) {
            int max = diamantes[0];
            String nombreMax = jugadores[0];

            for (int i = 1; i < contador; i++) {
                if (diamantes[i] > max) {
                    max = diamantes[i];
                    nombreMax = jugadores[i];
                }
            }
            System.out.println("El jugador con más diamantes es: " + nombreMax);
        }
    }

    public void mostrarTotalDiamantes() {
        int total = 0;
        for (int i = 0; i < contador; i++) {
            total = total + diamantes[i];
        }
        System.out.println("Total de diamantes en el server: " + total);
    }

    public static void main(String[] args) {
        Minecraft miServer = new Minecraft("Hardcore");

        miServer.agregarJugador("Marvin", 65);
        miServer.agregarJugador("Gabyy", 130);
        miServer.agregarJugador("Aldeanoxd", 10);

        miServer.verificarStacks();
        miServer.jugadorMasPro();
        miServer.mostrarTotalDiamantes();
    }
}
