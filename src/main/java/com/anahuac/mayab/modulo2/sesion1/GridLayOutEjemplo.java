package com.anahuac.mayab.modulo2.sesion1;
import javax.swing.*;
import java.awt.*;

public class GridLayOutEjemplo extends JFrame {
	
	public GridLayOutEjemplo () {
		
		setTitle("Captura de datos de tu mascota");
		setSize(400, 400);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(3, 3, 10, 10));
		
		
		add(new JLabel("Nombre mascota"));
		add(new JTextField());
		add(new JLabel(" "));
		add(new JLabel("Edad"));
		add(new JTextField());
		add(new JButton("Aceptar"));
		add(new JLabel("Raza"));
		add(new JTextField()); 
		add(new JLabel(" "));
		
		/*add(new JButton("1"));
		 add(new JButton("2"));           
		 add(new JButton("3"));
		 add(new JButton("4"));
		 add(new JButton("5"));
		 add(new JButton("6"));
		 add(new JButton("7"));
		 add(new JButton("8"));
		 add(new JButton("9"));
		 add(new JButton("10"));
		 add(new JButton("11"));
		 add(new JButton("12"));
		 add(new JButton("13"));
		 add(new JButton("14"));
		 add(new JButton("15")); 
		 */
		
	 setVisible(true);
		
	}
	

	public static void main(String[] arg) {
		SwingUtilities.invokeLater(GridLayOutEjemplo::new);
	}
	

}
