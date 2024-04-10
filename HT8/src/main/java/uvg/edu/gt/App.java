package uvg.edu.gt;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        try {
            hospital.cargarPacientesDesdeArchivo("pacientes.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo 'pacientes.txt'.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        String opcion = "";

        while (!opcion.equals("q")) {
            System.out.println("Presione cualquier tecla para atender al siguiente paciente, o 'q' para salir.");
            opcion = scanner.nextLine();

            if (!opcion.equals("q")) {
                Paciente paciente = hospital.siguientePaciente();

                if (paciente != null) {
                    System.out.println("Atendiendo a: " + paciente);
                } else {
                    System.out.println("No hay más pacientes por atender.");
                }
            }
        }

        scanner.close();
    }
}