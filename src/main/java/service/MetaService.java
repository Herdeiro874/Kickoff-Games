package service;

import java.util.Scanner;
import java.io.File;
import java.util.List;
import dao.MetasDAO;
import model.metas;
import spark.Request;
import spark.Response;
import com.google.gson.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class MetaService {

	private MetasDAO MetarDAO = new MetasDAO();
	private String form;
	private final int FORM_INSERT = 1;
	private final int FORM_DETAIL = 2;
	private final int FORM_UPDATE = 3;
	private final int FORM_ORDERBY_CODIGO = 1;
	private final int FORM_ORDERBY_NOME = 2;
	private final int FORM_ORDERBY_CURSO = 3;
	
	
	public MetaService() {
		makeForm();
	}

	
	public void makeForm() {
		makeForm(FORM_INSERT, new metas(), FORM_ORDERBY_NOME);
	}

	
	public void makeForm(int orderBy) {
		makeForm(FORM_INSERT, new metas(), orderBy);
	}

	
	public void makeForm(int tipo, metas produto, int orderBy) {
		
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
		List<metas> coachs;
		               	
		coachs = MetarDAO.getOrderByID();	               

		
				for (metas p : coachs) {
					
					String jog = p.getJogo();
					


						if(p.getLapide() == false) {

									list += "<div class=\"col-12\">\n";
									list += "<div "+p.getId()+" class=selCard>";
							        list += "<p><b>ID: </b>"+p.getId()+"  ";
							        list += " <b>Jogo: </b>"+p.getJogo()+"  ";
							        list += " <b>IdAluno: </b>"+p.getIdAluno()+"  ";
							        list += " <b>Treino: </b>"+p.getTreino()+"  ";
							        list += " <b>Anotacoes: </b>"+p.getAnotacoes()+"  ";
							        list += " <b>Objetivo: </b>"+p.getObjetivo()+"  ";
							        list += " <b>Observacoes: </b>"+p.getObservacoes()+" ";
							        list += "</div>";
									    list+= "                    </div>";
						}
					
					
				}
				
				form = form.replaceFirst("<LOLAULAS>", list);			

	}

	
	public void makeForme() {
		String nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/perfil/metas.html";

	
	form = "";
	try{
		Scanner entrada = new Scanner(new File(nomeArquivo));
	    while(entrada.hasNext()){
	    	form += (entrada.nextLine() + "\n");
	    }
	    entrada.close();
	}  catch (Exception e) { System.out.println(e.getMessage()); }
	
	String list = "";
	List<metas> coachs;
	               	
	coachs = MetarDAO.getOrderByID();	               

	
			for (metas p : coachs) {
								


					if(p.getLapide() == false) {

						list += "<div "+p.getId()+" class=selCard>";
				        list += "<p><b>ID: </b>"+p.getId()+"  ";
				        list += " <b>Jogo: </b>"+p.getJogo()+"  ";
				        list += " <b>Treino: </b>"+p.getTreino()+"  ";
				        list += " <b>Anotacoes: </b>"+p.getAnotacoes()+"  ";
				        list += " <b>Objetivo: </b>"+p.getObjetivo()+"  ";
				        list += " <b>Observacoes: </b>"+p.getObservacoes()+" ";
				        list += "</div>";
					}
				
				
			}
			
			form = form.replaceFirst("<LOLAULAS>", list);				

	}
		
		
	public void makeFormi() {
		
		String nomeArquivo = "";
		/*if(orderBy == 1) {
			nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/coachs/coachslol.html";
		}else if(orderBy == 2) {
			nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/coachs/coachsvalo.html";
		}else {
			nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/coachs/cadastro_coachs.html";
		}*/
		
		form = "";
		try{
			Scanner entrada = new Scanner(new File(nomeArquivo));
		    while(entrada.hasNext()){
		    	form += (entrada.nextLine() + "\n");
		    }
		    entrada.close();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
		
		String list = "";
		List<metas> coachs;
		               	
		coachs = MetarDAO.getOrderByID();	               

		
				for (metas p : coachs) {
					
					String jog = p.getJogo();
					


						if(p.getLapide() == false) {

									list += "<div class=\"col-12\">\n";
									list += "<div "+p.getId()+" class=selCard>";
							        list += "<p><b>ID: </b>"+p.getId()+"  ";
							        list += " <b>Jogo: </b>"+p.getJogo()+"  ";
							        list += " <b>Treino: </b>"+p.getTreino()+"  ";
							        list += " <b>Anotacoes: </b>"+p.getAnotacoes()+"  ";
							        list += " <b>Objetivo: </b>"+p.getObjetivo()+"  ";
							        list += " <b>Observacoes: </b>"+p.getObservacoes()+" ";
							        list += "</div>";
									    list+= "                    </div>";
						}
					
					
				}
				
				form = form.replaceFirst("<LOLAULAS>", list);	
			}

	

	
	public Object insert(Request request, Response response) {
		
		Gson gson = new Gson(); 
		metas loginer = gson.fromJson(request.body(), metas.class);
  System.out.print(loginer.getId());
		
        String resp ="";

		
		
		if(MetarDAO.insert(loginer) == true) {
            resp = "login () inserido!";
            response.status(201); // 201 Created
		}
			
		makeForm();
		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}

	
	public Object get(Request request, Response response) {
		
		int id = Integer.parseInt(request.params(":id"));		
		metas video =  MetarDAO.get(id);
		
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
		
		
		makeFormi();
		form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">");     
   

	return form;
}

	

	
	public Object getToUpdate(Request request, Response response) {
		
		int id = Integer.parseInt(request.params(":id"));			
		metas produto = (metas) MetarDAO.get(id);
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
		metas loginer = gson.fromJson(request.body(), metas.class);
		
		
        String resp ="";

		
		
		if(MetarDAO.update(loginer) == true) {
            resp = "login () inserido!";
            response.status(201); // 201 Created
		}
			
		makeForm();
		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}

	
	public Object delete(Request request, Response response) {
		Gson gson = new Gson(); 
		metas loginer = gson.fromJson(request.body(), metas.class);
        String resp = "";       

        
            MetarDAO.delete(loginer.getId());

            resp = "Produto () excluído!";
        

		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}
}