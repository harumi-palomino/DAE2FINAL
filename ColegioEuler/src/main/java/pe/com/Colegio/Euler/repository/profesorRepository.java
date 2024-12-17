
package pe.com.Colegio.Euler.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.Colegio.Euler.entity.profesorEntity;


public interface profesorRepository extends JpaRepository<profesorEntity, Long>{
    @Query("select p from profesorEntity p where p.estado=true")
    List<profesorEntity> findAllCustom();

}