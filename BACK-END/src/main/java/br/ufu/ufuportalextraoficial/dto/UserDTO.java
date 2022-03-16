package br.ufu.ufuportalextraoficial.dto;

import br.ufu.ufuportalextraoficial.models.Role;
import br.ufu.ufuportalextraoficial.models.User;

public class UserDTO {
    // User
    private String username;
    private String password;
    private boolean enabled;
    private String nome;
    private String email;
    private String classificacao;
    private byte[] foto;

    //Role
    private String name;

    private Role CriarRole(){
        Role role = new Role();
        role.setName(this.name);

        return role;
    }

    public User criarUsuario(){
        User novoUsuario = new User();
        novoUsuario.setUsername(this.username);
        novoUsuario.setPassword(this.password);
        novoUsuario.setEnabled(this.enabled);
        novoUsuario.setNome(this.nome);
        return novoUsuario;
    }


}
