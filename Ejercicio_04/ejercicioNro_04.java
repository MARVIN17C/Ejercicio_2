public class Bus {
    private int capacidad,pasajerosActuales;
    private double caja;
    private double precio=1.5;

    public Bus(int capacidad) {
        this.capacidad=capacidad;;
        this.pasajerosActuales = 0;
        this.caja = 0.0;
    }

    public void subirPasajeros(int cantidad) {
        if (pasajerosActuales + cantidad <= capacidad) {
            this.pasajerosActuales += cantidad;
            System.out.println("Subieron " + cantidad + " pasajeros.");
        } else {
            System.out.println("No hay espacio para los " + cantidad + " pasajeros.");
        }
    }

    public void cobrarPasaje() {
        double cobro = this.pasajerosActuales * precio;
        this.caja += cobro;
        System.out.println("Bs acumulados: " + caja);
    }

    public int getAsientosDisponibles()
    {
        return this.capacidad - this.pasajerosActuales;
    }

    @Override
    public String toString() {
        return String.format("Bus Capacidad: %d, Pasajeros a bordo: %d, Asientos libres: %d, Caja: bs. %.2f",
                capacidad, pasajerosActuales, getAsientosDisponibles(), caja);
    }

    public static void main(String[] args) {
        Bus miBus = new Bus(20);

        miBus.subirPasajeros(7);
        miBus.cobrarPasaje();

        System.out.println("Asientos que quedan: " + miBus.getAsientosDisponibles());
        System.out.println(miBus);
    }
}
