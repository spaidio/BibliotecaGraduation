package br.com.biblioteca.model;

import java.util.UUID;

public class Livro {
	
	
	private UUID id;
    private String titulo;
    private String autor;
    private String genero;
    private String sinopse;
    private String preco;
    private int paginas;
    private String dataLancamento;
    private String disponibilidade;

    public Livro(String titulo, String autor, String genero,String sinopse, String preco, int paginas, String dataLancamento, String disponibilidade) 
    {
    	this.id = UUID.randomUUID();
    	this.titulo = titulo;
    	this.autor = autor;
        this.genero = genero;
        this.sinopse = sinopse;
        this.preco = preco;
        this.paginas = paginas;
        this.dataLancamento = dataLancamento;
        this.disponibilidade = disponibilidade;
    }

    // Getters e Setters

    public void setId(UUID id) {
        this.id = id;
    }
    public UUID getId() {
        return id;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPreco(String preco) {
        this.preco = preco;
        }
    public String getPreco() {
        return preco;
    }
    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    public String getData() {
        return dataLancamento;
    }

    public void setData(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    
    public String getSinopse() {
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
