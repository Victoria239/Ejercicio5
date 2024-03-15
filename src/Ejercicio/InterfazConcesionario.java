package Ejercicio;
import javax.swing.*;
public interface InterfazConcesionario {

        private Concesionario concesionario;
        public InterfazConcesionario(Concesionario concesionario) {
            this.concesionario = concesionario;
        }

        public void mostrarInterfaz() {
            JFrame frame = new JFrame("Concesionario");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            JButton agregarCarroButton = new JButton("Agregar carro");
            agregarCarroButton.addActionListener(e -> {
                String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad de carros a agregar:");
                int cantidad = Integer.parseInt(cantidadStr);
                concesionario.agregarCarro(cantidad);
            });

            JButton eliminarCarroButton = new JButton("Eliminar carro");
            eliminarCarroButton.addActionListener(e -> {
                String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad de carros a eliminar:");
                int cantidad = Integer.parseInt(cantidadStr);
                concesionario.eliminarCarro(cantidad);
            });

            JButton venderCarroButton = new JButton("Vender carro");
            venderCarroButton.addActionListener(e -> {
                String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad de carros a vender:");
                int cantidad = Integer.parseInt(cantidadStr);
                if (concesionario.venderCarro(cantidad)) {
                    JOptionPane.showMessageDialog(null, "Venta realizada con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "No hay suficientes carros disponibles");
                }
            });

            JButton mostrarInfoButton = new JButton("Mostrar información");
            mostrarInfoButton.addActionListener(e -> {
                JOptionPane.showMessageDialog(null, concesionario.getInfo());
            });

            JButton mostrarCarrosButton = new JButton("Mostrar carros disponibles");
            mostrarCarrosButton.addActionListener(e -> {
                JOptionPane.showMessageDialog(null, "Cantidad de carros disponibles: " + concesionario.getCantidadDeCarros());
            });

            panel.add(agregarCarroButton);
            panel.add(eliminarCarroButton);
            panel.add(venderCarroButton);
            panel.add(mostrarInfoButton);
            panel.add(mostrarCarrosButton);

            frame.add(panel);
            frame.setVisible(true);
        }
    }


