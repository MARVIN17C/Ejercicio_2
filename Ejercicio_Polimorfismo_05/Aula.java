public class Aula {
    private String nombreaula;
    private int pisoactual;
    private String[][] estudiantes;

    public Aula(String nombreaula, int pisoactual, String[][] estudiantes) {
        this.nombreaula = nombreaula;
        this.pisoactual = pisoactual;
        this.estudiantes = estudiantes;
    }
    public void tabla() {
        System.out.println("Nombre Aula: " + this.nombreaula);
        System.out.println("Piso: " + this.pisoactual);
        System.out.println("Estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i][0] + " - Nota: " + estudiantes[i][1]);
        }
    }
    public void tabla(int n) {
        if (this.pisoactual == n) {
            System.out.println("Mostrando alumnos del piso " + n);
        for (int i = 0; i < estudiantes.length; i++) {
            int nota = Integer.parseInt(estudiantes[i][1]);
            if (nota >= 51) {
                System.out.println(estudiantes[i][0] + " Estado: APROBADO");
            } else {
                System.out.println("Estudiante: " + estudiantes[i][0] + " Estado: REPROBADO");
            }
        }
        } else {
            System.out.println("Este aula no esta en el piso " + n);
        }
    }

    public static void main(String args[]) {
        String[][] datos = {
                {"Ana Garcia", "75"},
                {"Luis Perez", "40"},
                {"Marta Ruiz", "60"}
        };
        Aula aula1 = new Aula("6TO B", 7, datos);
        aula1.tabla();
        aula1.tabla(7);
    }
}
