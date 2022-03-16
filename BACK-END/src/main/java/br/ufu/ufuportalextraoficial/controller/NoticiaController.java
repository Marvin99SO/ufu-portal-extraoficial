package br.ufu.ufuportalextraoficial.controller;

import br.ufu.ufuportalextraoficial.models.Noticia;
import br.ufu.ufuportalextraoficial.services.NoticiaService;
//import br.ufu.ufuportalextraoficial.boot.model.Noticia;
//import br.ufu.ufuportalextraoficial.boot.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/news")
public class NoticiaController {
    @Autowired
    private NoticiaService noticiaService;

    @GetMapping("/{id}")
    public Noticia getById(@PathVariable long id){
        return noticiaService.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public String createAccount(@RequestBody Noticia noticia, RedirectAttributes attr){
        noticiaService.salvar(noticia);
        attr.addFlashAttribute("success", "Noticia publicada com sucesso!");
        return "redirect:/contas/cadastrar";
    }

    @PutMapping("/editar")
    public String editAccount(@RequestBody Noticia noticia, RedirectAttributes attr){
        noticiaService.editar(noticia);
        attr.addFlashAttribute("success", "Noticia atualizada com sucesso!");
        return "redirect:/contas/editar";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id, ModelMap model) {
        noticiaService.excluir(id);
        model.addAttribute("success", "Noticia excluída com sucesso.");
        return "redirect:/home";
    }
}
