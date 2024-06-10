package com.example.fj21tarefas.controller;


import com.example.fj21tarefas.model.Tarefa;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;


@Controller
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @RequestMapping("novaTarefa")
    public String form() {
        return "tarefa/formulario";
    }

    @RequestMapping("adicionaTarefa")
    public String adiciona(@Valid Tarefa tarefa, BindingResult result) {

        if (result.hasFieldErrors("descricao")) {
            return "tarefa/formulario";
        }
        if(result.hasErrors()){
            return "tarefa/formulario";
        }

        tarefaRepository.save(tarefa);
        return "tarefa/adicionada";
    }

    @RequestMapping("listaTarefas")
    public String lista(Model model) {
        List<Tarefa> tarefas = tarefaRepository.findAll();
        model.addAttribute("tarefas", tarefas);
        return "tarefa/lista";
    }

    @RequestMapping("removeTarefa")
    public String remove(Tarefa tarefa) {
        tarefaRepository.delete(tarefa);
        return "redirect:listaTarefas";
    }

    @RequestMapping("mostraTarefa")
    public String mostra(Long id, Model model) {
        tarefaRepository.findById(id);
        model.addAttribute("tarefa", tarefaRepository.findById(id));
        return "tarefa/mostra";
    }

    @RequestMapping("alteraTarefa")
    public String altera(Tarefa tarefa) {
        tarefaRepository.save(tarefa);
        return "redirect:listaTarefas";
    }




    @RequestMapping("/teste")
    public String teste(Model model){
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("tarefa numero "+ new Random().nextInt());
        tarefa.setFinalizado(false);
        tarefa.setDataFinalizacao(LocalDate.now());


        tarefaRepository.save(tarefa);

        model.addAttribute("tarefas", tarefaRepository.findAll());
        return "tarefas";
    }

}
