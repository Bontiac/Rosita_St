package com.edu.konrad.Rosita.controller;

import java.util.List;

import com.edu.konrad.Rosita.service.API.UsuarioServiceAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

import com.edu.konrad.Rosita.dto.ProductoDTO;
import com.edu.konrad.Rosita.model.Producto;
import com.edu.konrad.Rosita.service.API.ProductoServiceAPI;

@Controller
//@RequestMapping(value = "/")
@CrossOrigin("*")
public class ProductoRestController {
    @Autowired
    private ProductoServiceAPI productoServiceAPI;

    @GetMapping("/producto/{id}")
    public String viewSave(@PathVariable("id") String id, Model model) throws Exception {
        model.addAttribute("producto", new Producto());
        return "crearProducto";
    }

    @RequestMapping(value = "/productos")
    public String getAll(Model model) throws Exception {
        model.addAttribute("list", productoServiceAPI.getAll());
        return "listarProductos";
    }

}
