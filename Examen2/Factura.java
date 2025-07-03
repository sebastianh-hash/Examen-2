package Examen2;

import grafica.clases.Examen;
import grafica.clases.Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factura extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField6;
    private JTextField textField5;
    private JTextField textField7;
    private JButton CALCULARButton;
    private JButton REGRESARMENUButton;

    public Factura() {
        setTitle("Registro");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);

        CALCULARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(textField3.getText());
                double n2 = Double.parseDouble(textField4.getText());
                double mult = n1 * n2;
                textField6.setText(String.valueOf(mult));

                double n3 = Double.parseDouble(textField5.getText());
                double n4 = 0.15;
                double mult1 = n3 * n4;
                textField7.setText(String.valueOf(mult1));
            }
        });

        REGRESARMENUButton.addActionListener(new ActionListener() {
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
