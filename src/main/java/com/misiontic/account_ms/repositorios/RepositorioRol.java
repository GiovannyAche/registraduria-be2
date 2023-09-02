package com.misiontic.account_ms.repositorios;
import com.misiontic.account_ms.modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioRol extends MongoRepository<Rol,String> {
}
