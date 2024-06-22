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
        <title>E-Commerce - Login</title>
        <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
           <link rel="stylesheet" type="text/css" href="css/styless.css">
    </head>
      <header>
    <h1>Minha Loja de Sapatos</h1>
    <!-- Navegação do site -->
    <nav>
      <ul>
        <li><a href="http://localhost:8080/java-projeto/cadastrar">Cadastrar</a></li>
        <li><a href="http://localhost:8080/java-projeto/loja">Loja</a></li>
       
        <li><a href="#">Contato</a></li>
      </ul>
    </nav>
  </header>
    
    <body id="page-top">
      
        <header class="masthead" id="login">
            <div class="container">
                <div class="masthead-subheading">Bem Vindo ao DankiCommerce!</div>
                <div class="masthead-heading text-uppercase">Login</div>
                 <c:if test="${not empty errors}">
                  <c:forEach var="error" items="${errors}">
                 ${error.message}<br/>
                  </c:forEach>
                </div>
                </c:if>  
              
                <form method="post" action="<c:url value="login/autenticar"/>">
                    <div class="row justify-content-md-center mb-5 text-center">
                        <div class="col-md-12 align-self-center text-center">
                            <div class="form-group input-login mx-auto">
                                <input name="email" value=" ${email}" class="form-control" id="email" type="email" placeholder="Email *" required="required" data-validation-required-message="Please enter your email address." />
                                <p class="help-block text-danger"></p>
                            </div>
                            <div class="form-group mb-md-0 input-login mx-auto">
                                <input name="senha" value="${senha}"  minlength="4" maxlength="120" class="form-control" id="phone" type="password" placeholder="Senha *" required="required" data-validation-required-message="Insira sua senha." />
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                        
                    </div>
                     <button type="submit" class="btn btn-primary btn-xl text-uppercase js-scroll-trigger">Login</button>
                </form>
               
            </div>
        </header>
    
    
     
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
    </body>
</html>
