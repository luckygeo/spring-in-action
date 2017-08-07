package me.spring.mvc.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.config.ViewResolversBeanDefinitionParser;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created on 2017/8/7
 */
public class HomeControllerTest {

    @Test
    public void index() throws Exception {
        HomeController controller = new HomeController();
        assertEquals("hello",controller.hello());
    }

    @Test
    public void testHello() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/home/index")).andExpect(view().name("index"));
    }

}