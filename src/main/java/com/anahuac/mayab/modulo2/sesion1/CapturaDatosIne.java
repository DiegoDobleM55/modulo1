package com.anahuac.mayab.modulo2.sesion1;
import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CapturaDatosIne extends JFrame {
	 
	public CapturaDatosIne() {
		
		//Configuración del frame
		setTitle("Captura datos INE");
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null);
		
		//Configuración dek panel principal con BorderLayout
		setLayout(new BorderLayout());
		
		//Panel para los campos de entrada
		JPanel inputPanel = new JPanel(new GridLayout(5, 5, 10, 10));
		inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		//Componente del formulario 
		JLabel nameLabel = new JLabel("nombre");
		JTextField nameField = new JTextField();
		
		JLabel ageLabel = new JLabel("Fecha de nacimiento");
		JTextField ageField = new JTextField();
		
		JLabel neightborhoodLabel = new JLabel("Domicilio");
		JTextField neightborhoodField = new JTextField();
		
		JLabel emailLabel = new JLabel("Email");
		JTextField emailField = new JTextField();
		
		
		
		//Añadir componentes al panel
		inputPanel.add(nameLabel);
		inputPanel.add(nameField);
		inputPanel.add(ageLabel);
		inputPanel.add(ageField);
		inputPanel.add(neightborhoodLabel);
		inputPanel.add(neightborhoodField);
		inputPanel.add(emailLabel);
		inputPanel.add(emailField);
	
		
		
		//Panel para el botón
		JPanel buttonPanel = new JPanel();
		JButton submitButton = new JButton("Enviar");
		buttonPanel.add(submitButton);
		
		//Añadir paneles al JFrame
		add(inputPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		//Hacer visible el JFrame
		setVisible(true);
	}
		
		public static void main(String[] arg) {
			SwingUtilities.invokeLater(CapturaDatosIne::new);
	}
	
}

