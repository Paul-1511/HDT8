package uvg.edu.gt;

import org.junit.*;
import static org.junit.Assert.*;

public class TestPaciente {
    @Test
    public void testCompareTo() {
        Paciente paciente1 = new Paciente("Juan Perez", "fractura de pierna", 'C');
        Paciente paciente2 = new Paciente("Maria Ramirez", "apendicitis", 'A');

        // Maria Ramirez tiene mayor prioridad que Juan Perez, por lo que compareTo debe devolver un número negativo
        assertTrue(paciente2.compareTo(paciente1) < 0);

        // Juan Perez tiene menor prioridad que Maria Ramirez, por lo que compareTo debe devolver un número positivo
        assertTrue(paciente1.compareTo(paciente2) > 0);

        // Un paciente es igual a sí mismo, por lo que compareTo debe devolver cero
        assertEquals(0, paciente1.compareTo(paciente1));
    }
}