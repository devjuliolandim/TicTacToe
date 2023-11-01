package apresentacao;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Teclado extends JPanel implements ActionListener {

	private JButton[] botoes = new JButton[9];
	String stringDeQuemEAVez = "";
	Display displayInfos = new Display();

	public Teclado(Display displayInfos) {

		this.displayInfos = displayInfos;
		this.setBackground(Color.white);
		this.setLayout(new GridLayout(3, 3));
		adicionarBotoes();

	}

	private void adicionarBotoes() {

		for (int i = 0; i < 9; i++) {
			botoes[i] = new JButton();
			botoes[i].setFocusable(false);
			botoes[i].addActionListener(this);
			botoes[i].setFont(new Font("Arial", Font.BOLD, 120));
			add(botoes[i]);

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 9; i++) {
			if (e.getSource() == botoes[i]) {

				if (displayInfos.isJogador1_turno() == true) {
					botoes[i].setText("X");
					displayInfos.setJogador1_turno(false);
					displayInfos.setMensagem("É a vez de O");
					botoes[i].removeActionListener(this);
					checarVitorias();
					
				} else {
					botoes[i].setText("O");
					displayInfos.setJogador1_turno(true);
					displayInfos.setMensagem("É a vez de X");
					botoes[i].removeActionListener(this);
					checarVitorias();

				}

			}
		}

	}
	
	public void checarVitorias() {
		
		if(botoes[0].getText()== "X" && botoes[1].getText()== "X" && botoes[2].getText()== "X")  {
			xVenceu();
		}else if(botoes[3].getText()== "X" && botoes[4].getText()== "X" && botoes[5].getText()== "X") {
			xVenceu();
		}else if(botoes[6].getText()== "X" && botoes[7].getText()== "X" && botoes[8].getText()== "X") {
			xVenceu();
		}
		
		
		
		
		
		
		
	}
	
	public void xVenceu() {
		displayInfos.setMensagem("X venceu!!!");
		
	}
	

}
