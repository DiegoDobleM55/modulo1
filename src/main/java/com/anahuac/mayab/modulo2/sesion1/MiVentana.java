/*package com.anahuac.mayab.modulo2.sesion1;
import javax.swing.*;

public class MiVentana extends JFrame{ 
	
	public static void main(String[] arg) {
		
		MiVentana miVentana = new MiVentana();
		
		miVentana.setBounds(10, 10, 200, 200);
		 
		//miVentana.pack();
		
		miVentana.setVisible(true);
		
	}
	

} */

package com.anahuac.mayab.modulo2.sesion1;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class MiVentana extends JFrame {
		
		private JButton boton1;
		private JButton boton2;
		private JButton boton3;
		private JButton boton4;
		private JButton boton5;
		
		
		public MiVentana() {
			/*boton1 = new JButton("multiplicación");
			boton2 = new JButton("resta");
			boton3 = new JButton("suma");
			boton4 = new JButton("igual");
			boton5 = new JButton("división"); */
			
			boton1 = new JButton("North");
			boton2 = new JButton("East");
			boton3 = new JButton("West");
			boton4 = new JButton("South");
			boton5 = new JButton("Center"); 
			
			
			this.getContentPane().add(boton1, BorderLayout.NORTH);
			this.getContentPane().add(boton2, BorderLayout.EAST);
			this.getContentPane().add(boton3, BorderLayout.WEST);
			this.getContentPane().add(boton4, BorderLayout.SOUTH);
			this.getContentPane().add(boton5, BorderLayout.CENTER);
			
			setTitle("Brujula");
			//setSize(Width: 300, Height:200);
			setSize (300, 200);
			setLocationRelativeTo(null);
			setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
			
			public static void main(String[] arg) {
				MiVentana miVentana = new MiVentana();
				//miVentana.setBounds(10,10,200,200);
				miVentana.pack();
				
			
				
				miVentana.setVisible(true);
		}
		
	}

