package br.com.jvsiqueira.crudmysql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jvsiqueira.crudmysql.model.Usuario;
import br.com.jvsiqueira.crudmysql.services.UsuarioService;

@RestController
@RequestMapping("/usuario/")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping(path = "consulta")
	public List<Usuario> findAll() {
		List<Usuario> lista = usuarioService.findAll();
		System.out.println(lista);
		return lista;
	}
	
	@PostMapping(path = "salva")
	public void save(@RequestBody Usuario usuario) {
		usuarioService.save(usuario);
	}
	
	@DeleteMapping(path = "deleta/{id}")
	public String deletar(@PathVariable("id") Long id) {
		return usuarioService.delete(id);
	}
	
	@PutMapping(path = "altera")
	public void update(@RequestBody Usuario usuario) {
		usuarioService.update(usuario);
	}
	
}
