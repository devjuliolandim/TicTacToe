package apresentacao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JogoDaVelha extends JFrame {

	Display display = new Display();
	Teclado teclado = new Teclado(display);

	public JogoDaVelha() {

		this.setTitle("Jogo da Velha");
		this.setSize(420, 420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());

		display.setPreferredSize(new Dimension(420, 50));
		add(display, BorderLayout.NORTH);
		add(teclado, BorderLayout.CENTER);

		this.setVisible(true);
	}

}
