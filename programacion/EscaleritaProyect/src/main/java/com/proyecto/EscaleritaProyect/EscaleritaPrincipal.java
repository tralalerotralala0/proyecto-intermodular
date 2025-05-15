package com.proyecto.EscaleritaProyect;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EscaleritaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscaleritaPrincipal frame = new EscaleritaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EscaleritaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escalerita GAME");
		lblNewLabel.setBounds(218, 39, 160, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Empezar nuevo juego");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(173, 82, 188, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRanking = new JButton("Ranking");
		btnRanking.setBounds(173, 153, 188, 23);
		contentPane.add(btnRanking);
		
		JButton btnReanudarltimaPartida = new JButton("Reanudar última partida");
		btnReanudarltimaPartida.setBounds(173, 116, 188, 23);
		contentPane.add(btnReanudarltimaPartida);
	}

}
