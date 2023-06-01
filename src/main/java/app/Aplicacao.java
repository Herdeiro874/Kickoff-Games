package app;

import static spark.Spark.*;
import service.LoginService;
import service.DicaService;
import service.UsuarioService;
import service.MetaService;

public class Aplicacao {
	
	private static LoginService LOGINService = new LoginService();
	private static DicaService DicaService = new DicaService();
	private static UsuarioService usuarioService = new UsuarioService();
	private static MetaService metaService = new MetaService();
	
    public static void main(String[] args) {
        port(5501);
        
        staticFiles.location("/public");
        
        get("/login/login/", (request, response) -> LOGINService.get2(request, response));
        
        get("/login/cadastro/", (request, response) -> LOGINService.get(request, response));
        
        get("/login/autenticar/", (request, response) -> LOGINService.autenticar(request, response));
        
        post("/login/insert/", (request, response) -> LOGINService.insert(request, response));
        
        
        // CRUD DICA
        
        get("/aulas/:id", (request, response) -> DicaService.get(request, response));
        
        get("/dicas/dicas/", (request, response) -> DicaService.get2(request, response));
        
        get("/aulas/listar/:orderby", (request, response) -> DicaService.getAll(request, response));

        get("/aulas/", (request, response) -> DicaService.getToUpdate(request, response));
        
        post("/dicas/insert/", (request, response) -> DicaService.insert(request, response));
        
        post("/aulas/insert/", (request, response) -> DicaService.insert(request, response));
        
        post("/aulas/update/:id", (request, response) -> DicaService.update(request, response));
           
        post("/aulas/delete/", (request, response) -> DicaService.delete(request, response));
        
        //CRUD Usuario

       get("/usuario/:id", (request, response) -> usuarioService.get(request, response));
        
        get("/usuario/usuario/", (request, response) -> usuarioService.get2(request, response));
        
        get("/usuario/listar/:orderby", (request, response) -> usuarioService.getAll(request, response));

        get("/usuario/", (request, response) -> usuarioService.getToUpdate(request, response));
        
        post("/usuario/insert/", (request, response) -> usuarioService.insert(request, response));
        
        post("/usuario/update/:id", (request, response) -> usuarioService.update(request, response));
           
        post("/usuario/delete/", (request, response) -> usuarioService.delete(request, response));
        
        //CRUD Metas
          
       get("/meta/:id", (request, response) -> metaService.get(request, response));
        
        get("/meta/meta/", (request, response) -> metaService.get2(request, response));
        
        get("/meta/listar/:orderby", (request, response) -> metaService.getAll(request, response));

        get("/meta/", (request, response) -> metaService.getToUpdate(request, response));
        
        post("/meta/insert/", (request, response) -> metaService.insert(request, response));
        
        post("/meta/update/:id", (request, response) -> metaService.update(request, response));
           
        post("/meta/delete/", (request, response) -> metaService.delete(request, response));
        
        // Perfil
        
        get("/perfil/", (request, response) -> usuarioService.get3(request, response));
        
        post("/perfil/detalhar/", (request, response) -> usuarioService.get3(request, response));
    }
}