package com.amintg.controller;

import com.amintg.security.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DashboardController.class)
@Import(SecurityConfig.class)
class DashboardControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void exposesSampleKpisWithoutAuthentication() throws Exception {
        mockMvc.perform(get("/api/kpi"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.users").value(120000))
            .andExpect(jsonPath("$.availability").value("99.99%"));
    }
}