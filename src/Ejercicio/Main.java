package Ejercicio;

public class Main {
        public static void main(String[] args) {
            Concesionario concesionario = new Concesionario("Concesionario XYZ", "Calle XYZ", 10);
            InterfazConcesionario interfaz = new InterfazConcesionario(concesionario) {
                @Override
                public void mostrarInterfaz() {

                }
            };
            interfaz.mostrarInterfaz();
        }
    }


