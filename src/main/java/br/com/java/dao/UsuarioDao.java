package br.com.java.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.java.Usuario.Usuario;

@RequestScoped
public class UsuarioDao extends Dao<Usuario>{
	 @Deprecated public UsuarioDao() {super(null,null);}


    @Inject
    public UsuarioDao(EntityManager em) {
        super(em, Usuario.class);
    }

    public Usuario existeUsuarioCom(String email, String senha) {
        String jpql = "select u from Usuario as u where u.email = :pEmail and u.senha = :pSenha";
        Query query = em.createQuery(jpql);

        query.setParameter("pEmail", email);
        query.setParameter("pSenha", senha);

        try {
            return (Usuario) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}









                    
