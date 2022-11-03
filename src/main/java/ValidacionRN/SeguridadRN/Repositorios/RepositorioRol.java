package ValidacionRN.SeguridadRN.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import ValidacionRN.SeguridadRN.Modelos.Rol;

public interface RepositorioRol extends MongoRepository<Rol,String> {
}
