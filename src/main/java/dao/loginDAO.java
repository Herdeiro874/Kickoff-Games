package dao;

import model.login;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class loginDAO extends DAO {	
	public loginDAO() {
		super();
		conectar();
	}
	
	
	public void finalize() {
		close();
	}
	
	
	public  boolean insert(login produto) {
		boolean status = false;
		try {
			String sql = "INSERT INTO login (email,senha) "
		               + "VALUES (?,?);";
			PreparedStatement st = conexao.prepareStatement(sql);
			st.setString(1, produto.getEmail());
			st.setString(2, produto.getSenha());
			st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}

	
	public login get1(String email) {
		login produto = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM login WHERE email="+email;
			ResultSet rs = st.executeQuery(sql);	
	        if(rs.next()){            
	        	 produto = new login(rs.getString("email"), rs.getString("senha")); 

	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return produto;
	}
	
	
	public List<login> get() {
		return get2("");
	}
	
	public List<login> getOrderByEmail() {
		return get2("email");		
	}
	
	
	public List<login> getOrderBySenha() {
		return get2("senha");			
	}
	
	
	private List<login> get2(String orderBy) {
		List<login> produtos = new ArrayList<login>();
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM login" + ((orderBy.trim().length() == 0) ? "" : (" ORDER BY " + orderBy));
			ResultSet rs = st.executeQuery(sql);	           
	        while(rs.next()) {	            	
	        	login p = new login(rs.getString("email"), rs.getString("senha"));
	            produtos.add(p);
	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return produtos;
	}
	
	
	public boolean update(login produto) {
		boolean status = false;
		try {  
			String sql = "UPDATE login SET email = ?, "
					   + "senha = ?, " 
					   + "WHERE Email = ?";
			PreparedStatement st = conexao.prepareStatement(sql);
			st.setString(1, produto.getEmail());
			st.setString(2, produto.getSenha());
			st.setString(3, produto.getEmail());
			st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	
	public boolean delete(String email) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("DELETE FROM login WHERE email = " + email);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
}