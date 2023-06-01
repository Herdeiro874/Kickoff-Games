package model;

//id,idAluno,jogo,treino,anotacoes,objetivo,observacoes,lapide
public class metas {
	private int id;
	private String idAluno;
	private String jogo;
	private String treino;
	private String anotacoes;
	private String objetivo;
	private String observacoes;
	private boolean lapide;

	
	public metas() {
        this.id = -1;
        this.idAluno = "";
		this.jogo = "";
		this.treino = "";
		this.anotacoes = "";
		this.objetivo = "";
		this.observacoes = "";
		this.lapide = false;
	}
	
	public metas(int id,String idAluno, String jogo,String treino,String anotacoes,String objetivo,String observacoes,boolean lapide ) {

        this.id = id;
        this.idAluno = idAluno ;
		this.jogo = jogo;
		this.treino = treino;
		this.anotacoes = anotacoes;
		this.objetivo = objetivo;
		this.observacoes = observacoes;
		this.lapide = lapide;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(String idAluno) {
		this.idAluno = idAluno;
	}
	
	public String getJogo() {
		return jogo;
	}

	public void setJogo(String jogo) {
		this.jogo = jogo;
	}

	public String getTreino() {
		return treino;
	}

	public void setTreino(String treino) {
		this.treino = treino;
	}
	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}
	//id,idAluno,jogo,treino,anotacoes,objetivo,observacoes,lapide	
	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	public boolean getLapide() {
		return lapide;
	}

	public void setLapide(boolean lapide) {
		this.lapide = lapide;
	}
	//id,idAluno,jogo,treino,anotacoes,objetivo,observacoes,lapide
	
	@Override
	public String toString() {
		return "Metas [ID = " + id +" idALuno = "+idAluno+ " Jogo = " + jogo + " Treino = "+ treino + " Anotacoes = "+anotacoes +" Objetivo = "+objetivo + " Observacoes = " +observacoes+ " Lapide = "+lapide +"]";
	}	
}