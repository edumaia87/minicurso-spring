package com.ifmg.usuarios.service;

import com.ifmg.usuarios.domain.Usuario;
import com.ifmg.usuarios.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SalvarUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void salvarUsuario(String nome, Long cpf, LocalDate dataDeNascimento) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setCpf(cpf);
        usuario.setDataDeNascimento(dataDeNascimento);
        usuario.setDataDeCriacao(LocalDateTime.now());

        usuarioRepository.save(usuario);
    }
}