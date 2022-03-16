package br.ufu.ufuportalextraoficial.models;

import javax.persistence.*;

@Entity
@Table(name = "NOTICIAS")

public class Noticia {

    @Id
    @Column(name = "noticia_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //as notícias podem ter link pra pág externa, que possuem título, link e imagem de capa.

    //ilustracoes
    private byte[] ilustracoes;

    @ManyToOne
    @JoinColumn(name = "id_user_fk")
    private User autor;

    @Column(name = "titulo", nullable = false, length = 60)
    protected String titulo;
    @Column(name = "conteudo", nullable = false)
    protected String conteudo;
    @Column(name = "link", nullable = false, length = 200)
    protected String links;
    //capa
    protected byte[] imagem;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public byte[] getIlustracoes() {
        return ilustracoes;
    }

    public void setIlustracoes(byte[] ilustracoes) {
        this.ilustracoes = ilustracoes;
    }

    public User getAutor() {
        return autor;
    }

    public void setAutor(User autor) {
        this.autor = autor;
    }
}
