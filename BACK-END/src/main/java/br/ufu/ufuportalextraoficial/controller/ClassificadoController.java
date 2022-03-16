package br.ufu.ufuportalextraoficial.controller;

//import br.ufu.ufuportalextraoficial.boot.model.Classificado;
//import br.ufu.ufuportalextraoficial.boot.service.ClassificadoService;
import br.ufu.ufuportalextraoficial.models.Classificado;
import br.ufu.ufuportalextraoficial.services.ClassificadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class ClassificadoController {

    @Autowired
    private ClassificadoService classificadoService;

    @GetMapping("/{id}")
    public Classificado getById(@PathVariable long id){
        return classificadoService.buscarPorId(id);
    }

    @GetMapping("/")
    public List<Classificado> getById(){
        return classificadoService.buscarTodos();
    }

    @PostMapping("/cadastrar")
    public String createAccount(@RequestBody Classificado classificado, RedirectAttributes attr){
        classificadoService.salvar(classificado);
        attr.addFlashAttribute("success", "Classificado adicionado com sucesso!");
        return "redirect:/jobs/cadastrar";
    }

    @PutMapping("/editar")
    public String editAccount(@RequestBody Classificado classificado, RedirectAttributes attr){
        classificadoService.editar(classificado);
        attr.addFlashAttribute("success", "Classificado atualizado com sucesso!");
        return "redirect:/jobs/editar";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id, ModelMap model) {
        classificadoService.excluir(id);
        model.addAttribute("success", "Classificado excluído com sucesso.");
        return "redirect:/home";
    }
}

