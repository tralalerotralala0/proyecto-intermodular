package com.proyecto.EscaleritaProyect;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EscaleritaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private final Login_Register login_register = new Login_Register();
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscaleritaLogin frame = new EscaleritaLogin();
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
	public EscaleritaLogin() {
		setTitle("Escalerita Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Escalerita GAME");
		lblTitulo.setBounds(282, 11, 147, 56);
		contentPane.add(lblTitulo);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(193, 78, 275, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(193, 64, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setBounds(193, 128, 85, 14);
		contentPane.add(lblContrasena);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Username = txtUsuario.getText();
				String contrasena = new String(txtContrasena.getPassword());
				
		
				if (login_register.login(Username, contrasena)) {
	                JOptionPane.showMessageDialog(EscaleritaLogin.this, "Login exitoso, bienvenido " + Username);
	                EscaleritaPrincipal ventanaPrincipal = new EscaleritaPrincipal();
	                ventanaPrincipal.setVisible(true);
	                dispose();
	            } else {
	                JOptionPane.showMessageDialog(EscaleritaLogin.this, "Usuario o contraseña incorrectos");
	            }
				
			}
		});
		btnLogin.setBounds(276, 174, 126, 23);
		contentPane.add(btnLogin);
		
		JButton btnForgotContra = new JButton("¿Ha olvidado su contraseña?");
		btnForgotContra.setBounds(243, 208, 201, 23);
		contentPane.add(btnForgotContra);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(193, 143, 275, 20);
		contentPane.add(txtContrasena);
	}
}
