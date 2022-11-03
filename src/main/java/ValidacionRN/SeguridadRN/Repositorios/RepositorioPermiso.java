package ValidacionRN.SeguridadRN.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import ValidacionRN.SeguridadRN.Modelos.Permiso;

public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
    @Query("{'url':?0,'metodo':?1}")
    Permiso getPermiso(String url, String metodo);
}
