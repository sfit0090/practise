package spring2.controller;


import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.web.servlet.ModelAndView;  

@RestController  
public class MainController {  

  @RequestMapping(value = "home", method = RequestMethod.GET)  
  public ModelAndView taskReleaseCon() {  
      ModelAndView mv = new ModelAndView();  
      mv.setViewName("home");  
      return mv;  
  }  
    
}  
