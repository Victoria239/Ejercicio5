package Ejercicio;

public class Concesionario {

        private String nombre;
        private String direccion;
        private int cantidadDeCarros;

        public Concesionario(String nombre, String direccion, int cantidadDeCarros) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.cantidadDeCarros = cantidadDeCarros;
        }

        public void agregarCarro(int cantidad) {
            cantidadDeCarros += cantidad;
        }

        public void eliminarCarro(int cantidad) {
            cantidadDeCarros -= cantidad;
        }

        public String getInfo() {
            return "Nombre: " + nombre + "\nDirección: " + direccion + "\nCantidad de carros: " + cantidadDeCarros;
        }

        public boolean venderCarro(int cantidad) {
            if (cantidadDeCarros >= cantidad) {
                cantidadDeCarros -= cantidad;
                return true;
            }
            return false;
        }

        public int getCantidadDeCarros() {
            return cantidadDeCarros;
        }
    }


