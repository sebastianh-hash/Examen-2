package Examen2;

import grafica.Factura;
import grafica.MostrarProducto;
import grafica.Registro;
import grafica.clases.Examen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JPanel panel1;
    private JButton btnRegistro;
    private JButton btnVentas;
    private JButton btnProductos;

    public Menu(){
        setTitle("Menu ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);

        btnRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registro registro = new Registro();
                registro.setVisible(true);
            }
        });
        btnVentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Factura factura = new Factura();
                factura.setVisible(true);
            }
        });


        btnProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MostrarProducto mostrarProducto= new MostrarProducto();
                mostrarProducto.setVisible(true);
            }
        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Examen().setVisible(true);
        });
    }
}
