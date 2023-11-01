package apresentacao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaInicial extends JFrame implements ActionListener {

	private JButton iniciarNovoJogo = new JButton();
	private JButton opcoes = new JButton();
	private JButton sair = new JButton();

	private JPanel menu = new JPanel();

	public JanelaInicial() {

		this.setTitle("Jogo da Velha");
		this.setSize(420, 420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		personalizarBotoes();
		personalizarPainel();

		this.setVisible(true);
	}

	private void personalizarPainel() {
		menu.setBackground(Color.pink);
		menu.setLayout(null);
		menu.add(iniciarNovoJogo);
		menu.add(opcoes);
		menu.add(sair);

		add(menu);
	}

	private void personalizarBotoes() {

		iniciarNovoJogo.setText("Iniciar Novo Jogo");
		iniciarNovoJogo.setBackground(Color.white);
		iniciarNovoJogo.setFocusable(false);
		iniciarNovoJogo.setBounds(125, 50, 150, 25);
		iniciarNovoJogo.addActionListener(this);

		opcoes.setText("Opções");
		opcoes.setBackground(Color.white);
		opcoes.setFocusable(false);
		opcoes.setBounds(125, 150, 150, 25);

		sair.setText("Sair");
		sair.setBackground(Color.white);
		sair.setFocusable(false);
		sair.setBounds(125, 250, 150, 25);
		sair.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == iniciarNovoJogo) {

			this.dispose();
			new JogoDaVelha();

		} else if (e.getSource() == sair) {

			System.exit(0);
		}

	}

}
