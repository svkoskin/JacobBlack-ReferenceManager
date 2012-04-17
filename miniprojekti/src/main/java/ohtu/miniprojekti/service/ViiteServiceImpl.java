package ohtu.miniprojekti.service;

import java.util.List;
import ohtu.miniprojekti.domain.Viite;
import ohtu.miniprojekti.formvalidation.ArticleValidationObject;
import ohtu.miniprojekti.formvalidation.BookValidationObject;
import ohtu.miniprojekti.formvalidation.InproceedingsValidationObject;
import ohtu.miniprojekti.formvalidation.ViiteValidationObject;
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
    public Viite findById(Long id) {
        return viiteRepository.findOne(id);
    }

    @Override
    public Viite getViite(ViiteValidationObject viiteValidationObject) {
        if (viiteValidationObject.getId() >= 0) {//viite on jo olemassa, haetaan vanha viite
            return findById(viiteValidationObject.getId());
        }
        else{
            Viite viite = new Viite();
            
            if(viiteValidationObject.getViiteType() == Viite.ViiteType.ARTICLE){
                viite.updateFromValidationObj((ArticleValidationObject)viiteValidationObject);
            }
            else if(viiteValidationObject.getViiteType() == Viite.ViiteType.BOOK){
                viite.updateFromValidationObj((BookValidationObject)viiteValidationObject);
            }
            else if(viiteValidationObject.getViiteType() == Viite.ViiteType.INPROCEEDINGS){
                viite.updateFromValidationObj((InproceedingsValidationObject)viiteValidationObject);
            }
            
            return viite;
        }  
        
    }
    
}
