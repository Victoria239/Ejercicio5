package EjercicioBanco;
import java.util.ArrayList;
public class Banco {
    class Banco {
        private CuentaCorriente cuentaCorriente;
        private CuentaAhorros cuentaAhorros;
        private CDT cdt;

        public Banco() {
            cuentaCorriente = new CuentaCorriente();
            cuentaAhorros = new CuentaAhorros();
            cdt = new CDT();
        }

        public double getSaldoCuentaCorriente() {
            return cuentaCorriente.getSaldo();
        }

        public double getSaldoCuentaAhorros() {
            return cuentaAhorros.getSaldo();
        }

        public double getSaldoCDT() {
            return cdt.getSaldo();
        }

        public double getSaldoTotal() {
            return cuentaCorriente.getSaldo() + cuentaAhorros.getSaldo() + cdt.getSaldo();
        }

        public void invertirEnCDT(double monto, double interesMensual) {
            cdt.invertir(monto, interesMensual);
        }

        public void cerrarCDT() {
            double saldoCDT = cdt.getSaldo();
            cuentaCorriente.depositar(saldoCDT);
            cdt.cerrar();
        }

        public void consignarEnCuentaCorriente(double monto) {
            cuentaCorriente.depositar(monto);
        }

        public void retirarDeCuentaCorriente(double monto) {
            cuentaCorriente.retirar(monto);
        }

        public void consignarEnCuentaAhorros(double monto) {
            cuentaAhorros.depositar(monto);
        }

        public void retirarDeCuentaAhorros(double monto) {
            cuentaAhorros.retirar(monto);
        }
    }

    // Clase abstracta para representar una cuenta bancaria genérica
    abstract class CuentaBancaria {
        protected double saldo;

        public double getSaldo() {
            return saldo;
        }

        public abstract void depositar(double monto);

        public abstract void retirar(double monto);
    }

    // Clase para representar una cuenta corriente
    class CuentaCorriente extends CuentaBancaria {
        public CuentaCorriente() {
            saldo = 0;
        }

        @Override
        public void depositar(double monto) {
            saldo += monto;
        }

        @Override
        public void retirar(double monto) {
            if (monto <= saldo) {
                saldo -= monto;
            }
        }
    }

    // Clase para representar una cuenta de ahorros
    class CuentaAhorros extends CuentaBancaria {
        private static final double INTERES_MENSUAL = 0.006; // 0.6%

        public CuentaAhorros() {
            saldo = 0;
        }

        @Override
        public void depositar(double monto) {
            saldo += monto;
        }

        @Override
        public void retirar(double monto) {
            if (monto <= saldo) {
                saldo -= monto;
            }
        }

        public double calcularInteresMensual() {
            return saldo * INTERES_MENSUAL;
        }
    }

    // Clase para representar un certificado de depósito a término
    class CDT extends CuentaBancaria {
        private double interesMensual;

        public CDT() {
            saldo = 0;
            interesMensual = 0;
        }

        public void invertir(double monto, double interesMensual) {
            saldo += monto;
            this.interesMensual = interesMensual;
        }

        public void cerrar() {
            saldo += saldo * interesMensual;
            saldo = 0;
            interesMensual = 0;
        }
    }

    // Clase para representar un libro
    class Libro {
        private String titulo;
        private String autor;
        private int paginas;

        public Libro(String titulo, String autor, int paginas) {
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
        }

        public String getInfo() {
            return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas;
        }
    }

    // Clase para representar un alumno
    class Alumno {
        private String nombre;
        private int edad;
        private String curso;

        public Alumno(String nombre, int edad, String curso) {
            this.nombre = nombre;
            this.edad = edad;
            this.curso = curso;
        }

        public String getInfo() {
            return "Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso;
        }
    }

    // Clase para representar un profesor
    class Profesor {
        private String nombre;
        private int edad;
        private String materia;

        public Profesor(String nombre, int edad, String materia) {
            this.nombre = nombre;
            this.edad = edad;
            this.materia = materia;
        }

        public String getInfo() {
            return "Nombre: " + nombre + ", Edad: " + edad + ", Materia: " + materia;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Banco banco = new Banco();

            // Ejemplo de uso
            banco.consignarEnCuentaCorriente(1000);
            banco.consignarEnCuentaAhorros(2000);
            banco.invertirEnCDT(3000, 0.01); // 1% de interés mensual

            System.out.println("Saldo Cuenta Corriente: " + banco.getSaldoCuentaCorriente());
            System.out.println("Saldo Cuenta Ahorros: " + banco.getSaldoCuentaAhorros());
            System.out.println("Saldo CDT: " + banco.getSaldoCDT());
            System.out.println("Saldo Total: " + banco.getSaldoTotal());

            banco.retirarDeCuentaCorriente(500);
            banco.retirarDeCuentaAhorros(1000);
            banco.cerrarCDT();

            System.out.println("Saldo Cuenta Corriente: " + banco.getSaldoCuentaCorriente());
            System.out.println("Saldo Cuenta Ahorros: " + banco.getSaldoCuentaAhorros());
            System.out.println("Saldo CDT: " + banco.getSaldoCDT());
            System.out.println("Saldo Total: " + banco.getSaldoTotal());

            Libro libro = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);



        }
    }
}

