package packageWireframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class SalvarListener implements ActionListener{
	
	//Filme filme;
	JTextArea caixa_titulo;
	JTextArea caixa_sinopse;
	JComboBox<String> comboBoxGeneros;
	ButtonGroup verEm;
	JCheckBox assistido;
	StarRater starRater;
	
		
	public SalvarListener(Filme filme, JTextArea caixa_titulo, JTextArea caixa_sinopse,
			JComboBox<String> comboBoxGeneros, ButtonGroup verEm, JCheckBox assistido, StarRater starRater) {
		
		this.caixa_titulo=caixa_titulo;
		this.caixa_sinopse=caixa_sinopse;
		this.comboBoxGeneros=comboBoxGeneros;
		this.verEm = verEm;
		this.assistido = assistido;
		this.starRater = starRater;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Filme filme = new Filme(caixa_titulo, caixa_sinopse, comboBoxGeneros, verEm, assistido, starRater);
		filme.imprimeFilme();
	}

}
