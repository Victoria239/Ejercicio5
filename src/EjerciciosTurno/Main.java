package EjerciciosTurno;
import interfaces.InformacionTurno;
import model.Turno;
import java.util.ArrayList;
public class Main {

        public static void main(String[] args) {
            ArrayList<InformacionTurno> turnos = new ArrayList<>();

            // Agregar turnos
            turnos.add(new Turno("08:00", "12:00", "Turno de mañana"));
            turnos.add(new Turno("12:00", "16:00", "Turno de tarde"));

            // Mostrar turnos
            for (InformacionTurno turno : turnos) {
                System.out.println("Hora inicio: " + turno.getHoraInicio());
                System.out.println("Hora fin: " + turno.getHoraFin());
                System.out.println("Descripción: " + turno.getDescripcion());
                System.out.println();
            }
        }
    }

