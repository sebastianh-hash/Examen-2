package Examen2;

import grafica.clases.Examen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro extends JFrame {

    private JPanel panel1;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField tx3;
    private JTextField txt4;
    private JTextField txt5;
    private JButton btnguardar;
    private JButton btnlimpiar;

    public Registro(){
        setTitle("Registro");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);

        btnguardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txt1.getText().trim();
                String nombre = txt2.getText().trim();
                String detalle = tx3.getText().trim();
                String precio = txt4.getText().trim();
                String stock = txt5.getText().trim();

                if (codigo.isEmpty() || nombre.isEmpty() || detalle.isEmpty() ||
                        precio.isEmpty() || stock.isEmpty()) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Todos los campos deben estar completos.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }


                try {
                    double precioNum = Double.parseDouble(precio);
                    int stockNum = Integer.parseInt(stock);


                    JOptionPane.showMessageDialog(
                            null,
                            "Producto guardado correctamente:\n" +
                                    "Código: " + codigo + "\n" +
                                    "Nombre: " + nombre + "\n" +
                                    "Detalle: " + detalle + "\n" +
                                    "Precio: $" + precioNum + "\n" +
                                    "Stock: " + stockNum,
                            "Guardado exitoso",
                            JOptionPane.INFORMATION_MESSAGE
                    );



                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "El precio debe ser un número decimal y el stock un número entero.",
                            "Error de formato",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Examen().setVisible(true);
        });
    }
}
