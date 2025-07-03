package Examen2;

import grafica.clases.Examen;
import grafica.clases.Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarProducto extends JFrame {

    private JPanel panel1;
    private JButton btnRegresar;

    public MostrarProducto() {
        setTitle("Productos Admin");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);

        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu= new Menu();
                menu.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Examen().setVisible(true);
        });
    }
}
