package br.com.java.projeto.java_projeto;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.java.Usuario.Usuario;
import br.com.java.dao.UsuarioDao;






@Controller
@Path("cadastrar")

public class CadastrarController {

	@Inject UsuarioDao usuarioDao;
	@Inject Result result;
	@Get("")
	public  String cadstrar() {
		return "<!DOCTYPE html>\r\n" + 
				"<html lang=\"pt-br\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <title>Cadastro</title>\r\n" + 
				"    <style>\r\n" + 
				"        body {\r\n" + 
				"            font-family: Arial, sans-serif;\r\n" + 
				"            background-color: #f2f2f2;\r\n" + 
				"            display: flex;\r\n" + 
				"            justify-content: center;\r\n" + 
				"            align-items: center;\r\n" + 
				"            height: 100vh;\r\n" + 
				"            margin: 0;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .container {\r\n" + 
				"            background-color: white;\r\n" + 
				"            padding: 20px;\r\n" + 
				"            border-radius: 10px;\r\n" + 
				"            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n" + 
				"            width: 100%;\r\n" + 
				"            max-width: 400px;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .container h2 {\r\n" + 
				"            margin-bottom: 20px;\r\n" + 
				"            color: #333;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group {\r\n" + 
				"            margin-bottom: 15px;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group label {\r\n" + 
				"            display: block;\r\n" + 
				"            margin-bottom: 5px;\r\n" + 
				"            color: #666;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group input {\r\n" + 
				"            width: 100%;\r\n" + 
				"            padding: 10px;\r\n" + 
				"            border: 1px solid #ddd;\r\n" + 
				"            border-radius: 5px;\r\n" + 
				"            box-sizing: border-box;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group input:focus {\r\n" + 
				"            border-color: #5cb85c;\r\n" + 
				"            outline: none;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .btn {\r\n" + 
				"            width: 100%;\r\n" + 
				"            padding: 10px;\r\n" + 
				"            background-color: #5cb85c;\r\n" + 
				"            color: white;\r\n" + 
				"            border: none;\r\n" + 
				"            border-radius: 5px;\r\n" + 
				"            cursor: pointer;\r\n" + 
				"            font-size: 16px;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .btn:hover {\r\n" + 
				"            background-color: #4cae4c;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group a {\r\n" + 
				"            color: #5cb85c;\r\n" + 
				"            text-decoration: none;\r\n" + 
				"            font-size: 14px;\r\n" + 
				"            display: block;\r\n" + 
				"            text-align: right;\r\n" + 
				"            margin-top: 10px;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group a:hover {\r\n" + 
				"            text-decoration: underline;\r\n" + 
				"        }\r\n" + 
				"    </style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <div class=\"container\">\r\n" + 
				"        <h2>Cadastro</h2>\r\n" + 
				"        <form>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"                <label for=\"name\">Nome</label>\r\n" + 
				"                <input type=\"text\" id=\"name\" name=\"name\" required>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"                <label for=\"email\">Email</label>\r\n" + 
				"                <input type=\"email\" id=\"email\" name=\"email\" required>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"                <label for=\"password\">Senha</label>\r\n" + 
				"                <input type=\"password\" id=\"password\" name=\"password\" required>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"form-group\">\r\n" + 
				"                <label for=\"confirm-password\">Confirme a Senha</label>\r\n" + 
				"                <input type=\"password\" id=\"confirm-password\" name=\"confirm-password\" required>\r\n" + 
				"            </div>\r\n" + 
				"            <button type=\"submit\" class=\"btn\">Cadastrar</button>\r\n" + 
				"            <a href=\"#\">Já tem uma conta? Entre</a>\r\n" + 
				"        </form>\r\n" + 
				"    </div>\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"";
		
		
	}
	
	 @IncludeParameters  @Post("salvaUsuario")
		public void	salvaUsuario(@Valid Usuario usuario) {
		 
		 
	     usuarioDao.insert(usuario);
	  
		 result.redirectTo(LojaController.class).loja();
		
	 }
  
}
                    