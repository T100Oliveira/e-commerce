<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>E-Commerce - Cadastrar</title>     
        <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
      <link rel="stylesheet" type="text/css" href="css/stylessss.css">
    </head>
     <header>
 
    <!-- Navegação do site -->
    <nav>
      <ul>
        <li><a href="http://localhost:8080/java-projeto/cadastrar">Cadastrar</a></li>
        <li><a href="http://localhost:8080/java-projeto/login">Login</a></li>
       
        <li><a href="http://localhost:8080/java-projeto/loja">Loja</a></li>
      </ul>
    </nav>
  </header>  
     
    <body id="page-top">
     
        <!-- cadastrar-->
        <section class="page-section" id="cadastrar">
            <div class="container">
                <div class="text-center">
                    <h2 class="section-heading text-uppercase">    &nbsp &nbsp &nbsp &nbsp &nbsp Cadastre-se</h2>
                    <h3 class="section-subheading text-muted">Crie seu Cadastro Gratuitamente</h3>
                </div>
                <form method= "post" action= "<c:url value="cadastrar/salvaUsuario"/>"> 
                    <div class="row justify-content-md-center mb-5 text-center">
                        <div class="col-md-12 align-self-center text-center">
                            <div class="form-group input-login mx-auto">
                                <input name="usuario.nome" value="${usuario.getNome() }"  minlength="4" maxlength="120" class="form-control" id="email" type="text" placeholder="Nome *" required="required" data-validation-required-message="Please enter your email address." />
                                <p class="help-block text-danger"></p>
                            </div>
                             <div class="form-group input-login mx-auto">
                                <input name="usuario.email"value="${usuario.getEmail() }" class="form-control" id="email" type="email" placeholder="Email *" required="required" data-validation-required-message="Please enter your email address." />
                                <p class="help-block text-danger"></p>
                            </div>
                            <div class="form-group input-login mx-auto">
                                <input name="usuario.senha"value="${usuario.getSenha() }" minlength ="4" maxlength="120" class="form-control" id="phone" type="password" placeholder="Senha *" required="required" data-validation-required-message="Insira sua senha." />
                                <p class="help-block text-danger"></p>
                            </div>
                          
                            <button type="submit" class="btn btn-primary btn-xl text-uppercase js-scroll-trigger" href="#cadastrar">Cadastrar</button>
                        </div> 
                    </div>
                 
                </form>
            </div>
        </section>
    </body>
      
     
        <!-- Bootstrap core JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Third party plugin JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <!-- Contact form JS-->
        <script src="assets/mail/jqBootstrapValidation.js"></script>
        <script src="assets/mail/contact_me.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
        <script>

        </script>
    </body>
</html>
