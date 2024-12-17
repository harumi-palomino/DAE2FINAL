
package pe.com.Colegio.Euler.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.Colegio.Euler.entity.matriculaEntity;


public interface matriculaRepository extends JpaRepository<matriculaEntity, Long>{
    @Query("select m from matriculaEntity m where m.estado=true")
    List<matriculaEntity> findAllCustom();

}