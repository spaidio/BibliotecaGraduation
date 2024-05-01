package br.com.biblioteca.controller;
import java.util.ArrayList;
import br.com.biblioteca.model.Usuario;
public class ControllerUsuario {

public class UsuarioController {
	ArrayList<Usuario> usuarios;
	
	public void CadastrarUsuario(String nome, String email, String cpf, String telefone, String senha) {
		Usuario usuarioNovo =
				new Usuario(nome, email, cpf, telefone, senha);
		usuarios.add(usuarioNovo);
	}
}
}
