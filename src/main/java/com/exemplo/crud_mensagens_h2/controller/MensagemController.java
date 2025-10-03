package com.exemplo.crud_mensagens_h2.controller;

import com.exemplo.crud_mensagens_h2.model.Mensagem;
import com.exemplo.crud_mensagens_h2.service.MensagemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    private final MensagemService service;

    public MensagemController(MensagemService service) {
        this.service = service;
    }

    @PostMapping
    public Mensagem criar(@RequestBody Mensagem mensagem) {
        return service.adicionarMensagem(mensagem.getTexto());
    }

    @GetMapping
    public List<Mensagem> listar() {
        return service.listarMensagens();
    }

    @GetMapping("/{id}")
    public Mensagem buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Mensagem atualizar(@PathVariable Long id, @RequestBody Mensagem mensagem) {
        return service.atualizarMensagem(id, mensagem.getTexto());
    }

    @DeleteMapping("/{id}")
    public String remover(@PathVariable Long id) {
        return service.removerMensagem(id) ? "Mensagem removida com sucesso!" : "Mensagem não encontrada!";
    }
}
