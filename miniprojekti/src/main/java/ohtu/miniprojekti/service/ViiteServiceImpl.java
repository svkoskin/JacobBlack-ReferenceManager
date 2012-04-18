package ohtu.miniprojekti.service;

import java.util.List;
import ohtu.miniprojekti.domain.Viite;
import ohtu.miniprojekti.repository.ViiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ViiteServiceImpl implements ViiteService {
    @Autowired
    private ViiteRepository viiteRepository;

    @Override
    @Transactional
    public Viite save(Viite viite){
        return viiteRepository.save(viite);
    }
    
    @Override
    public List<Viite> findAll(){
        return viiteRepository.findAll();
    }

    @Override
    public boolean refIdValid(String refId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String generateRefId(String author, String year) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
