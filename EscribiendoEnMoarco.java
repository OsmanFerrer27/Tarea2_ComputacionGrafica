package graficos;

//Osman Ferrer. C.I. 28.271.330. 10/06/23. Computacion Grafica. TAREA II

import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

public class EscribiendoEnMoarco {

	public static void main(String[] args) {
		MarcoConTexto mimarco = new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoConTexto extends JFrame {
	
	public MarcoConTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400,200);
		setTitle("Primer Texto");
		
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawString("Clase de Computacion Grafica" ,100, 100);
		
	}
}