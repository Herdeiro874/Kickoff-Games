package model;

public class usuario {
	private int id;
	private String jogo;
   private String email;
   private String nick;
   private String funcao;
   private String elo;
   private String discord;
   private String avatar;
   private String descricao;
   private Boolean lapide;

	
	public usuario() {

		this.id = '0';
		this.jogo = "";
      this.email="";
      this.nick="";
      this.funcao="";
      this.elo="";
      this.discord="";
      this.avatar="";
      this.descricao="";
      this.lapide=false;

	}
	
	public usuario(int id, String jogo, String email, String nick, String funcao, String elo, String discord, String avatar, String descricao, Boolean lapide) {

		this.id = id;

		this.jogo = jogo;

      this.email= email;

      this.nick = nick;

      this.funcao= funcao;

      this.elo= elo;

      this.discord= discord;

      this.avatar= avatar;

      this.descricao= descricao;

      this.lapide= lapide;

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

   public String getEmail(){
      return email;
   }

   public void setEmail(String email){
      this.email= email;
   }

   public String getNick(){
      return nick;
   }

   public void setNick(String nick){
      this.nick= nick;
   }

   public String getFuncao(){
      return funcao;
   }

   public void setFuncao(String funcao){
      this.funcao= funcao;
   }

   public String getElo(){
      return elo;
   }

   public void setElo(String elo){
      this.elo= elo;
   }

   public String getDiscord(){
      return discord;
   }

   public void setDiscord(String discord){
      this.discord= discord;
   }

   public String getAvatar(){
      return avatar;
   }

   public void setAvatar(String avatar){
      this.avatar= avatar;
   }

   public String getDescricao(){
      return descricao;
   }

   public void setDescricao(String descricao){
      this.descricao= descricao;
   }

   public Boolean getLapide(){
      return lapide;
   }

   public void setLapide(Boolean lapide){
      this.lapide=lapide;
   }




	@Override
	public String toString() {
		return "usuario [id=" + id + ", jogo=" + jogo + ", email=" + email + ", nick=" + nick + ", funcao=" + funcao +", elo=" + elo + ", discord=" + discord + ", avatar=" + avatar + ", descricao=" + descricao + ", lapide=" + lapide +"]";
	}	
}