package br.ufu.ufuportalextraoficial.controller;


//import br.ufu.ufuportalextraoficial.boot.model.Projeto;
//import br.ufu.ufuportalextraoficial.boot.service.ProjetoService;
import br.ufu.ufuportalextraoficial.models.Projeto;
import br.ufu.ufuportalextraoficial.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/{id}")
    public Projeto getById(@PathVariable long id){
        return projetoService.buscarPorId(id);
    }

    @GetMapping("/")
    public List<Projeto> getById(){
        return projetoService.buscarTodos();
    }

    @PostMapping("/cadastrar")
    public String createAccount(@RequestBody Projeto projeto, RedirectAttributes attr){
        projetoService.salvar(projeto);
        attr.addFlashAttribute("success", "Projeto adicionado com sucesso!");
        return "redirect:/jobs/cadastrar";
    }

    @PutMapping("/editar")
    public String editAccount(@RequestBody Projeto projeto, RedirectAttributes attr){
        projetoService.editar(projeto);
        attr.addFlashAttribute("success", "Projeto atualizado com sucesso!");
        return "redirect:/jobs/editar";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id, ModelMap model) {
        projetoService.excluir(id);
        model.addAttribute("success", "Projeto excluído com sucesso.");
        return "redirect:/home";
    }
}
