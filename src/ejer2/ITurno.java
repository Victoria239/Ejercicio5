package ejer2;
public interface ITurno {
        String getHoraInicio();
        String getHoraFin();
        String getDescripcion();

        default void mostrarInformacion() {
            alert.setTitle("Información del Turno");
            alert.setHeaderText("Turno: " + getDescripcion());
            alert.setContentText("Hora inicio: " + getHoraInicio() + "\nHora fin: " + getHoraFin());
            alert.showAndWait();
        }
    }


