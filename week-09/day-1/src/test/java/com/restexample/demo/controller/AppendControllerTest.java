package com.restexample.demo.controller;

import com.restexample.demo.model.GreeterObject;
import com.restexample.demo.service.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
@WebMvcTest(AppendController.class)
public class AppendControllerTest {

  @Autowired
  private MockMvc mockMvc;

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Test
  public void append() throws Exception{
    String name = "Jack";
    String title = "programmer";
    mockMvc.perform(get("/appenda/{appendable}", name)
        .contentType(MediaType.APPLICATION_JSON))
//        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
//        .andExpect(content().contentType("application/json;charset=UTF-8"))
        .andExpect(jsonPath("$.appended").exists())

        .andExpect(jsonPath("$.appended").value("Jacka"));
  }
}