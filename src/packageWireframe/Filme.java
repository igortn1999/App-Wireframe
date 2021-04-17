package packageWireframe;

public class Filme {
	
	private String titulo;
	private String sinopse;
	private String genero;
	private String verEm;
	private boolean viu;
	private float estrelas;
	private String visto;
	
	protected Filme(SalvarListener salvarListener) {
		this.titulo = salvarListener.getTitulo();
		this.sinopse = salvarListener.getSinopse();
		this.genero = salvarListener.getGenero();
		this.verEm = salvarListener.getVerEm();
		this.viu = salvarListener.isAssistiu();
		this.estrelas = salvarListener.getEstrelas();
		this.visto = salvarListener.getVisto();
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

	public float getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(float estrelas) {
		this.estrelas = estrelas;
	}
	
	
	
	public boolean isViu() {
		return viu;
	}

	public void setViu(boolean viu) {
		this.viu = viu;
	}

	public String getVisto() {
		return visto;
	}

	public void setVisto(String visto) {
		this.visto = visto;
	}

	public void imprimeFilme() {
		System.out.println("\n------------------------------------------------");
		System.out.println("\nTitulo: "+ this.getTitulo());
		System.out.println("\nSinopse: " + this.getSinopse());
		System.out.println("\nGenero: " + this.getGenero());
		System.out.println("\nFilme disponível em: " + this.getVerEm());
		System.out.println("\nAssistido: " + this.getVisto());
		System.out.println("\nClassificação: "+ this.getEstrelas() + " Estrelas");
		System.out.println("\n------------------------------------------------");
	}
	

}
