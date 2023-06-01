package service;

import java.util.Scanner;
import java.io.File;
import java.util.List;
import dao.DicaDAO;
import model.dica;
import spark.Request;
import spark.Response;
import com.google.gson.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class DicaService {

	private DicaDAO dicarDAO = new DicaDAO();
	private String form;
	private final int FORM_INSERT = 1;
	private final int FORM_DETAIL = 2;
	private final int FORM_UPDATE = 3;
	private final int FORM_ORDERBY_CODIGO = 1;
	private final int FORM_ORDERBY_NOME = 2;
	private final int FORM_ORDERBY_CURSO = 3;
	
	
	public DicaService() {
		makeForm();
	}

	
	public void makeForm() {
		makeForm(FORM_INSERT, new dica(), FORM_ORDERBY_NOME);
	}

	
	public void makeForm(int orderBy) {
		makeForm(FORM_INSERT, new dica(), orderBy);
	}

	
	public void makeForm(int tipo, dica produto, int orderBy) {
		
		String nomeArquivo = "";
		if(orderBy == 1) {
			nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/aulas/aulaslol.html";
		}else if(orderBy == 2) {
			nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/aulas/aulasvalo.html";
		}else {
			nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/aulas/cadastro_aulas.html";
		}
		
		form = "";
		try{
			Scanner entrada = new Scanner(new File(nomeArquivo));
		    while(entrada.hasNext()){
		    	form += (entrada.nextLine() + "\n");
		    }
		    entrada.close();
		}  catch (Exception e) { System.out.println(e.getMessage()); }
		
		String list = "";
		List<dica> aulas;
		               	
		aulas = dicarDAO.getOrderByNota();

		if(orderBy == 1) {

				               

		
				for (dica p : aulas) {
					
					String jog = p.getJogo();
					
					if(jog.charAt(0)== 'L') {

						if(p.getLapide() == false) {

									list += "<div class=\"col-12\">\n";
										list+= "                        <p><h3><b> "+p.getHabilidade()+" </b></h3></p>\n";
										list+= "                            <p><b>Categoria: </b>"+p.getCategoria()+"</p>\n";
										list+= "                            <p><b>Dificuldade: </b>"+p.getDificuldade()+"</p>\n";
										list+= "                            <p><b>Descrição: </b> "+p.getDescricao()+" </p>\n";
										list+= "                    <div>\n";
										list+= "                     <iframe width=\"1000\" height=\"500\" src=\""+p.getMidia()+"\" frameborder=\"0\"\n";
										list+= "                     allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture;\"\n";
										list+= "                    allowfullscreen></iframe>\n";
										list+= "                     </div>\n";
									    list+= "                    </div>";
						}
					}
					
				}
				
				form = form.replaceFirst("<LOLAULAS>", list);			
				
			} else {
				for (dica p : aulas) {
					
					String jog = p.getJogo();
					
					if(jog.charAt(0)== 'V') {

						if(p.getLapide() == false) {

									list += "<div class=\"col-12\">\n";
										list+= "                        <p><h3><b> "+p.getHabilidade()+" </b></h3></p>\n";
										list+= "                            <p><b>Categoria: </b>"+p.getCategoria()+"</p>\n";
										list+= "                            <p><b>Dificuldade: </b>"+p.getDificuldade()+"</p>\n";
										list+= "                            <p><b>Descrição: </b> "+p.getDescricao()+" </p>\n";
										list+= "                    <div>\n";
										list+= "                     <iframe width=\"1000\" height=\"500\" src=\""+p.getMidia()+"\" frameborder=\"0\"\n";
										list+= "                     allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture;\"\n";
										list+= "                    allowfullscreen></iframe>\n";
										list+= "                     </div>\n";
									    list+= "                    </div>";
						}
					}
					
				}
				
				form = form.replaceFirst("<LOLAULAS>", list);
			}

	}

	
	public void makeForme() {
		String nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/aulas/cadastro_aulas.html";
		/*if(orderBy == 1) {
		nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/aulas/aulaslol.html";
	}else if(orderBy == 2) {
		nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/aulas/aulasvalo.html";
	}else {
		nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/aulas/cadastro_aulas.html";
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
	List<dica> aulas;
	               	
	aulas = dicarDAO.getOrderByNota();



			               
	String jog = "";
	
			for (dica p : aulas) {
				
				jog = p.getJogo();
				


					if(p.getLapide() == false) {

				        list += "<div id=" +p.getId()+ " class=selCard>";
				        list += "<p><b>ID: </b>"+p.getId()+"  ";
				        list += "<b>Jogo: </b>"+p.getJogo()+" </p>";
				        list += " <p><b>Habilidade: </b>"+p.getHabilidade()+"   ";
				        list += " <b>Categoria: </b>"+p.getCategoria()+"";
				        list += " <b>Dificuldade: </b>"+p.getDificuldade()+"</p>";
				        list += "<b>Descrição: </b>"+p.getDescricao()+"";
				        list += "<p></p>";
				        list += "<p><b>Nota: </b>"+p.getNota()+"</p>";					     
				        list += "<p><b>Mídia: </b> <a href ="+p.getMidia()+"> "+ p.getMidia()  +" </a></p>";					       
				        list += "</div>";
												}
								}
				
								
			
			form = form.replaceFirst("<LOLAULAS>", list);				

	}
		
		
	public void makeFormi() {
		
		String nomeArquivo = "";
		/*if(orderBy == 1) {
			nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/aulas/aulaslol.html";
		}else if(orderBy == 2) {
			nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/aulas/aulasvalo.html";
		}else {
			nomeArquivo = "KickOFF2/tiaw-pmg-cc-m-20222-10-ser-ruim-em-e-games-master/codigo/kickoffgames_project/modules/aulas/cadastro_aulas.html";
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
		List<dica> aulas;
		               	
		aulas = dicarDAO.getOrderByNota();



				               

		
				for (dica p : aulas) {
					
					String jog = p.getJogo();
					
					if(jog.charAt(0)== 'L') {

						if(p.getLapide() == false) {

					        list += "<div id=${i} class=selCard>";
					        list += "<p><b>ID: </b>"+p.getId()+"  ";
					        list += "<b>Jogo: </b>"+p.getJogo()+" </p>";
					        list += " <p><b>Habilidade: </b>"+p.getHabilidade()+"   ";
					        list += " <b>Categoria: </b>"+p.getCategoria()+"";
					        list += " <b>Dificuldade: </b>"+p.getDificuldade()+"</p>";
					        list += "<b>Descrição: </b>"+p.getDescricao()+"";
					        list += "<p></p>";
					        list += "<p><b>Nota: </b>"+p.getNota()+"</p>";					     
					        list += "<p><b>Mídia: </b> <a href ="+p.getMidia()+"> Link </a></p>";					       
					        list += "</div>";
													}
											}
					
									}
				
				form = form.replaceFirst("<LOLAULAS>", list);				

			}

	

	
	public Object insert(Request request, Response response) {
		
		Gson gson = new Gson(); 
		dica loginer = gson.fromJson(request.body(), dica.class);
		
		
        String resp ="";

		
		
		if(dicarDAO.insert(loginer) == true) {
            resp = "login () inserido!";
            response.status(201); // 201 Created
		}
			
		makeForm();
		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}

	
	public Object get(Request request, Response response) {
		
		int id = Integer.parseInt(request.params(":id"));		
		dica video =  dicarDAO.get(id);
		
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
		dica produto = (dica) dicarDAO.get(id);
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
		dica loginer = gson.fromJson(request.body(), dica.class);
		
		
        String resp ="";

		
		
		if(dicarDAO.update(loginer) == true) {
            resp = "login () inserido!";
            response.status(201); // 201 Created
		}
			
		makeForm();
		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}

	
	public Object delete(Request request, Response response) {
		Gson gson = new Gson(); 
		dica loginer = gson.fromJson(request.body(), dica.class);
        String resp = "";       

        
            dicarDAO.delete(loginer.getId());

            resp = "Produto () excluído!";
        

		return form.replaceFirst("<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\"\">", "<input type=\"hidden\" id=\"msg\" name=\"msg\" value=\""+ resp +"\">");
	}
}