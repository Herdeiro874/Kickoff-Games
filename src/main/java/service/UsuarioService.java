package service;

import java.util.Scanner;
import java.io.File;
import java.util.List;
import dao.usuarioDAO;
import model.usuario;
import spark.Request;
import spark.Response;
import com.google.gson.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class UsuarioService {

	private usuarioDAO usuariorDAO = new usuarioDAO();
	private String form;
	private final int FORM_INSERT = 1;
	private final int FORM_DETAIL = 2;
	private final int FORM_UPDATE = 3;
	private final int FORM_ORDERBY_CODIGO = 1;
	private final int FORM_ORDERBY_NOME = 2;
	private final int FORM_ORDERBY_CURSO = 3;
	
	
	public UsuarioService() {
		makeForm();
	}

	
	public void makeForm() {
		makeForm(FORM_INSERT, new usuario(), FORM_ORDERBY_NOME);
	}

	
	public void makeForm(int orderBy) {
		makeForm(FORM_INSERT, new usuario(), orderBy);
	}

	
	public void makeForm(int tipo, usuario produto, int orderBy) {
		
		String nomeArquivo = "";

			nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/cad_coachs/coachs.html";

		
		form = "";
		try{
			Scanner entrada = new Scanner(new File(nomeArquivo));
		    while(entrada.hasNext()){
		    	form += (entrada.nextLine() + "\n");
		    }
		    entrada.close();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
		
		String list = "";
		List<usuario> coachs;
		               	
		coachs = usuariorDAO.getOrderByID();	               

		
				for (usuario p : coachs) {
					
					String jog = p.getJogo();
					


						if(p.getLapide() == false) {

									list += "<div class=\"col-12\">\n";
										list+= "                        <p><h3><b> "+p.getJogo()+" </b></h3></p>\n";
										list+= "                            <p><b>Email: </b>"+p.getEmail()+"</p>\n";
										list+= "                            <p><b>Dificuldade: </b>"+p.getNick()+"</p>\n";
										list+= "                            <p><b>Descrição: </b> "+p.getDescricao()+" </p>\n";
										list+= "                            <p><b>Categoria: </b>"+p.getNick()+"</p>\n";
										list+= "                            <p><b>Dificuldade: </b>"+p.getElo()+"</p>\n";
										list+= "                            <p><b>Descrição: </b> "+p.getDiscord()+" </p>\n";
										list+= "                            <p><b>Dificuldade: </b>"+p.getAvatar()+"</p>\n";
									    list+= "                    </div>";
						}
					
					
				}
				
				form = form.replaceFirst("<LOLAULAS>", list);			

	}

	
	public void makeForme() {
		String nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/cad_coachs/coach.html";

	
	form = "";
	try{
		Scanner entrada = new Scanner(new File(nomeArquivo));
	    while(entrada.hasNext()){
	    	form += (entrada.nextLine() + "\n");
	    }
	    entrada.close();
	}  catch (Exception e) { System.out.println(e.getMessage()); }
	
	String list = "";
	List<usuario> coachs;
	               	
	coachs = usuariorDAO.getOrderByID();	               

	
			for (usuario p : coachs) {
								


					//if(p.getId() == 1) {

						list += "<div "+p.getId()+" class=selCard>";
				        list += "<p><b>ID: </b>"+p.getId()+"  ";
				        list += " <b>Jogo: </b>"+p.getJogo()+"  ";
				        list += " <b>Email: </b>"+p.getEmail()+"  ";
				        list += " <b>Nick: </b>"+p.getNick()+"  ";
				        list += " <b>Função: </b>"+p.getFuncao()+"  ";
				        list += " <b>Elo: </b>"+p.getElo()+" ";
				        list += " <b>Discord: </b>"+p.getDiscord()+"</p>";
				        list += "<p><b>Descrição: </b>"+p.getDescricao()+"</p>";
				        list += "</div>";
					//}
				
				
			}
			
			form = form.replaceFirst("<LOLAULAS>", list);				

	}
		
		
	public void makeFormi(usuario metarid) {
		
		String nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/perfil/perfil.html";

		form = "";
		try{
			Scanner entrada = new Scanner(new File(nomeArquivo));
		    while(entrada.hasNext()){
		    	form += (entrada.nextLine() + "\n");
		    }
		    entrada.close();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
		
		String list = "";
		List<usuario> coachs;       
		
		coachs = usuariorDAO.getOrderByID();	               

				for (usuario p : coachs) {
					
						if(p.getId() == 5) {
		                    list += "<div class=\"flex\">";
		                    if (p.getAvatar().charAt(0) == 'M') list += "<div class=\"col-4 arruma\"><img src=\"../../../../KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/assets/imagens/avatares/moai.png\" class=\"pfp col-12 \"></div>";
		                    else if (p.getAvatar().charAt(0) == 'S') list += "<div class=\"col-4 arruma\"><img src=\"../../../../KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/assets/imagens/avatares/nerd.png\" class=\"pfp col-12 \"></div>";
		                    else list += "<div class=\"col-4 arruma\"><img src=\"../../../../KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/assets/imagens/avatares/default.png\" class=\"pfp col-12 \"></div>";
		                    list += "<div class=\"col-8 arruma\"><b><h1 class=\"nome big\">"+ p.getNick()+"</h1></b></div></div>";
		                    list += "<div class=\"flex\" id=\"\">";
		                    list += "<div class=\"col-4 arruma minipadim\">";
		                    list += "<p class=\"padimt\"><b>Jogo: </b>"+ p.getJogo()+"</p>";
		                    list += "<p><b>Discord: </b>"+ p.getDiscord()+"</p>";
		                    list += "<p><b>Função: </b>"+ p.getFuncao()+"</p>";
		                    list += "<p><b>Elo: </b>"+ p.getElo()+"</p></div>";
		                    list += "<div class=\"col-8 arruma\"><p class=\"padimnn\">"+ p.getDescricao()+"</p></div></div>";
						}
					
					
				}
				
				form = form.replaceFirst("<USUARIOAULAS>", list);	
			}

	public void makeForma() {
		
		String nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/perfil/perfil.html";
		form = "";
		try{
			Scanner entrada = new Scanner(new File(nomeArquivo));
		    while(entrada.hasNext()){
		    	form += (entrada.nextLine() + "\n");
		    }
		    entrada.close();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
		
	
	}
	

	
	public Object insert(Request request, Response response) {
		
		Gson gson = new Gson(); 
		usuario loginer = gson.fromJson(request.body(), usuario.class);
		
		
        String resp ="";

		
		
		if(usuariorDAO.insert(loginer) == true) {
            resp = "login () inserido!";
            response.status(201); // 201 Created
		}
			
		makeForm();
		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}

	
	public Object get(Request request, Response response) {
		
		int id = Integer.parseInt(request.params(":id"));		
		usuario video =  usuariorDAO.get(id);
		
		if (video != null) {
			response.status(200); // success
			makeForm(FORM_DETAIL, video, FORM_ORDERBY_NOME);
        } else {
            response.status(404); // 404 Not found
            String resp = "Dica " + id + " não encontrado.";
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
	
	public Object get3(Request request, Response response) {
		Gson gson = new Gson(); 
	  usuario logina = gson.fromJson(request.body(), usuario.class);

		makeFormi(logina);
		form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">");     
   

	return form;
}

	

	
	public Object getToUpdate(Request request, Response response) {
		
		int id = Integer.parseInt(request.params(":id"));			
		usuario produto = (usuario) usuariorDAO.get(id);
		if (produto != null) {
			response.status(200); // success

			makeForm(FORM_UPDATE, produto, FORM_ORDERBY_NOME);
        } else {
            response.status(404); // 404 Not found
            String resp = "Aluno " + id + " não encontrado.";
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
		Gson gson = new Gson(); 
		usuario loginer = gson.fromJson(request.body(), usuario.class);
		
		
        String resp ="";

		
		
		if(usuariorDAO.update(loginer) == true) {
            resp = "login () inserido!";
            response.status(201); // 201 Created
		}
			
		makeForm();
		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}

	
	public Object delete(Request request, Response response) {
		Gson gson = new Gson(); 
		usuario loginer = gson.fromJson(request.body(), usuario.class);
        String resp = "";       

        
            usuariorDAO.delete(loginer.getId());

            resp = "Produto () excluído!";
        

		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}
}