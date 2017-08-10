package me.spring.controller;


import me.spring.interfaces.interfaces.Spittle;
import me.spring.interfaces.interfaces.SpittleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created on 2017/8/9
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private SpittleRepository spittleRepository;

    public static final String HOME = "/home";

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("index")
    public ModelAndView index() {
        logger.info("index", "-------------------------");
        return new ModelAndView("index");
    }

    @RequestMapping(value = "spittles/{count}")
    public ModelAndView spittles(@PathVariable int count) {
        spittleRepository.findSpittles(100L, 10);
        return new ModelAndView("spittles")
                .addObject("spittles", spittleRepository.findSpittles(100L, count));
    }

    @RequestMapping(value = "reg")
    public String spittles(@Valid Spittle spittle, BindingResult errors, @RequestParam("file") MultipartFile file) {
        errors.getAllErrors();
        logger.debug("spittle: {}", errors);
        logger.info("file: {}", file.isEmpty());
        return "redirect:/home/" + spittle.getId();
    }

    @RequestMapping(value = "{id}")
    public ModelAndView spittles(@PathVariable Long id) {
        logger.debug("id: {}", id);
        return new ModelAndView("index");
    }

    @RequestMapping(value = "spform")
    public ModelAndView spform() {
        logger.debug("id: {}", "");
        return new ModelAndView("spform");
    }
}
