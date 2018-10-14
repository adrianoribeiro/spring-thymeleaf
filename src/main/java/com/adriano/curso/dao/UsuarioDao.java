package com.adriano.curso.dao;

import java.util.List;

import com.adriano.curso.domain.TipoSexo;
import com.adriano.curso.domain.Usuario;

public interface UsuarioDao {

	void salvar(Usuario usuario);
	
	void editar(Usuario usuario);
	
	void excluir(Long id);
	
	Usuario getId(Long id);
	
	List<Usuario> getTodos();

	List<Usuario> getBySexo(TipoSexo sexo);

	List<Usuario> getByNome(String nome);
}
