package br.ufu.ufuportalextraoficial.models;

import javax.persistence.*;

@Entity
@Table(name = "PROJETO")
public class Projeto {

    @Id
    @Column(name = "projeto_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private byte[] ilustracoes;

    @Column(name = "titulo", nullable = false, length = 60)
    protected String titulo;
    @Column(name = "conteudo", nullable = false)
    protected String conteudo;
    @Column(name = "link", nullable = false, length = 200)
    protected String links;
    //capa
    protected byte[] imagem;

    @ManyToOne
    @JoinColumn(name = "id_user_fk")
    private User autor;

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
}
