package com.anahuac.mayab.modulo1.sesion5;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestArchivo {

	public static void main(String[] args) {
		
		String nombreArchivo = "C:\\miclase\\prueba.txt";
		try (FileWriter archivo = new FileWriter(nombreArchivo))
        {
            PrintWriter pw = new PrintWriter(archivo);
            pw.print("Hola, bienvenido al diplomado\n");
            pw.print("\ten Java");
            pw.print("\nEsta es otra linea");
        } catch (Exception e) {
        	System.out.println("No puede abrir el archivo");
            e.printStackTrace();
        }

	}

}
