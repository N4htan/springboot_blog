package com.spring.codeblog.repository;

import com.spring.codeblog.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

    Usuario findByLogin(String login);
}
