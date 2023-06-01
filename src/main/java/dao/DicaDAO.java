package dao;

import model.dica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class DicaDAO extends DAO {	
	public DicaDAO() {
		super();
		conectar();
	}
	
	
	public void finalize() {
		close();
	}
	
	
	public boolean insert(dica produto) {
		boolean status = false;
		try {
			String sql = "INSERT INTO dica (id,jogo,habilidade,categoria,dificuldade,descricao,nota,midia,urlmidia,lapide) "
		               + "VALUES ((Select MAX(id) AS MaiorId from Dica) + 1 ,?,?,?,?,?,?,?,?,?);";
			PreparedStatement st = conexao.prepareStatement(sql);
			st.setString(1, produto.getJogo());
			st.setString(2, produto.getHabilidade());
			st.setString(3, produto.getCategoria());
			st.setString(4, produto.getDificuldade());	
			st.setString(5, produto.getDescricao());	
			st.setInt(6, produto.getNota());
			st.setString(7, produto.getMidia());	
			st.setString(8, produto.getUrlMidia());
			st.setBoolean(9, produto.getLapide());			
			st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}

	
	public dica get(int id) {
		dica produto = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM dica WHERE id="+id;
			ResultSet rs = st.executeQuery(sql);	
	        if(rs.next()){            
	        	 produto = new dica(rs.getInt("id"), rs.getString("jogo"), rs.getString("habilidade"), rs.getString("categoria"), rs.getString("dificuldade"), rs.getString("descricao"), rs.getInt("nota"), rs.getString("midia"), rs.getString("urlmidia"), rs.getBoolean("lapide")); 

	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return produto;
	}
	
	
	public List<dica> get() {
		return get("");
	}

	
	public List<dica> getOrderByID() {
		return get("id");		
	}
	
	
	public List<dica> getOrderByJogo() {
		return get("jogo");		
	}
	
	
	public List<dica> getOrderByHabilidade() {
		return get("habilidade");		
	}

   public List<dica> getOrderByCategoria() {
		return get("categoria");		
	}

   public List<dica> getOrderByDificuldade() {
		return get("dificuldade");		
	}

   public List<dica> getOrderByDescricao() {
		return get("descricao");		
	}

   public List<dica> getOrderByNota() {
		return get("nota");		
	}

   public List<dica> getOrderByMidia() {
		return get("midia");		
	}
   
   public List<dica> getOrderByUrlmidia() {
		return get("urlmidia");		
	}

   public List<dica> getOrderByLapide() {
		return get("lapide");		
	}	



	
	
	private List<dica> get(String orderBy) {
		List<dica> produtos = new ArrayList<dica>();
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM dica" + ((orderBy.trim().length() == 0) ? "" : (" ORDER BY " + orderBy));
			ResultSet rs = st.executeQuery(sql);	           
	        while(rs.next()) {	            	
	        	dica p = new dica(rs.getInt("id"), rs.getString("jogo"), rs.getString("habilidade"), 
	        			                rs.getString("categoria"), rs.getString("dificuldade"), rs.getString("descricao"), 
                                  rs.getInt("nota"), rs.getString("midia"), rs.getString("urlmidia"), rs.getBoolean("lapide"));
	            produtos.add(p);
	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return produtos;
	}
	
	
	public boolean update(dica produto) {
		boolean status = false;
		try {  
			String sql = "UPDATE dica SET jogo = ?,"
					   + "habilidade = ?," 
					   + "categoria = ?,"
                  + "dificuldade = ?,"
                  + "descricao = ?,"
                  + "nota = ?,"
                  + "midia = ?, "
				  + "urlmidia = ?,"
				  + "lapide = ? "
					   + "WHERE id = ?";
			PreparedStatement st = conexao.prepareStatement(sql);
			st.setString(1, produto.getJogo());
			st.setString(2, produto.getHabilidade());
			st.setString(3, produto.getCategoria());
			st.setString(4, produto.getDificuldade());	
			st.setString(5, produto.getDescricao());	
			st.setInt(6, produto.getNota());
			st.setString(7, produto.getMidia());	
			st.setString(8, produto.getUrlMidia());
			st.setBoolean(9, produto.getLapide());	
			st.setInt(10, produto.getId());			
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
			st.executeUpdate("DELETE FROM dica WHERE id = " + id);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
}