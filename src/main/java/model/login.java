package model;

public class login {
	private String email;
	private String senha;
	
	public login() {

		this.email = "";
		this.senha = "";
	}
	
	public login(String email, String senha) {

		this.email = email;

		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	@Override
	public String toString() {
		return "login [email=" + email + ", senha=" + senha + "]";
	}	
}