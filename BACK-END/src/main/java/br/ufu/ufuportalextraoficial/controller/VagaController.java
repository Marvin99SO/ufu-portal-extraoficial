package br.ufu.ufuportalextraoficial.controller;

import br.ufu.ufuportalextraoficial.models.Vaga;
import br.ufu.ufuportalextraoficial.services.VagaService;
//import br.ufu.ufuportalextraoficial.boot.model.Vaga;
//import br.ufu.ufuportalextraoficial.boot.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class VagaController {
    @Autowired
    private VagaService vagaService;

    @GetMapping("/{id}")
    public Vaga getById(@PathVariable long id){
        return vagaService.buscarPorId(id);
    }

    @GetMapping("/")
    public List<Vaga> getById(){
        return vagaService.buscarTodos();
    }

    @PostMapping("/cadastrar")
    public String createAccount(@RequestBody Vaga vaga, RedirectAttributes attr){
        vagaService.salvar(vaga);
        attr.addFlashAttribute("success", "Vaga cadastrada com sucesso!");
        return "redirect:/jobs/cadastrar";
    }

    @PutMapping("/editar")
    public String editAccount(@RequestBody Vaga vaga, RedirectAttributes attr){
        vagaService.editar(vaga);
        attr.addFlashAttribute("success", "Vaga atualizada com sucesso!");
        return "redirect:/jobs/editar";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id, ModelMap model) {
        vagaService.excluir(id);
        model.addAttribute("success", "Vaga excluída com sucesso.");
        return "redirect:/home";
    }
}
