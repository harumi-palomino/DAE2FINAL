
package pe.com.Colegio.Euler.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.Colegio.Euler.entity.aulaEntity;


public interface aulaRepository extends JpaRepository<aulaEntity, Long>{
    @Query("select al from aulaEntity al where al.estado=true")
    List<aulaEntity> findAllCustom();

}