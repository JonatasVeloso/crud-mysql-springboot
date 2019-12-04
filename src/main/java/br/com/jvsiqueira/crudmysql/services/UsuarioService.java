package br.com.jvsiqueira.crudmysql.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jvsiqueira.crudmysql.model.Usuario;
import br.com.jvsiqueira.crudmysql.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void salvar(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public List<Usuario> consultaTodos() {
		return usuarioRepository.findAll();
	}
	
	public void deletar(Long id) {
		usuarioRepository.deleteById(id);
	}
}