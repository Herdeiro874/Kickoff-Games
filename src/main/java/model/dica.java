package model;

public class dica {
	private int id;
	private String jogo;
	private String habilidade;
	private String categoria;
	private String dificuldade;
	private String descricao;
	private int nota;
	private String midia;
	private String urlmidia;
	private boolean lapide;
	
	public dica() {
        this.id = -1;
		this.jogo = "";
		this.habilidade = "";
		this.categoria = "";
		this.dificuldade = "";
		this.descricao = "";
		this.nota = 0;
		this.urlmidia = "";
		this.midia = "";
		this.lapide = false;
	}
	
	public dica(int id, String jogo,String habilidade,String categoria,String dificuldade,String descricao,int nota,String midia,String urlmidia,boolean lapide ) {

        this.id = id;
		this.jogo = jogo;
		this.habilidade = habilidade;
		this.categoria = categoria;
		this.dificuldade = dificuldade;
		this.descricao = descricao;
		this.nota = nota;
		this.midia = midia;
		this.urlmidia = urlmidia;
		this.lapide = lapide;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJogo() {
		return jogo;
	}

	public void setJogo(String jogo) {
		this.jogo = jogo;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}
	
	public String getUrlMidia() {
		return urlmidia;
	}

	public void setUrlMidia(String urlmidia) {
		this.urlmidia = urlmidia;
	}
	
	public boolean getLapide() {
		return lapide;
	}

	public void setUrlMidia(boolean lapide) {
		this.lapide = lapide;
	}
	
	@Override
	public String toString() {
		return "dica[ID = " + id + "Jogo = " + jogo + "Habilidade = "+ habilidade + "Categria = "+categoria +"Dificuldade = "+ "Descricao = "+ descricao +"Nota = "+nota+"Midia = " + midia +"Url Midia = " + urlmidia + "]";
	}	
}