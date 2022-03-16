package br.ufu.ufuportalextraoficial.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
  
  @Id
  @Column(name = "user_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String username;
  private String password;
  private boolean enabled;

  //atributos: nome completo, nome de usuário, email ufu, senha, classificação (aluno, prof, outro), foto
  @Column(name = "nome", nullable = false, length = 60)
  private String nome;

  @Column(name = "email", nullable = false, unique = true, length = 60)
  private String email;

  @Column(name = "classificacao", nullable = false, length = 3)
  private String classificacao;
  //foto
  @Column(name = "foto_perfil")
  private byte[] foto;

  @JsonIgnore
  @OneToMany(mappedBy = "autor")
  private List<Noticia> noticias;

  @JsonIgnore
  @OneToMany(mappedBy = "autor")
  private List<Vaga> vagas;

  @JsonIgnore
  @OneToMany(mappedBy = "autor")
  private List<Projeto> projetos;

  @JsonIgnore
  @OneToMany(mappedBy = "autor")
  private List<Classificado> classificados;

  //

  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinTable(
      name = "users_roles",
      joinColumns = @JoinColumn(name = "user_id"),
      inverseJoinColumns = @JoinColumn(name = "role_id")
  )
  
  // Usei Set em Roles na classe User pra mapear uma associação unidirecional many-to-many de User para Role
  private Set<Role> roles = new HashSet<>();
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getUsername() {
    return username;
  }
  
  public void setUsername(String username) {
    this.username = username;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public boolean isEnabled() {
    return enabled;
  }
  
  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }
  
  public Set<Role> getRoles() {
    return roles;
  }
  
  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getClassificacao() {
    return classificacao;
  }

  public void setClassificacao(String classificacao) {
    this.classificacao = classificacao;
  }

  public byte[] getFoto() {
    return foto;
  }

  public void setFoto(byte[] foto) {

    this.foto = foto;
  }

  public List<Noticia> getNoticias() {
    return noticias;
  }

  public void setNoticias(List<Noticia> noticias) {
    this.noticias = noticias;
  }
}
