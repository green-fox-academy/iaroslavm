package com.restexample.demo.controller;

//import org.apache.tomcat.util.http.parser.MediaType;
import com.restexample.demo.service.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.client.match.M.jsonPath;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(DoubleController.class)
public class DoubleControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  LogService logService;

  @Test
  public void getDouble() throws Exception {
    String input = "15";
    mockMvc.perform(get("/doubling")
        .contentType(MediaType.APPLICATION_JSON)
        .param("input", input))
//        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
//        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.received").exists())
        .andExpect(jsonPath("$.result").exists())
        .andExpect(jsonPath("$.received").value("15"))
        .andExpect(jsonPath("$.result").value("30"));
  }

  @Test
  public void getDoubleError() throws Exception {
    String input = null;
    mockMvc.perform(get("/doubling")
        .contentType(MediaType.APPLICATION_JSON)
        .param("input", input))
//        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
//        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.error").exists())

        .andExpect(jsonPath("$.error").value("Please provide an input!"));
  }
}