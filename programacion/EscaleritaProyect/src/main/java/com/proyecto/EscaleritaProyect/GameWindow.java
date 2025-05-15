package com.proyecto.EscaleritaProyect;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GameWindow extends JFrame {
    public GameWindow(Usuario user) {
        setTitle("Juego de la Oca - Bienvenido " + user.getNombre() + " " + user.getApellido());
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel bienvenida = new JLabel("¡Bienvenido " + user.getNombre() + " " + user.getApellido() + "!");
        bienvenida.setHorizontalAlignment(SwingConstants.CENTER);
        bienvenida.setBounds(0, 50, 600, 30);
        add(bienvenida);

        setLayout(null);
    }
}
