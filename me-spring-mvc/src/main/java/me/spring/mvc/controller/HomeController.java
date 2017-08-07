package me.spring.mvc.controller;

import me.spring.mvc.interfaces.SpittleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created on 2017/8/7
 */
@RestController
@RequestMapping(value = "/home/")
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private SpittleRepository spittleRepository;

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

    @RequestMapping(value = "spittles")
    public ModelAndView spittles() {
        spittleRepository.findSpittles(100L, 10);
        return new ModelAndView("spittles")
                .addObject("spittles", spittleRepository.findSpittles(100L, 10));

    }

    @RequestMapping(value = "sp")
    public Model spittles(Model model) {
        spittleRepository.findSpittles(100L, 10);
        return model.addAllAttributes( spittleRepository.findSpittles(100L, 10));

    }

}
