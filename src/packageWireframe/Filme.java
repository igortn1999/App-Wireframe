package packageWireframe;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Filme {
	
	private String titulo;
	private String sinopse;
	private String genero;
	private String verEm;
	private boolean assistido;
	private float estrelas;
	
	private String jaViu;
	
	public Filme() {
		
	}
	
	public Filme(JTextArea caixa_titulo, JTextArea caixa_sinopse,
			JComboBox<String> comboBoxGeneros, ButtonGroup verEm, JCheckBox assistido, StarRater starRater) {
		this.titulo=caixa_titulo.getText();
		this.sinopse=caixa_sinopse.getText();
		this.genero=comboBoxGeneros.getSelectedItem().toString();
		this.verEm = verEm.getSelection().getActionCommand();
		this.assistido = assistido.isSelected();
		this.estrelas = starRater.getRating();
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




	public boolean isAssistido() {
		return assistido;
	}




	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}




	public float getEstrelas() {
		return estrelas;
	}




	public void setEstrelas(float estrelas) {
		this.estrelas = estrelas;
	}
	
	public String getJaViu() {
		if (isAssistido() == false) this.jaViu="N�o";
		else this.jaViu = "Sim";
		return this.jaViu;
	}




	public void imprimeFilme() {
		System.out.println("\n------------------------------------------------");
		System.out.println("\nTitulo: "+ this.getTitulo());
		System.out.println("\nSinopse: " + this.getSinopse());
		System.out.println("\nGenero: " + this.getGenero());
		System.out.println("\nFilme dispon�vel em: " + this.getVerEm());
		System.out.println("\nAssistido: " + this.getJaViu());
		System.out.println("\nClassifica��o: "+ this.getEstrelas() + " Estrelas");
		System.out.println("------------------------------------------------");
	}
	

}
