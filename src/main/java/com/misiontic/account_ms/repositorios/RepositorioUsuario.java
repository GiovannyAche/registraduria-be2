package com.misiontic.account_ms.repositorios;
import org.springframework.data.mongodb.repository.Query;
import com.misiontic.account_ms.modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
    @Query("{'correo': ?0}")
    public Usuario getUserByEmail(String correo);
}
