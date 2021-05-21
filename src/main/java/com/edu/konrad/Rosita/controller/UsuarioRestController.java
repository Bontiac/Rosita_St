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


import com.edu.konrad.Rosita.dto.UsuarioDTO;
import com.edu.konrad.Rosita.model.Usuario;
import com.edu.konrad.Rosita.service.API.UsuarioServiceAPI;

@Controller
@RequestMapping(value = "/")
@CrossOrigin("*")
public class UsuarioRestController {

    @Autowired
    private UsuarioServiceAPI usuarioServiceAPI;

    @RequestMapping(value = "/all")
	public String getAll(Model model) throws Exception {
		model.addAttribute("list", usuarioServiceAPI.getAll());
		return "inicio";
	}

	@RequestMapping(value = "/")
	public String index(Model model) throws Exception {
		model.addAttribute("list", usuarioServiceAPI.getAll());
		return "inicio";
	}

	/*@GetMapping(value = "/find/{id}")
	public UsuarioDTO find(@PathVariable String id) throws Exception {
		return usuarioServiceAPI.get(id);
	}

    @PostMapping(value = "/save/{id}")
	public ResponseEntity<String> save(@RequestBody Usuario usuario, @PathVariable String id) throws Exception {
		if (id == null || id.length() == 0 || id.equals("null")) {
			id = usuarioServiceAPI.save(usuario);
		} else {
			id=usuarioServiceAPI.save(usuario, id);
		}
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}*/

	@GetMapping("/save/{id}")
    public String viewSave(@PathVariable("id") String id, Model model) throws Exception {
			model.addAttribute("usuario", new Usuario());
			return "crearUsuario";   
    }

	@PostMapping("/save")
    public String save(Usuario usuario) throws Exception{
	usuarioServiceAPI.save(usuario);
		
        return "redirect:/all";
    }

	@PostMapping("/update")
	public String update(Usuario usuario, String id) throws Exception{
		usuarioServiceAPI.save(usuario, id);
		return "redirect:/all";
	}

	@GetMapping("/update/{id}")
	public String viewUpdate(@PathVariable("id") String id, Model model) throws Exception {
		model.addAttribute("usuario", usuarioServiceAPI.get(id));
		return "actualizarUsuario";
	}

    /*@GetMapping(value = "/delete/{id}")
	public ResponseEntity<UsuarioDTO> delete(@PathVariable String id) throws Exception {
		UsuarioDTO usuario = usuarioServiceAPI.get(id);
		if (usuario != null) {
			usuarioServiceAPI.delete(id);
		} else {
			return new ResponseEntity<UsuarioDTO>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<UsuarioDTO>(usuario, HttpStatus.OK);
	}*/

	@GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) throws Exception{
        usuarioServiceAPI.delete(id);
        return "redirect:/all";
    }
}