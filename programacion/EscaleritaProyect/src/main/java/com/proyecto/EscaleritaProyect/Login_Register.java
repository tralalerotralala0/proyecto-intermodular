package com.proyecto.EscaleritaProyect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login_Register {

	public boolean register(Usuario usuario) {
		try (Connection con = DBConeccion.getConnection()) {
			String query = "INSERT INTO Usuarios (nombre, apellido, username, contrasena) VALUES(?, ?, ?, ?)";

			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, usuario.getNombre());
			stmt.setString(2, usuario.getApellido());
			stmt.setString(3, usuario.getUserName());
			stmt.setString(4, usuario.getContrasena());
			stmt.executeUpdate();
			return true;

		} catch (SQLException e) {
			System.err.println("Error al registrar: " + e.getMessage());  // 💥 Esto es clave
			return false;
		}
	}

	public boolean login(String username, String password) {
		try (Connection conn = DBConeccion.getConnection()) {
			String query = "SELECT * FROM Usuarios WHERE username = ? AND contrasena = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				System.out.println("Login exitoso para: " + username);
				return true;
			} else {
				System.out.println("Usuario o contraseña incorrectos");
				return false;
			}

		} catch (SQLException e) {
			System.err.println("Error al hacer login: " + e.getMessage());
			return false;
		}
	}
}

