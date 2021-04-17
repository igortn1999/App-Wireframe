package packageWireframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import packageWireframe.StarRater;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SalvarListener implements ActionListener{
	
	private JTextArea caixa_titulo;
	private JTextArea caixa_sinopse;
	private JComboBox<String> comboBoxGeneros;
	private ButtonGroup ondeVer;
	private JCheckBox assistido;
	private StarRater starRater;
	

	public SalvarListener(JTextArea caixa_titulo, JTextArea caixa_sinopse,
			JComboBox<String> comboBoxGeneros, ButtonGroup ondeVer,
			JCheckBox assistido, StarRater starRater) {
		this.caixa_titulo = caixa_titulo;
		this.caixa_sinopse = caixa_sinopse;
		this.comboBoxGeneros = comboBoxGeneros;
		this.ondeVer = ondeVer;
		this.assistido = assistido;
		this.starRater = starRater;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String titulo = caixa_titulo.getText();
		String sinopse = caixa_sinopse.getText();
		String genero = comboBoxGeneros.getSelectedItem().toString();
		String verEm = ondeVer.getSelection().getActionCommand();
		boolean assistiu = assistido.isSelected();
		float estrelas = starRater.getRating();
		
		String visto;
		if(assistiu == true) visto = "Sim";
		else visto = "Não";
		
		System.out.println("\nTitulo: "+ titulo);
		System.out.println("\nSinopse: " + sinopse);
		System.out.println("\nGenero: " + genero);
		System.out.println("\nFilme disponível em: " + verEm);
		System.out.println("\nAssistido: " + visto);
		System.out.println("\nClassificação: "+ estrelas + " Estrelas");
		System.out.println("\n------------------------------------------------\n");
		
	}

}
