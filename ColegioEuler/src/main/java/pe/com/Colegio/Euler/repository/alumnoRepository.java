
package pe.com.Colegio.Euler.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.Colegio.Euler.entity.alumnoEntity;


public interface alumnoRepository extends JpaRepository<alumnoEntity, Long>{
    @Query("select a from alumnoEntity a where a.estado=true")
    List<alumnoEntity> findAllCustom();

}