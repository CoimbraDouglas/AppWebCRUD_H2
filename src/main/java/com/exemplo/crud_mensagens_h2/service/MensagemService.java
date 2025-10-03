package com.exemplo.crud_mensagens_h2.service;

import com.exemplo.crud_mensagens_h2.model.Mensagem;
import com.exemplo.crud_mensagens_h2.repository.MensagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensagemService {

    private final MensagemRepository repository;

    public MensagemService(MensagemRepository repository) {
        this.repository = repository;
    }

    // Create
    public Mensagem adicionarMensagem(String texto) {
        return repository.save(new Mensagem(texto));
    }

    // Read
    public List<Mensagem> listarMensagens() {
        return repository.findAll();
    }

    public Mensagem buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Update
    public Mensagem atualizarMensagem(Long id, String novoTexto) {
        Mensagem mensagem = buscarPorId(id);
        if (mensagem != null) {
            mensagem.setTexto(novoTexto);
            return repository.save(mensagem);
        }
        return null;
    }

    // Delete
    public boolean removerMensagem(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}

