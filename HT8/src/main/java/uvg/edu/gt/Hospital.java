package uvg.edu.gt;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class Hospital {
    PriorityQueue<Paciente> colaPacientes;

    public Hospital() {
        colaPacientes = new PriorityQueue<>();
    }

    public void agregarPaciente(Paciente paciente) {
        colaPacientes.add(paciente);
    }

    public Paciente siguientePaciente() {
        return colaPacientes.poll();
    }

    public void cargarPacientesDesdeArchivo(String nombreArchivo) throws FileNotFoundException {
        File archivo = new File(nombreArchivo);
        Scanner scanner = new Scanner(archivo);

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] campos = linea.split(",");
            String nombre = campos[0].trim();
            String sintoma = campos[1].trim();
            char codigoEmergencia = campos[2].trim().charAt(0);
            Paciente paciente = new Paciente(nombre, sintoma, codigoEmergencia);
            agregarPaciente(paciente);
        }

        scanner.close();
    }
}