package com.npjava.newfeatures.controller;

import com.npjava.newfeatures.NpJava17NewApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(InitialController.class)
@SpringBootTest(classes = NpJava17NewApplication.class)
class InitialControllerTest {

    @Autowired
    private MockMvc mockMvc;

    //@Test
    void testSayHello() throws Exception {
        mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, Spring Boot!"));
    }
}
