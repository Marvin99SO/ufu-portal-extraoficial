package br.ufu.ufuportalextraoficial.models;

import javax.persistence.*;

@Entity
@Table(name = "VAGAS")
public class Vaga {

    @Id
    @Column(name = "vaga_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String titulo;
    private String empresa;
    private String requisitos;
    private String atividades;

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

//    @ManyToOne
//    @JoinColumn(name = "autor_id")


    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getAtividades() {
        return atividades;
    }

    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
}
