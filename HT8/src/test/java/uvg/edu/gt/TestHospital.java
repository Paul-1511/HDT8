package uvg.edu.gt;

import org.junit.*;
import static org.junit.Assert.*;

public class TestHospital {
    private Hospital hospital;

    @Before
    public void setUp() {
        hospital = new Hospital();
    }

    @Test
    public void testAgregarYAtenderPaciente() {
        Paciente paciente1 = new Paciente("Juan Perez", "fractura de pierna", 'C');
        Paciente paciente2 = new Paciente("Maria Ramirez", "apendicitis", 'A');

        hospital.agregarPaciente(paciente1);
        hospital.agregarPaciente(paciente2);

        // El paciente con mayor prioridad (Maria Ramirez) debe ser atendido primero
        assertEquals(paciente2, hospital.siguientePaciente());

        // Luego se atiende al siguiente paciente en la cola (Juan Perez)
        assertEquals(paciente1, hospital.siguientePaciente());

        // No hay más pacientes por atender, por lo que el método debería devolver null
        assertNull(hospital.siguientePaciente());
    }
}