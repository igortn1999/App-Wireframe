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
	
	private String titulo;
	private String sinopse;
	private String genero;
	private String verEm;
	private boolean assistiu;
	private float estrelas;
	
	private String visto;
	
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
		
//		if(assistiu == true) visto = "Sim";
//		else visto = "Não";
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getVerEm() {
		return verEm;
	}

	public void setVerEm(String verEm) {
		this.verEm = verEm;
	}

	public boolean isAssistiu() {
		return assistiu;
	}

	public void setAssistiu(boolean assistiu) {
		this.assistiu = assistiu;
	}

	public float getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(float estrelas) {
		this.estrelas = estrelas;
	}

	public String getVisto() {
		if(assistiu == true) visto = "Sim";
		else visto = "Não";
		return visto;
	}

	public void setVisto(String visto) {
		this.visto = visto;
	}
	
	

}
