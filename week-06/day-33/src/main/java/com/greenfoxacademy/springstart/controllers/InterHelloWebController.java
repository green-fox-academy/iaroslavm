package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class InterHelloWebController {
  private AtomicLong atomLong = new AtomicLong(0);
  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  private String[] color = {"red","blue","green","brown","black","orange"};
  private String[] font = {"times","arial","bookman","palatino","impact"};

  @RequestMapping("/web/intergreeting")
  public String greeting(Model model, @RequestParam String name) {
    List<String> listString = new ArrayList<>(Arrays.asList(this.hellos));
    int random = (int) (Math.random() * listString.size());
    int randomColor = (int) (Math.random() * color.length);
    int randomFont = (int) (Math.random() * font.length);
    int randomSize = 10 + (int) (Math.random()*100);
    String hello = listString.get(random);
    String colorIn = color[randomColor];
    String fontIn = font[randomFont];
    model.addAttribute("name", name);
    model.addAttribute("hello", hello);
    model.addAttribute("color", colorIn);
    model.addAttribute("font", fontIn);
    model.addAttribute("size", randomSize);
    model.addAttribute("time", atomLong.incrementAndGet());
    return "intergreeting";
  }
}
