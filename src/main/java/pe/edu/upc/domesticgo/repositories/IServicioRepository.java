package pe.edu.upc.domesticgo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.domesticgo.entities.Servicio;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Integer> {
}
