package pe.edu.upc.domesticgo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.domesticgo.entities.Contrato;

@Repository
public interface IContratoRepository extends JpaRepository<Contrato, Integer> {
}
