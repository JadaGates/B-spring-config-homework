package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application.properties")
public class LevelControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnBasicWhenLevelNumberLessThanOne() throws Exception {
        String result = mockMvc.perform(get("/level"))
                .andReturn()
                .getResponse()
                .getContentAsString();
        assertEquals("basic", result);
    }
}
