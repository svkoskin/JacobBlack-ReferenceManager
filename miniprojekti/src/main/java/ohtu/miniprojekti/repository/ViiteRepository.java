package ohtu.miniprojekti.repository;

import ohtu.miniprojekti.domain.Viite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViiteRepository extends JpaRepository<Viite, Long>, ViiteRepositoryCustom {
    
}
