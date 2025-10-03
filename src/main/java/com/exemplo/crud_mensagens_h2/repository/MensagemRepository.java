package com.exemplo.crud_mensagens_h2.repository;


import com.exemplo.crud_mensagens_h2.model.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}
