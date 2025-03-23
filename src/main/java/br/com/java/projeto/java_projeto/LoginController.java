package br.com.java.projeto.java_projeto;

import javax.inject.Inject;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Size;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import br.com.caelum.vraptor.validator.Validator;

import br.com.java.Usuario.Usuario;
import br.com.java.dao.UsuarioDao;
import br.com.caelum.vraptor.validator.SimpleMessage;

@Controller
@Path("login")
public class LoginController {

    @Inject
     Validator validator;

    @Inject
     UsuarioDao usuarioDao;

    @Inject
     Result result;

    @Get("")
    public void login() {}

    @IncludeParameters
    @Post("autenticar")
    public void autenticar(@NotEmpty String email,@NotEmpty  @Size(min = 6, max = 20) String senha) {
        Usuario usuario = usuarioDao.existeUsuarioCom(email, senha);

     if(usuario==null) {
  	validator.add( new SimpleMessage("erro","as senhas sao invalidas")); 
       validator.onErrorRedirectTo(this).login();
       
       
       
       
    
     }  else {
    	   
    	   result.redirectTo(LojaController.class).loja();
      
   

       } } }
	
		
		
		
		
		
		
		
	
	

