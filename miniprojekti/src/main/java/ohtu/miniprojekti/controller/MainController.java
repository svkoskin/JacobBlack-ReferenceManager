package ohtu.miniprojekti.controller;

import javax.validation.Valid;
import ohtu.miniprojekti.domain.Viite;
import ohtu.miniprojekti.service.ViiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @Autowired
    private ViiteService viiteService;
    
    @RequestMapping(value = "*")
    public String any() {
        return "redirect:home";
    }
    
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("viitecount", viiteService.findAll().size());
        return "home";
    }
    
    @RequestMapping(value = "artikkeli", method = RequestMethod.GET)
    public String getArtikkeli(Model model) {
        model.addAttribute("viite", new Viite());
        return "artikkeli";
    }
    
    @RequestMapping(value = "artikkeli", method = RequestMethod.POST)
    public String postViite(@Valid @ModelAttribute("viite") Viite viite, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) return "artikkeli";
        
        viiteService.save(viite);
        
        return "redirect:home";
    }
    
    @RequestMapping(value = "listaus", method = RequestMethod.GET)
    public String getListaaKaikki(Model model) {
        model.addAttribute("viitteet", viiteService.findAll());
        return "listaus";
    }
    
}
