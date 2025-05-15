package com.proyecto.EscaleritaProyect;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

public class EscaleritaRegister extends JFrame {

	private static final long serialVersionUID = 1L;
	private final Login_Register login_register = new Login_Register();
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscaleritaRegister frame = new EscaleritaRegister();
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
	public EscaleritaRegister() {
		setTitle("Escalerita Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Escalerita GAME");
		lblTitulo.setBounds(282, 11, 147, 56);
		contentPane.add(lblTitulo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(193, 65, 275, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(193, 112, 275, 20);
		contentPane.add(txtApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(193, 51, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(193, 96, 85, 14);
		contentPane.add(lblApellido);
		
		JButton btnLogin = new JButton("Register");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario user = new Usuario(
						txtNombre.getText(),
						txtApellido.getText(),
						txtUsuario.getText(),
						new String(txtContrasena.getPassword())
						);
				
				if(login_register.register(user)) {
					JOptionPane.showMessageDialog(EscaleritaRegister.this, "Registro exitoso");
	                new EscaleritaLogin().setVisible(true);
	                dispose();
				}
				else {
					JOptionPane.showMessageDialog(EscaleritaRegister.this, "Usuario ya existe o error en el registro");
				}
						
			}
		});
		btnLogin.setBounds(269, 251, 126, 23);
		contentPane.add(btnLogin);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(193, 160, 275, 20);
		contentPane.add(txtUsuario);
		
		JLabel lblUsuario = new JLabel("Nombre de Usuario");
		lblUsuario.setBounds(193, 143, 154, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasena = new JLabel("Contraseñe");
		lblContrasena.setBounds(193, 197, 85, 14);
		contentPane.add(lblContrasena);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(193, 222, 275, 20);
		contentPane.add(txtContrasena);
		
		
	}
}
