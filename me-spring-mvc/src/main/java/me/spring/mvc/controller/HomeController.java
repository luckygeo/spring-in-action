package me.spring.mvc.controller;

import me.spring.mvc.interfaces.SpitterRepsitory;
import me.spring.mvc.interfaces.Spittle;
import me.spring.mvc.interfaces.SpittleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 2017/8/7
 *
 * bean 校验
 * @see <a href="http://blog.csdn.net/littleskey/article/details/52222246"></a>
 *
 * 重定向和转发
 * @see <a href="http://blog.csdn.net/paincupid/article/details/52263817"></a>
 */

@Controller
@RequestMapping(value = "/home/")
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private SpittleRepository spittleRepository;

    @Autowired
    @Qualifier("spitterRepsitory")
    private SpitterRepsitory repsitory;

    @RequestMapping(value = "index")
    public ModelAndView index() {
        logger.debug("index{}", "fds");
        logger.info("hello");
        return new ModelAndView("index");
    }

    @RequestMapping(value = "hello")
    public String hello() {
        logger.debug("index{}", "fds");
        logger.info("hello");
        return "hello";
    }

    @RequestMapping(value = "spittles/{count}")
    public ModelAndView spittles(@PathVariable int count) {
        spittleRepository.findSpittles(100L, 10);
        return new ModelAndView("spittles")
                .addObject("spittles", spittleRepository.findSpittles(100L, count));

    }

    @RequestMapping(value = "spittles1")
    public Map spittles() {
        Map<String, List> map = new HashMap<>();
        map.put("spittles", spittleRepository.findSpittles(100L, 10));
        return map;

    }


    @RequestMapping(value = "reg")
    public String spittles(@Valid Spittle spittle, Errors errors) {
        errors.getAllErrors();
        logger.debug("spittle: {}",errors);
        return "redirect:/home/"+spittle.getId();
    }

    @RequestMapping(value = "{id}")
    public ModelAndView spittles(@PathVariable Long id) {
        logger.debug("id: {}",id);
        return new ModelAndView("index");
    }

    @RequestMapping(value = "spform")
    public ModelAndView spform() {
        logger.debug("id: {}", "");

        return new ModelAndView("spform");
    }

    @RequestMapping("add")
    public ModelAndView add(){
        repsitory.addSpitter(null);
        return new ModelAndView("index");
    }

}
