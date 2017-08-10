package me.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2017/8/10
 * 统一异常处理
 */
@RestController
public class ErrorController {

    @RequestMapping(path = "/error", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String handle(HttpServletRequest request) {

        return "{\"status\":\""+request.getAttribute("javax.servlet.error.status_code").toString()+"\"}";
    }

}
