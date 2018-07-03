package me.hifancy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author facny
 * @Description:
 * @Modify by:
 * @since Create in 20:16 2018/7/3
 */

@Controller
public class BaseController {

    private static final String VIEW_INDEX = "index";

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String indexController(ModelMap model){
        model.addAttribute("message","it works");

        return VIEW_INDEX;
    }
}
