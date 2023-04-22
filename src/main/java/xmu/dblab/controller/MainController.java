package xmu.dblab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(){
        return "test";
        //实际上返回的是views/test.jsp,spring-mvc.xml
    }

}
