package apresentacao;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel {

	boolean jogador1_turno;
	Random random = new Random();
	JLabel mensagem = new JLabel("");

	

	public Display() {
		
		setBackground(Color.gray);
		mensagem.setFont(new Font("Calibri", Font.BOLD, 26));

		verificarQuemComecaJogando();

		add(mensagem);
	}

	public void verificarQuemComecaJogando() {

		if (random.nextInt(2) == 0) {
			jogador1_turno = true;
			mensagem.setText("É a vez de 'X'");

		} else {
			jogador1_turno = false;
			mensagem.setText("É a vez de 'O'");
		}

	}

	
	
	public void setMensagem(String novoTexto) {
		mensagem.setText(novoTexto);
	}

	public boolean isJogador1_turno() {
		return jogador1_turno;
	}

	public void setJogador1_turno(boolean jogador1_turno) {
		this.jogador1_turno = jogador1_turno;
	}
	
	
	
	
	
	
}
