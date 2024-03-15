package EjerciciosTurno;
import interfaces.InformacionTurno;

    public class Turno implements InformacionTurno {
        private String horaInicio;
        private String horaFin;
        private String descripcion;

        public Turno(String horaInicio, String horaFin, String descripcion) {
            this.horaInicio = horaInicio;
            this.horaFin = horaFin;
            this.descripcion = descripcion;
        }

        @Override
        public String getHoraInicio() {
            return horaInicio;
        }

        @Override
        public String getHoraFin() {
            return horaFin;
        }

        @Override
        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        @Override
        public String toString() {
            return descripcion;
        }
    }


