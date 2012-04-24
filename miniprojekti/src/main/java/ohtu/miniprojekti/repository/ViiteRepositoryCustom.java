package ohtu.miniprojekti.repository;

import java.util.List;
import ohtu.miniprojekti.domain.Viite;

interface ViiteRepositoryCustom {
    List<Viite> findAllWithAuthor(String author);
}
