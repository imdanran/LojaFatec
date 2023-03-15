package com.fatec.Loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/{nome}")
    public String index(@PathVariable String nome, ModelMap model){
        model.addAttribute("nome", nome);
        return "index";
    }
    @GetMapping("/home/{nome}")
    public String home(@PathVariable String nome, ModelMap model){
        model.addAttribute("nome", nome);
        return "home";
    }
}