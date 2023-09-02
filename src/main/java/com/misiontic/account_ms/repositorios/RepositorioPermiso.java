package com.misiontic.account_ms.repositorios;
import org.springframework.data.mongodb.repository.Query;
import com.misiontic.account_ms.modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
    @Query("{'url':?0,'metodo':?1}")
    Permiso getPermiso(String url, String metodo);
}
