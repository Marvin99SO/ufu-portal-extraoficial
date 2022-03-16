package br.ufu.ufuportalextraoficial.controller;

import br.ufu.ufuportalextraoficial.models.User;
import br.ufu.ufuportalextraoficial.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public User getById(@PathVariable long id){
        return usuarioService.buscarPorId(id);
    }

    @GetMapping("/")
    public List<User> getById(){
        return usuarioService.buscarTodos();
    }

    @GetMapping("/cadastrar")
    public String teste(){
        return "Teste cadastrar funcionou";
    }

    @PostMapping("/cadastrar")
    public String createAccount(@RequestBody User usuario, RedirectAttributes attr){
        usuarioService.salvar(usuario);
        attr.addFlashAttribute("success", "Conta cadastrada com sucesso!");
        return "redirect:/contas/cadastrar";
    }
    /*
    private URI uploadProfilePicture(@AuthenticationPrincipal User usuario, RedirectAttributes model, MultipartFile multipartFile) {
        User user = UserService.authenticated();
        if (user == null)
            throw new AuthorizationException("Acesso negado!");

        BufferedImage jpgImage = imageService.getJpgImageFromFile(multipartFile);
        jpgImage = imageService.cropSquare(jpgImage);
        jpgImage = imageService.resize(jpgImage, size);

        String fileName = prefix + user.getId() + ".jpg";

        return s3Service.uploadFile(imageService.getInputStream(jpgImage, "jpg"), fileName, "image");
    }
     */

//    @PutMapping("/atualizar")
//    public String editAccount(@RequestBody Long id, String newPassword,RedirectAttributes attr){
//        usuarioService.atualizarSenha(id, newPassword);
//        attr.addFlashAttribute("success", "Conta atualizada com sucesso!");
//        return "redirect:/contas/editar";
//    }

    @PutMapping("/editar")
    public String editAccount(@RequestBody User usuario, RedirectAttributes attr){
        usuarioService.editar(usuario);
        attr.addFlashAttribute("success", "Conta atualizada com sucesso!");
        return "redirect:/contas/editar";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id, ModelMap model) {
        usuarioService.excluir(id);
        model.addAttribute("success", "Conta excluída com sucesso.");
        return "redirect:/home";
    }
}
