package br.com.rhfactor.testing;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {


    @Autowired
    private MyInterface myInterface;

    @GetMapping(path = {"/"})
    public ModelAndView index() {
        return new ModelAndView("index")
                .addObject("name", myInterface.getName())
                ;
    }

    @PostMapping(path = {"/"})
    public ModelAndView indexAction() {
        return new ModelAndView("index")
                .addObject("sent",true);
    }

}