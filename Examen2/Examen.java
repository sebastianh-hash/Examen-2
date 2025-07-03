package Examen2;
import grafica.clases.Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Examen extends JFrame {
    private JPanel panel;
    private JPanel Examen;
    private JTextField txt1;
    private JButton btnEnviar;
    private JPasswordField passwordField1;
    private JButton btnLimpiar;

    public Examen() {
        setTitle("Inicio de Sesion ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Examen);
        setLocationRelativeTo(null);

        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txt1.getText();
                String contraseña = new String(passwordField1.getPassword());

                if (usuario.equals("Sebas") && contraseña.equals("123456")) {
                    JOptionPane.showMessageDialog(
                            Examen.this,
                            "Bienvenido",
                            "Iniciando Sesión",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    grafica.clases.Menu m = new Menu();
                    m.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(
                            Examen.this,
                            "Usuario o contraseña incorrectos",
                            "Error de autenticación",
                            JOptionPane.ERROR_MESSAGE
                    );

                }
            }
        });


        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("");
                passwordField1.setText("");
            }
        });
    }
        public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Examen().setVisible(true);
        });
    }
}