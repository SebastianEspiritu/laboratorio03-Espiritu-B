package com.tecsup.demo01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tecsup.demo01.service.DetalleVentaService;

@Controller
@RequestMapping("/web/detalles")
public class DetalleWebController {

    @Autowired
    private DetalleVentaService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("detalles", service.listar());
        return "detalles";
    }
}