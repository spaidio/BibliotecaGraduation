package br.com.biblioteca.controller;
import java.util.ArrayList;
import br.com.biblioteca.model.Livro;
public class AdicionarLivro {

public class UsuarioController {
	ArrayList<Livro> livros;
	
	public void AdicionaLivro(String titulo, String autor, String genero,String sinopse, String preco, int paginas, String dataLancamento, String disponibilidade) {
		Livro livroNovo =
				new Livro(titulo, autor, genero, sinopse, preco, paginas, dataLancamento, disponibilidade);
		livros.add(livroNovo);
	}
}
}
