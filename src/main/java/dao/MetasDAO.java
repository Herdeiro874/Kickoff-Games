package dao;

import model.metas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class MetasDAO extends DAO {	
	public MetasDAO() {
		super();
		conectar();
	}
	
	
	public void finalize() {
		close();
	}
	
	// id,idaluno,jogo,treino,anotacoes,objetivo,observacoes,lapide
	public boolean insert(metas produto) {
		boolean status = false;
		try {
			String sql = "INSERT INTO metas (id,idaluno,jogo,treino,anotacoes,objetivo,observacoes,lapide) "
		               + "VALUES ((Select MAX(id) AS MaiorId from metas) + 1 ,?,?,?,?,?,?,?);";
			PreparedStatement st = conexao.prepareStatement(sql);
			st.setString(1, produto.getIdAluno());
			st.setString(2, produto.getJogo());
			st.setString(3, produto.getTreino());
			st.setString(4, produto.getAnotacoes());
			st.setString(5, produto.getObjetivo());
			st.setString(6, produto.getObservacoes());
			st.setBoolean(7, produto.getLapide());
			st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  // Dica
			throw new RuntimeException(u);
		}
		return status;
	}

	
	public metas get(int id) {
		metas produto = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM metas WHERE id="+id;
			ResultSet rs = st.executeQuery(sql);	
	        if(rs.next()){            
	        	 produto = new metas(rs.getInt("id"), rs.getString("idaluno"),rs.getString("jogo"), rs.getString("treino"), rs.getString("anotacoes"), rs.getString("objetivo"), rs.getString("observacoes"),rs.getBoolean("lapide")); 

	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return produto;
	}
	
	
	public List<metas> get() {
		return get("");
	}

	
	public List<metas> getOrderByID() {
		return get("id");		
	}
	
	public List<metas> getOrderByIdAluno() {
		return get("idaluno");		
	}
	
	
	public List<metas> getOrderByJogo() {
		return get("jogo");		
	}
	
	public List<metas> getOrderByTreino() {
		return get("treino");		
	}
	
	public List<metas> getOrderByAnotacoes() {
		return get("anotacoes");		
	}
	
	public List<metas> getOrderByObjetivo() {
		return get("objetivo");		
	}
	
	public List<metas> getOrderByObservacoes() {
		return get("observacoes");		
	}
	
	
	public List<metas> getOrderByLapide() {
		return get("lapide");		
	}


	
	
	private List<metas> get(String orderBy) {
		List<metas> produtos = new ArrayList<metas>();
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM metas" + ((orderBy.trim().length() == 0) ? "" : (" ORDER BY " + orderBy));
			ResultSet rs = st.executeQuery(sql);	           
	        while(rs.next()) {	            	
	        	metas p = new metas(rs.getInt("id"), rs.getString("idaluno"),rs.getString("jogo"), rs.getString("treino"), rs.getString("anotacoes"), rs.getString("objetivo"), rs.getString("observacoes"),rs.getBoolean("lapide"));
	            produtos.add(p);
	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return produtos;
	}
	
	// id,idaluno,jogo,treino,anotacoes,objetivo,observacoes,lapide
	public boolean update(metas produto) {
		boolean status = false;
		try {  
			String sql = "UPDATE metas SET idaluno = ?,"
		                + "jogo = ?,"
					   + "treino = ?," 
					   + "anotacoes = ?,"
                  + "objetivo = ?,"
                  + "observacoes = ?,"
                  + "lapide = ? "
					   + "WHERE id = ?";
			PreparedStatement st = conexao.prepareStatement(sql);
			st.setString(1, produto.getIdAluno());
			st.setString(1, produto.getJogo());
			st.setString(1, produto.getTreino());
			st.setString(1, produto.getAnotacoes());
			st.setString(1, produto.getObjetivo());
			st.setString(1, produto.getObservacoes());
			st.setBoolean(1, produto.getLapide());
			st.setInt(1, produto.getId());
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
			st.executeUpdate("DELETE FROM metas WHERE id = " + id);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
}