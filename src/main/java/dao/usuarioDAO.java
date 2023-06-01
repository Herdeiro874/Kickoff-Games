package dao;
import model.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class usuarioDAO extends DAO {	
	public usuarioDAO() {
		super();
		conectar();
	}
	
	
	public void finalize() {
		close();
	}
	
	
	public boolean insert(usuario produto) {
		boolean status = false;
		try {
			String sql = "INSERT INTO usuario (id,jogo,email,nick,funcao,elo,discord,avatar,descricao,lapide) "
		               + "VALUES ((Select MAX(id) AS MaiorId from usuario) + 1 ,'" + produto.getJogo() + "','"
		               + produto.getEmail() + "','" + produto.getNick() + "','"+ produto.getFuncao() + "','"+ produto.getElo() + "','"+ produto.getDiscord() + "','"+ produto.getAvatar() + "','"+ produto.getDescricao() + "',"+produto.getLapide() + ");";
			PreparedStatement st = conexao.prepareStatement(sql);
			st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}

	
	public usuario get(int id) {
		usuario produto = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM usuario WHERE id="+id;
			ResultSet rs = st.executeQuery(sql);	
	        if(rs.next()){            
	        	 produto = new usuario(rs.getInt("id"), rs.getString("jogo"), rs.getString("email"), rs.getString("nick"), rs.getString("funcao"), rs.getString("elo"), rs.getString("discord"), rs.getString("avatar"), rs.getString("descricao"), rs.getBoolean("Lapide")); 

	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return produto;
	}
	
	
	public List<usuario> get() {
		return get("");
	}

	
	public List<usuario> getOrderByID() {
		return get("id");		
	}
	
	
	public List<usuario> getOrderByJogo() {
		return get("jogo");		
	}
	
	
	public List<usuario> getOrderByEmail() {
		return get("email");		
	}

   public List<usuario> getOrderByNick() {
		return get("nick");		
	}

   public List<usuario> getOrderByFuncao() {
		return get("funcao");		
	}

   public List<usuario> getOrderByElo() {
		return get("elo");		
	}

   public List<usuario> getOrderByDiscord() {
		return get("discord");		
	}

   public List<usuario> getOrderByAvatar() {
		return get("descricao");		
	}

	public List<usuario> getOrderByDescricao() {
		return get("descricao");		
	}

	public List<usuario> getOrderByLapide() {
		return get("lapide");		
	}


	
	
	private List<usuario> get(String orderBy) {
		List<usuario> produtos = new ArrayList<usuario>();
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM usuario" + ((orderBy.trim().length() == 0) ? "" : (" ORDER BY " + orderBy));
			ResultSet rs = st.executeQuery(sql);	           
	        while(rs.next()) {	            	
	        	usuario p = new usuario(rs.getInt("id"), rs.getString("jogo"), rs.getString("email"), 
	        			                rs.getString("nick"), rs.getString("funcao"), rs.getString("elo"), 
                                  rs.getString("discord"), rs.getString("avatar"), rs.getString("descricao")
								  , rs.getBoolean("lapide"));
	            produtos.add(p);
	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return produtos;
	}
	
	
	public boolean update(usuario produto) {
		boolean status = false;
		try {  
			String sql = "UPDATE usuario SET jogo = '" + produto.getJogo() + "',"
					   + "email = '" + produto.getEmail() + "'," 
					   + "nick = '" + produto.getNick() + "',"
                  + "funcao = '" + produto.getFuncao() + "',"
                  + "elo = '" + produto.getElo() + "',"
                  + "discord = '" + produto.getDiscord() + "',"
                  + "avatar = '" + produto.getAvatar() + "',"
				  + "descricao ='" + produto.getDescricao() + "',"
				  + "lapide = " + produto.getLapide() +" "
					   + "WHERE id = " + produto.getId();
			PreparedStatement st = conexao.prepareStatement(sql);
			st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	
	public boolean delete(int id) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("DELETE FROM usuario WHERE id = " + id);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
}