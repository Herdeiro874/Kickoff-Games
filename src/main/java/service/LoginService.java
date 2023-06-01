package service;

import java.util.Scanner;
import java.io.File;
import java.util.List;

import dao.DAO;
import dao.loginDAO;
import model.login;
import spark.Request;
import spark.Response;
import com.google.gson.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class LoginService {

	private loginDAO produtoDAO = new loginDAO();
	private String form;
	private final int FORM_INSERT = 1;
	private final int FORM_DETAIL = 2;
	private final int FORM_UPDATE = 3;
	private final int FORM_ORDERBY_CODIGO = 1;
	private final int FORM_ORDERBY_NOME = 2;
	private final int FORM_ORDERBY_CURSO = 3;
	
	
	public LoginService() {
		makeForm();
	}

	
	public void makeForm() {
		makeForm(FORM_INSERT, new login(), FORM_ORDERBY_NOME);
	}

	
	public void makeForm(int orderBy) {
		makeForm(FORM_INSERT, new login(), orderBy);
	}

	
	public void makeForm(int tipo, login produto, int orderBy) {
		String nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/usuario/cad_usuario.html";
		form = "";
		try{
			Scanner entrada = new Scanner(new File(nomeArquivo));
		    while(entrada.hasNext()){
		    	form += (entrada.nextLine() + "\n");
		    }
		    entrada.close();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
		
	}
	
	public void makeForme() {
		String nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/usuario/login.html";
		form = "";
		try{
			Scanner entrada = new Scanner(new File(nomeArquivo));
		    while(entrada.hasNext()){
		    	form += (entrada.nextLine() + "\n");
		    }
		    entrada.close();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
		
	}

	
	public Object insert(Request request, Response response) throws Exception {
		
		Gson gson = new Gson(); 
		login loginer = gson.fromJson(request.body(), login.class);
		
		
        String resp ="";

        loginer.setSenha(DAO.toMD5(loginer.getSenha()));
		
		if(produtoDAO.insert(loginer) == true) {
            resp = "login () inserido!";
            response.status(201); // 201 Created
		}
			
		makeForm();
		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}
	
	public Object autenticar(Request request, Response response) {
		
		Gson gson = new Gson(); 
		login loginer = gson.fromJson(request.body(), login.class);
		
		
        String resp ="false";

		
        login blabla = produtoDAO.get1(loginer.getEmail());
        if(blabla.getSenha()== loginer.getSenha()) {
        	resp = "true";
        }

			

		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}

	
	public Object get(Request request, Response response) throws Exception {
		String email = request.params(":email");		
		login produto = (login) produtoDAO.get1(email);
		
		if (produto != null) {
			response.status(200); // success
			makeForm(FORM_DETAIL, produto, FORM_ORDERBY_NOME);
        } else {
            response.status(404); // 404 Not found
            String resp = "Produto " + email + " não encontrado.";
    		makeForm();
    		form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");     
        }

		return form;
	}

	public Object get2(Request request, Response response) {

    		makeForme();
    		form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">");     
        

		return form;
	}

	
	
	public Object getToUpdate(Request request, Response response) {
		String email = request.params(":email");		
		login produto = (login) produtoDAO.get1(email);
		if (produto != null) {
			response.status(200); // success
			makeForm(FORM_UPDATE, produto, FORM_ORDERBY_NOME);
        } else {
            response.status(404); // 404 Not found
            String resp = "Aluno " + email + " não encontrado.";
    		makeForm();
    		form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");     
        }
 
		return form;
	}
	
	
	public Object getAll(Request request, Response response) {
		int orderBy = Integer.parseInt(request.params(":orderby"));
		makeForm(orderBy);
	    response.header("Content-Type", "text/html");
	    response.header("Content-Encoding", "UTF-8");
		return form;
	}			
	
	public Object update(Request request, Response response) {
		String email = request.params(":email");
		login produto = produtoDAO.get1(email);
        String resp = "";       

        if (produto != null) {
        	produto.setSenha(request.queryParams("senha"));
        	produtoDAO.update(produto);
        	response.status(200); // success
            resp = "Aluno (ID " + produto.getEmail() + ") atualizado!";
        } else {
            response.status(404); // 404 Not found
            resp = "Aluno (ID \" + produto.getEmail() + \") não encontrado!";
        }
		makeForm();
		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}

	
	public Object delete(Request request, Response response) {
		String email = request.params(":email");
        login produto = produtoDAO.get1(email);
        String resp = "";       

        if (produto != null) {
            produtoDAO.delete(email);
            response.status(200); // success
            resp = "Produto (" + email + ") excluído!";
        } else {
            response.status(404); // 404 Not found
            resp = "Produto (" + email + ") não encontrado!";
        }
		makeForm();
		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}
}